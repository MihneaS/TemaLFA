import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;	

%%
 
%class Parser
%standalone
%line
%init{
        root = new MainNode();
        current_snode = new SequenceNode(root);
        root.setNextSNode(current_snode);
%init}

%{
   enum State {
        NO_STATE, INITIALIZATION, ATRIBUTION
    }

    enum StatementState {
        NO_STATE, IF_START, IF_C, IF_T, IF_O, WHILE_START, WHILE_C, WHILE_B, CONDITION
    }

    TreeMap<String, Integer> var_to_value = new TreeMap<String, Integer>();
    Stack<ValNode> valNodes = new Stack<ValNode>();
    MainNode root;
    SNode current_snode;
    Expr current_expr;
    Stack<Expr> past_exprs = new Stack<Expr>();
    State state = State.INITIALIZATION;
    StatementState stmState = StatementState.NO_STATE;
    Stack<StatementState> past_stmStates = new Stack<StatementState>();

    void init_var(String new_var) {
        var_to_value.put(new_var, null);
    }
    void on_new_int(String new_int) {
        on_anode(new IntNode(Integer.parseInt(new_int)));
    }

    void on_new_var(String new_var) {
        if (state == State.INITIALIZATION) {
            init_var(new_var);
        } else {
            VariableNode varNode = new VariableNode(var_to_value, new_var);
            if (state == State.NO_STATE && stmState == StatementState.NO_STATE) {
                AssignmentNode assNode = new AssignmentNode(current_snode, varNode);
                varNode.setParent(assNode);
                current_expr = assNode;
                current_snode.setNextSNode(assNode);
                state = State.ATRIBUTION;
            } else {
                on_anode(varNode);
            }
        }
    }

    void on_bnode(ValNode node) {
        ValNode to_be_pushed = null;
        if (current_expr instanceof BracketNode) {
            to_be_pushed = node;
        } else {
            /*if (current_expr instanceof PlusNode) {
                PlusNode pNode = (PlusNode) current_expr;
                current_expr = (Expr) pNode.getParent();
                pNode.kid_right = node;
                to_be_pushed = pNode;
            } else if (current_expr instanceof DivNode) {
                DivNode dNode = (DivNode) current_expr;
                current_expr = (Expr) dNode.getParent();
                dNode.kid_right = node;
                to_be_pushed = dNode;
            }
            if (!(current_expr instanceof AssignmentNode ||
                    current_expr instanceof BracketNode)) {
                do {
                    current_expr = (Expr) current_expr.getParent();
                } while (!(current_expr instanceof AssignmentNode ||
                        current_expr instanceof BracketNode));
                to_be_pushed = current_expr.getLastANode();
            }*/
        }
        if (to_be_pushed == null) {
            System.err.println("error in on_bnode: to_be_pushed is null");
            System.exit(1);
        }
        valNodes.push(to_be_pushed);
    }

    void on_anode(ValNode node) {
        ValNode to_be_pushed = null;
        if (current_expr instanceof AssignmentNode ||
                current_expr instanceof BracketNode) {
            to_be_pushed = node;
        } else {
            if (current_expr instanceof PlusNode) {
                PlusNode pNode = (PlusNode) current_expr;
                current_expr = (Expr) pNode.getParent();
                pNode.kid_right = node;
                to_be_pushed = pNode;
            } else if (current_expr instanceof DivNode) {
                DivNode dNode = (DivNode) current_expr;
                current_expr = (Expr) dNode.getParent();
                dNode.kid_right = node;
                to_be_pushed = dNode;
            } else if (current_expr instanceof GreaterNode) {
                GreaterNode grNode = (GreaterNode) current_expr;
                current_expr = (Expr) grNode.getParent();
                grNode.kid_right = node;
                to_be_pushed = grNode;
            }
            if (!(current_expr instanceof AssignmentNode ||
                    current_expr instanceof BracketNode)) {
                do {
                    current_expr = (Expr) current_expr.getParent();
                } while (!(current_expr instanceof AssignmentNode ||
                        current_expr instanceof BracketNode));
                to_be_pushed = current_expr.getLastNode();
            }
        }
        if (to_be_pushed == null) {
            System.err.println("error in on_anode: to_be_pushed is null");
            System.exit(1);
        }
        valNodes.push(to_be_pushed);
    }

    void on_if() {
        IfNode ifNode = new IfNode(current_snode);
        current_snode.setNextSNode(ifNode);
        current_snode = ifNode;
        past_stmStates.push(stmState);
        stmState = StatementState.IF_START;
    }

    void on_plus() {
        ValNode anode = valNodes.pop();
        PlusNode pNode = new PlusNode(current_expr);
        pNode.kid_left = anode;
        anode.setParent(pNode);
        current_expr.setNextNode(pNode);
        current_expr = pNode;
    }

    void on_greater() {
        ValNode anode = valNodes.pop();
        GreaterNode grNode = new GreaterNode(current_expr);
        grNode.kid_left = anode;
        current_expr.setNextNode((grNode));
        current_expr = grNode;
    }

    void on_bracket_open() {
        if (stmState == StatementState.IF_START) {
            past_stmStates.push(stmState);
            stmState = StatementState.CONDITION;
            BracketNode brNode = new BracketNode(current_snode);
            ((IfNode)current_snode).condition = brNode;
            current_expr = brNode;
        } else if (stmState == StatementState.WHILE_START) {
            // TODO
        } else {
            if (stmState == StatementState.CONDITION) {
                past_stmStates.push(stmState);
                stmState = StatementState.CONDITION;
            }
            past_exprs.push(current_expr);
            current_expr = new BracketNode();
        }
    }

    void on_bracket_close() {
        if (stmState == StatementState.CONDITION) {
            stmState = past_stmStates.pop();
            ValNode valNode = valNodes.pop();
            if (stmState == StatementState.IF_START) {
                stmState = StatementState.IF_T;
                ((BracketNode)((IfNode)current_snode).condition).kid = valNode;
            } else if (stmState == StatementState.WHILE_START) {
                // TODO;
            }
        }
        // assert(current_expr instaceof BracketNode && current_expr.isFullRecv())
        valNodes.push((ValNode) current_expr);
        if ( !(current_snode instanceof  IfNode) /*|| !(current_snode instanceof WhileNode)*/ || !past_exprs.empty())
            current_expr = past_exprs.pop();
    }

    void on_block_open() {
        if (stmState == StatementState.IF_T) {
            BlockNode blNode = new BlockNode(current_snode);
            ((IfNode) current_snode).then = blNode;
            SequenceNode sqNode = new SequenceNode(blNode);
            blNode.setNextSNode(sqNode);
            current_snode = sqNode;
            past_stmStates.push(stmState);
            stmState = StatementState.NO_STATE;
        } else if (stmState == StatementState.IF_O) {
            BlockNode blNode = new BlockNode(current_snode);
            ((IfNode) current_snode).otherwise = blNode;
            SequenceNode sqNode = new SequenceNode(blNode);
            blNode.setNextSNode(sqNode);
            current_snode = sqNode;
            past_stmStates.push(stmState);
            stmState = StatementState.NO_STATE;
        }
    }

    void on_block_close() { //TODO if in if si while in while si combinate
        stmState = past_stmStates.pop();
        if (stmState == StatementState.IF_T) {
            stmState = StatementState.IF_O;
            // assert(current_snode instanceof SequenceNode);
            Node snode_parent = current_snode.getParent();
            Node snode_gparent = snode_parent.getParent();
            if (snode_gparent instanceof IfNode) {
                ((BlockNode)((IfNode) snode_gparent).then).kid = null;
                current_snode = (SNode) snode_gparent;
            } else {
                if (snode_gparent instanceof BlockNode) {
                    ((BlockNode) snode_gparent).kid = ((SequenceNode) snode_parent).kid_left;
                } else { //assert(snode_gparent instanceof SequenceNode)
                    ((SequenceNode)snode_gparent).kid_right = ((SequenceNode) current_snode).kid_left;
                }
                while (!(snode_gparent instanceof  IfNode)) {
                    snode_gparent = snode_gparent.getParent();
                }
                current_snode = (SNode) snode_gparent;
            }
        } else if (stmState == StatementState.IF_O) {
            // assert(current_snode instanceof SequenceNode);
            Node snode_parent = current_snode.getParent();
            Node snode_gparent = snode_parent.getParent();
            if (snode_gparent instanceof IfNode) {
                ((BlockNode)((IfNode) snode_gparent).otherwise).kid = null;
            } else {
                if (snode_gparent instanceof BlockNode) {
                    ((BlockNode) snode_gparent).kid = ((SequenceNode) snode_parent).kid_left;
                } else { //assert(snode_gparent instanceof SequenceNode)
                    ((SequenceNode)snode_gparent).kid_right = ((SequenceNode) snode_parent).kid_left;
                }
            }
            stmState = past_stmStates.pop();
            while(!(snode_gparent instanceof IfNode)) {
                snode_gparent = snode_gparent.getParent();
            }
            IfNode ifNode = (IfNode) snode_gparent;
            current_snode = (SNode) ifNode.getParent();
            if (current_snode instanceof SequenceNode) {   // todo wut?
                SNode new_seq = new SequenceNode(current_snode);
                current_snode.setNextSNode(new_seq);
                current_snode = new_seq;
            }
        }
    }

    void on_true() {
        BoolNode bNode = new BoolNode(true);
        on_bnode(bNode);
    }

    void on_false() {
        BoolNode bNode = new BoolNode(false);
        on_bnode(bNode);
    }

    void on_div() {
        ValNode anode = valNodes.pop();
        DivNode dNode = new DivNode();
        if (anode instanceof PlusNode) {
            dNode.kid_left = ((PlusNode) anode).kid_right;
            ((PlusNode) anode).kid_right = dNode;
            anode.setParent(current_expr);
            dNode.setParent(anode);
            current_expr.setNextNode(anode);
            current_expr = dNode;
        } else {
            dNode.kid_left = anode;
            dNode.setParent(current_expr);
            anode.setParent(dNode);
            current_expr.setNextNode(dNode);
            current_expr = dNode;
        }
    }

    void on_end_cmd(String str) {
        if (state == State.ATRIBUTION) {
            ValNode anode = valNodes.pop();
            current_expr.setNextNode(anode);
            anode.setParent(current_expr);
            SNode new_seq = new SequenceNode(current_snode);
            current_snode.setNextSNode(new_seq);
            current_snode = new_seq;

        }
        state = State.NO_STATE;
    }

    void finish() {
        current_snode = (SNode) current_snode.getParent();
        ((SequenceNode) current_snode.getParent()).kid_right = ((SequenceNode) current_snode).kid_left;
        root.print(0);
        root.eval();
        print_vars();

    }

    void print_vars() {
        for (Map.Entry<String, Integer> entry: var_to_value.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            String val_str;
            if (val == null) {
                val_str = "null";
            } else {
                val_str = Integer.toString(val);
            }
            System.out.println(key + "=" + val_str);
        }
    }
%}

%eof{
	finish();
%eof}

integer = [1-9][0-9]* | 0
str = [a-z][a-z]*
Aval = integer
BVal = True | False
cmdEnd = ";"
%%

int {}

"+" {
    System.out.println("found " + yytext());
    on_plus();
}

"/" {
    System.out.println("found " + yytext());
    on_div();
}

">" {
    System.out.println("found " + yytext());
    on_greater();
}

"(" {
    System.out.println("found " + yytext());
    on_bracket_open();
}

")" {
    System.out.println("found " + yytext());
    on_bracket_close();
}

"{" {
    System.out.println("found " + yytext());
    on_block_open();
}

"}" {
    System.out.println("found " + yytext());
    on_block_close();
}

"if" {
    System.out.println("found " + yytext());
    on_if();
}

"else" {
}

"true" {
    System.out.println("found " + yytext());
    on_true();
}

"false" {
    System.out.println("found " + yytext());
    on_false();
}

{str} {
    System.out.println("found var " + yytext());
    on_new_var(yytext());
}

{integer} {
    System.out.println("found aval " + yytext());
    on_new_int(yytext());
}

{cmdEnd} {
    System.out.println("found endcmd " + yytext());
    on_end_cmd(yytext());
}

. {}


