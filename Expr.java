public interface Expr extends Node{
    void setNextNode(ValNode node);
    ValNode getLastNode();
    void setPriority(int priority);
    int getPriority();
}
