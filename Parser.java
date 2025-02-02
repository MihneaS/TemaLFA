/* The following code was generated by JFlex 1.7.0 */

import java.util.Map;
import java.util.Stack;
import java.util.HashMap;	


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Parser.jflex</tt>
 */
class Parser {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\32\1\32\1\32\1\32\23\0\1\21\4\0\1\22\1\0"+
    "\1\23\1\24\1\0\1\16\3\0\1\17\1\2\11\1\1\0\1\15"+
    "\2\0\1\20\7\0\1\0\15\0\1\0\14\0\1\12\3\3\1\7"+
    "\1\27\1\3\1\31\1\4\2\3\1\13\1\3\1\5\3\3\1\10"+
    "\1\14\1\6\1\11\1\3\1\30\3\3\1\25\1\0\1\26\7\0"+
    "\1\32\u1fa2\0\1\32\1\32\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\4\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\1\12\1\13\1\14\2\3\1\15"+
    "\1\3\1\16\2\3\1\17\2\3\1\1\4\3\1\20"+
    "\2\3\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\33\0\121\0\154\0\207\0\242"+
    "\0\33\0\33\0\33\0\33\0\33\0\275\0\33\0\33"+
    "\0\33\0\33\0\330\0\363\0\33\0\u010e\0\121\0\u0129"+
    "\0\u0144\0\33\0\u015f\0\u017a\0\121\0\u0195\0\u01b0\0\u01cb"+
    "\0\u01e6\0\121\0\u0201\0\u021c\0\121\0\121";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\5\5\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\5\1\25\34\0"+
    "\2\3\33\0\12\5\12\0\3\5\4\0\2\5\1\26"+
    "\7\5\12\0\1\27\2\5\4\0\5\5\1\30\4\5"+
    "\12\0\3\5\4\0\10\5\1\31\1\5\12\0\3\5"+
    "\23\0\1\32\13\0\7\5\1\33\2\5\12\0\3\5"+
    "\4\0\12\5\12\0\2\5\1\34\4\0\3\5\1\35"+
    "\6\5\12\0\3\5\4\0\6\5\1\36\3\5\12\0"+
    "\3\5\4\0\11\5\1\37\12\0\3\5\4\0\10\5"+
    "\1\40\1\5\12\0\3\5\4\0\1\5\1\41\10\5"+
    "\12\0\3\5\4\0\4\5\1\42\5\5\12\0\3\5"+
    "\4\0\4\5\1\35\5\5\12\0\3\5\4\0\11\5"+
    "\1\43\12\0\3\5\4\0\10\5\1\44\1\5\12\0"+
    "\3\5\4\0\4\5\1\45\5\5\12\0\3\5\4\0"+
    "\4\5\1\46\5\5\12\0\3\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[567];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\4\1\5\11\1\1\4\11"+
    "\2\1\1\11\4\1\1\11\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[38];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    enum State {
        NO_STATE, INITIALIZATION, ATRIBUTION
    }

    enum StatementState {
        NO_STATE, IF_START, IF_T, IF_O, WHILE_START, WHILE_B, CONDITION
    }

    HashMap<String, Integer> var_to_value = new HashMap<String, Integer>();
    Stack<ValNode> aValNodes = new Stack<ValNode>();
    Stack<ValNode> bValNodes = aValNodes;//new Stack<ValNode>();
    MainNode root;
    SNode current_snode;
    Stack<Expr> exprs = new Stack<Expr>();
    Stack<Expr> root_exprs = new Stack<Expr>();
    Stack<Stack<Expr>> past_exprs = new Stack<>();
    State state = State.INITIALIZATION;
    StatementState stmState = StatementState.NO_STATE;
    Stack<StatementState> past_stmStates = new Stack<StatementState>();

    void new_expr_env(Expr root) {
        past_exprs.push(exprs);
        root_exprs.push(root);
        exprs = new Stack<>();
    }

    void restore_expr_env() {
        exprs = past_exprs.pop();
        root_exprs.pop();
    }

    void clear_expr_env() {
        past_exprs.clear();
        root_exprs.clear();
        exprs = new Stack<>();
    }

    Expr get_last_expr() {
        if (!exprs.empty()) {
            return exprs.pop();
        } else {
            return root_exprs.peek();
        }
    }

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
                on_assignment(varNode);
            } else {
                on_anode(varNode);
            }
        }
    }

    void on_assignment(VariableNode var) {
        AssignmentNode assNode = new AssignmentNode(current_snode, var);
        var.setParent(assNode);
        new_expr_env(assNode);
        current_snode.setNextSNode(assNode);
        state = State.ATRIBUTION;
    }

    void on_end_cmd(String str) {
        if (state == State.ATRIBUTION) {
            ValNode anode = aValNodes.pop();
            Expr expr = get_last_expr();
            expr.setNextNode(anode);
            anode.setParent(expr);
            SNode new_seq = new SequenceNode(current_snode);
            current_snode.setNextSNode(new_seq);
            current_snode = new_seq;
            clear_expr_env();
        }
        state = State.NO_STATE;
    }

    void on_bnode(ValNode node) {
        on_valNode(node, bValNodes);
    }

    void on_anode(ValNode node) {
        on_valNode(node, aValNodes);
    }

    void on_valNode(ValNode node, Stack<ValNode> dest) {
        ValNode to_be_pushed = null;
        if (exprs.empty() || exprs.peek() instanceof OneOperand) {
            to_be_pushed = node;
        } else {
            Expr expr = exprs.pop();
            if (expr instanceof TwoOperands) {
                TwoOperands texpr = (TwoOperands) expr;
                expr = (Expr) texpr.getParent();
                texpr.setRightNode(node);
                to_be_pushed = (ValNode) texpr;
            }
            if (!( expr instanceof OneOperand)) {
                do {
                    expr = (Expr) get_last_expr();
                } while (!(expr instanceof OneOperand));
                to_be_pushed = expr.getLastNode();
                exprs.push(expr);
            }
        }
        if (to_be_pushed == null) {
            System.err.println("error in on_anode: to_be_pushed is null");
            System.exit(1);
        }
        dest.push(to_be_pushed);
    }

    void on_if() {
        IfNode ifNode = new IfNode(current_snode);
        current_snode.setNextSNode(ifNode);
        current_snode = ifNode;
        past_stmStates.push(stmState);
        stmState = StatementState.IF_START;
    }

    void on_while() {
        WhileNode whNode = new WhileNode(current_snode);
        current_snode.setNextSNode(whNode);
        current_snode = whNode;
        past_stmStates.push(stmState);
        stmState = StatementState.WHILE_START;
    }

    void on_two_op(TwoOperands op, ValNode lastVal) {
        Expr expr = get_last_expr();
        op.setParent(expr);
        if (lastVal instanceof TwoOperands &&
                op.getPriority() > ((TwoOperands) lastVal).getPriority()) {
            op.setLeftNode(((TwoOperands) lastVal).getRightNode());
            ((TwoOperands) lastVal).setRightNode((ValNode) op);
            lastVal.setParent(expr);
            op.setParent(lastVal);
            expr.setNextNode(lastVal);
            exprs.push(op);
        } else {
            op.setNextNode(lastVal);
            lastVal.setParent(op);
            expr.setNextNode((ValNode) op);
            exprs.push(op);
        }
    }

    void on_plus() {
        ValNode aNode = aValNodes.pop();
        PlusNode pNode = new PlusNode();
        on_two_op(pNode, aNode);
    }

    void on_div() {
        ValNode aNode = aValNodes.pop();
        DivNode dNode = new DivNode();
        on_two_op(dNode, aNode);
    }

    void on_greater() {
        ValNode aNode = aValNodes.pop();
        GreaterNode grNode = new GreaterNode();
        on_two_op(grNode, aNode);
    }

    void on_not() {
        Expr expr = get_last_expr();
        NotNode nNode = new NotNode(expr);
        expr.setNextNode(nNode);
        exprs.push(expr);
        new_expr_env(nNode);
    }

    void on_and() {
        ValNode bNode = bValNodes.pop();
        AndNode andNode = new AndNode();
        on_two_op(andNode, bNode);
    }

    void on_bracket_open() {
        if (stmState == StatementState.IF_START) {
            past_stmStates.push(stmState);
            stmState = StatementState.CONDITION;
            BracketNode brNode = new BracketNode(current_snode);
            ((IfNode)current_snode).condition = brNode;
            new_expr_env(brNode);
        } else if (stmState == StatementState.WHILE_START) {
            past_stmStates.push(stmState);
            stmState = StatementState.CONDITION;
            BracketNode brNode = new BracketNode(current_snode);
            ((WhileNode)current_snode).condition = brNode;
            new_expr_env(brNode);
        } else {
            if (stmState == StatementState.CONDITION) {
                past_stmStates.push(stmState);
                stmState = StatementState.CONDITION;
            }
            Expr root = root_exprs.peek();
            if (root instanceof NotNode) {
                BracketNode brNode = new BracketNode(root);
                ((NotNode) root).kid = brNode;
                root_exprs.pop();
                root_exprs.push(brNode);
            } else {
                new_expr_env(new BracketNode());
            }
        }
    }

    void on_bracket_close() {
        if (stmState == StatementState.CONDITION) {
            stmState = past_stmStates.pop();
            ValNode valNode = aValNodes.pop();
            if (stmState == StatementState.IF_START) {
                stmState = StatementState.IF_T;
                //((BracketNode)((IfNode)current_snode).condition).kid = valNode;
                Expr expr = get_last_expr();
                expr.setNextNode(valNode);
                clear_expr_env();
                return;
            } else if (stmState == StatementState.WHILE_START) {
                stmState = StatementState.WHILE_B;
                Expr expr = get_last_expr();
                expr.setNextNode(valNode);
                clear_expr_env();
                return;
            }
        }
        // assert(current_expr instaceof BracketNode && current_expr.isFullRecv())
        Expr expr = get_last_expr();
        Node expr_parent = expr.getParent();
        if (expr_parent != null && expr_parent instanceof NotNode) {
            aValNodes.push((ValNode) expr.getParent());
        } else {
            aValNodes.push((ValNode) expr);
        }
        restore_expr_env();
        //if ( !(current_snode instanceof  IfNode) /*|| !(current_snode instanceof WhileNode)*/ || !past_exprs.empty())
        //   exprs.push(past_exprs.pop());
    }

    void on_block_open() {
        BlockNode blNode = null;
        if (stmState == StatementState.IF_T) {
            blNode = new BlockNode(current_snode);
            ((IfNode) current_snode).then = blNode;
        } else if (stmState == StatementState.IF_O) {
            blNode = new BlockNode(current_snode);
            ((IfNode) current_snode).otherwise = blNode;
        } else if (stmState == StatementState.WHILE_B) {
            blNode = new BlockNode(current_snode);
            ((WhileNode) current_snode).body = blNode;
        }
        SequenceNode sqNode = new SequenceNode(blNode);
        blNode.setNextSNode(sqNode);
        current_snode = sqNode;
        past_stmStates.push(stmState);
        stmState = StatementState.NO_STATE;
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
        } else if (stmState == StatementState.WHILE_B) {
            // assert(current_snode instanceof SequenceNode);
            Node snode_parent = current_snode.getParent();
            Node snode_gparent = snode_parent.getParent();
            if (snode_gparent instanceof WhileNode) {
                ((BlockNode)((WhileNode) snode_gparent).body).kid = null;
            } else {
                if (snode_gparent instanceof BlockNode) {
                    ((BlockNode) snode_gparent).kid = ((SequenceNode) snode_parent).kid_left;
                } else { //assert(snode_gparent instanceof SequenceNode)
                    ((SequenceNode)snode_gparent).kid_right = ((SequenceNode) snode_parent).kid_left;
                }
            }
            stmState = past_stmStates.pop();
            while(!(snode_gparent instanceof WhileNode)) {
                snode_gparent = snode_gparent.getParent();
            }
            WhileNode whNode = (WhileNode) snode_gparent;
            current_snode = (SNode) whNode.getParent();
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Parser(java.io.Reader in) {
          root = new MainNode();
        current_snode = new SequenceNode(root);
        root.setNextSNode(current_snode);
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    	finish();

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 19: break;
          case 2: 
            { System.out.println("found aval " + yytext());
    on_new_int(yytext());
            } 
            // fall through
          case 20: break;
          case 3: 
            { System.out.println("found var " + yytext());
    on_new_var(yytext());
            } 
            // fall through
          case 21: break;
          case 4: 
            { System.out.println("found endcmd " + yytext());
    on_end_cmd(yytext());
            } 
            // fall through
          case 22: break;
          case 5: 
            { System.out.println("found " + yytext());
    on_plus();
            } 
            // fall through
          case 23: break;
          case 6: 
            { System.out.println("found " + yytext());
    on_div();
            } 
            // fall through
          case 24: break;
          case 7: 
            { System.out.println("found " + yytext());
    on_greater();
            } 
            // fall through
          case 25: break;
          case 8: 
            { System.out.println("found " + yytext());
    on_not();
            } 
            // fall through
          case 26: break;
          case 9: 
            { System.out.println("found " + yytext());
    on_bracket_open();
            } 
            // fall through
          case 27: break;
          case 10: 
            { System.out.println("found " + yytext());
    on_bracket_close();
            } 
            // fall through
          case 28: break;
          case 11: 
            { System.out.println("found " + yytext());
    on_block_open();
            } 
            // fall through
          case 29: break;
          case 12: 
            { System.out.println("found " + yytext());
    on_block_close();
            } 
            // fall through
          case 30: break;
          case 13: 
            { System.out.print(yytext());
            } 
            // fall through
          case 31: break;
          case 14: 
            { System.out.println("found " + yytext());
    on_if();
            } 
            // fall through
          case 32: break;
          case 15: 
            { System.out.println("found " + yytext());
    on_and();
            } 
            // fall through
          case 33: break;
          case 16: 
            { System.out.println("found " + yytext());
    on_true();
            } 
            // fall through
          case 34: break;
          case 17: 
            { System.out.println("found " + yytext());
    on_false();
            } 
            // fall through
          case 35: break;
          case 18: 
            { System.out.println("found " + yytext());
    on_while();
            } 
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Parser [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Parser scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Parser(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
