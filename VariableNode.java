import java.util.TreeMap;

public class VariableNode implements ValNode{

    public TreeMap<String, Integer> var_to_val;
    public String name;
    public Node parent;

    public VariableNode(TreeMap<String, Integer> var_to_val, String name) {
        this.var_to_val = var_to_val;
        this.name = name;
    }

    public VariableNode(TreeMap<String, Integer> var_to_val, Node parent, String name) {
        this(var_to_val, name);
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
        return true;
    }

    public void setVal(Integer newVal) {
        var_to_val.put(name, newVal);
    }

    String getName() {
        return name;
    }

    @Override
    public void print(int tabs) {
        int itabs = tabs;
        while(itabs-- > 0) {
            System.out.print("\t");
        }
        System.out .println("<VariableNode> " + name);
    }

    @Override
    public int getVal() {
        //TODO treat null as error
        return var_to_val.get(name);
    }
}
