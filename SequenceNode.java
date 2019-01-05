public class SequenceNode implements SNode{

    Node parent;
    SNode kid_left;
    SNode kid_right;

    SequenceNode(Node parent) {
        this.parent = parent;
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
        return kid_left != null && kid_right != null;
    }

    private void setKidLeft(SNode node) {
        kid_left = node;
    }
    private void setKidRight(SNode node) {
        kid_right = node;
    }

    @Override
    public void eval() {
        kid_left.eval();
        kid_right.eval();
    }

    @Override
    public void setNextSNode(SNode node) {
        if (kid_left == null) {
            setKidLeft(node);
        } else {
            setKidRight(node);
        }
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<SequenceNode>");
        kid_left.print(tabs+1);
        kid_right.print(tabs+1);
    }
}
