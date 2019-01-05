public class BoolNode implements ValNode{

    Node parent;
    int val;

    BoolNode (boolean val) {
        if (val) {
            this.val = 1;
        } else {
            this.val = 0;
        }
    }

    @Override
    public int getVal() {
        return val;
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
        return true;
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        String name;
        if (val == 1) {
            name = "true";
        } else {
            name = "false";
        }
        System.out .println("<BoolNode> " + name);
    }
}
