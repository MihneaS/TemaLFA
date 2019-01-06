public class WhileNode implements SNode{

    Node parent;
    ValNode condition = null;
    SNode body = null;

    WhileNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public void eval() {
        while (condition.getVal() == 1) {
            body.eval();
        }
    }

    @Override
    public void setNextSNode(SNode node) {
        body = node;
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
        System.out .println("<WhileNode> while");
        condition.print(tabs+1);
        body.print(tabs+1);
    }
}
