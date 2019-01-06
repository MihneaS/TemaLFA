public class DivNode implements ValNode, Expr, TwoOperands {

    Node parent;
    ValNode kid_left;
    ValNode kid_right;
    int priority = 8;

    DivNode() {}

    DivNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public int getVal() {
        int b = kid_right.getVal();
        if (b == 0) {
            //TODO trateaza exceptie
        }
        return kid_left.getVal() / b;
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
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
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
        System.out.println("<DivNode> /");
        kid_left.print(tabs+1);
        kid_right.print(tabs+1);
    }

    @Override
    public ValNode getLeftNode() {
        return kid_left;
    }

    @Override
    public void setLeftNode(ValNode node) {
        kid_left = node;
    }

    @Override
    public ValNode getRightNode() {
        return kid_right;
    }

    @Override
    public void setRightNode(ValNode node) {
        kid_right = node;
    }
}
