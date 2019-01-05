public class BlockNode implements SNode{

    Node parent;
    SNode kid = null;

    BlockNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public void eval() {
        if (kid != null) {
            kid.eval();
        }
    }

    @Override
    public void setNextSNode(SNode node) {
        kid = node;
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
        return kid != null;
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<BlockNode> {}");
        if (kid != null) {
            kid.print(tabs + 1);
        }
    }
}
