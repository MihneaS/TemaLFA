public class BracketNode implements ValNode, Expr, OneOperand{

    Node parent;
    ValNode kid;
    int priority;

    public BracketNode() {}

    public BracketNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public void setNextNode(ValNode node) {
        kid = node;
    }

    @Override
    public ValNode getLastNode() {
        return kid;
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
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<BracketNode> ()");
            kid.print(tabs + 1);
    }

    @Override
    public int getVal() {
        return kid.getVal();
    }

    @Override
    public ValNode getValNode() {
        return kid;
    }

    @Override
    public void setValNode(ValNode node) {
        kid = node;
    }
}
