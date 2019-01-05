public class IfNode implements SNode{

    Node parent;
    ValNode condition = null;
    SNode then = null;
    SNode otherwise = null;

    public IfNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public void eval() {
        if (condition.getVal() == 1) {
            then.eval();
        } else {
            otherwise.eval();
        }
    }

    @Override
    public void setNextSNode(SNode node) {
        if (then == null) {
            then = node;
        } else {
            otherwise = node;
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
        return condition != null && then != null && otherwise != null;
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<IfNode if>");
        condition.print(tabs+1);
        then.print(tabs+1);
        otherwise.print(tabs+1);
    }
}
