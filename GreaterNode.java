public class GreaterNode implements ValNode, Expr{

    Node parent;
    ValNode kid_left;
    ValNode kid_right;

    GreaterNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public void setNextNode(ValNode node) {
        if (kid_left == null) {
            kid_left = node;
        } else {
            kid_right = node;
        }
    }

    @Override
    public ValNode getLastNode() {
        if (kid_left != null) {
            return  kid_left;
        } else {
            return  kid_right;
        }
    }

    @Override
    public int getVal() {
        if (kid_left.getVal() > kid_right.getVal()) {
            return 1;
        } else {
            return 0;
        }
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
        return false;
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out.println("<GreaterNode> >");
        kid_left.print(tabs+1);
        kid_right.print(tabs+1);
    }
}
