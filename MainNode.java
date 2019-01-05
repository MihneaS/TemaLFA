public class MainNode implements SNode{

    SNode kid;

    @Override
    public Node getParent() {
        return null;
    }

    @Override
    public void setParent(Node parent) {
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public void eval() {
        kid.eval();
    }

    @Override
    public void setNextSNode(SNode node) {
        setKid(node);
    }

    @Override
    public void print(int tabs) {
        System.out.println("<MainNode>");
        kid.print(1);
    }

    private void setKid(SNode kid) {
        this.kid = kid;
    }
}
