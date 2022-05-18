package data_structure.non_linear.graphA;

public class Node<T> {
    private int weight;
    private Node<T> next;
    private int to;
    private boolean parent;


    public Node(int weight, int to){
        this.to= to;
        this.weight= weight;
        next = null;
        this.parent = false;
    }

    public Node(boolean parent){
        this.to= 0;
        this.weight= 0;
        next = null;
        this.parent = parent;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }
}
