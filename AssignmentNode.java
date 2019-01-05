public class AssignmentNode implements SNode, Expr{

    Node parent;
    VariableNode var;
    ValNode val;

    AssignmentNode(Node parent, VariableNode var){
        this.parent = parent;
        this.var = var;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public boolean isFull() {
        return val != null;
    }

    void setVal(ValNode node) {
        val = node;
    }

    @Override
    public void eval() {
        var.setVal(val.getVal());
    }

    @Override
    public void setNextSNode(SNode node) {
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<AssigmentNode> =");
        var.print(tabs+1);
        val.print(tabs+1);
    }

    @Override
    public void setNextNode(ValNode node) {
        val = node;
    }

    @Override
    public ValNode getLastNode() {
        return val;
    }
}
