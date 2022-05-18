package data_structure.non_linear.graph;

class DataC<T,U>{
    private T weight;
    private U to;

    public DataC( T weight, U to){
        this.weight= weight;
        this.to= to;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public U getTo() {
        return to;
    }

    public void setTo(U to) {
        this.to = to;
    }
}
public class NodeC<T,U> {
    private DataC <T,U> data;
    private NodeC next;

    public NodeC(){
        data= null;
        next= null;
    }

    public DataC<T, U> getData() {
        return data;
    }

    public void setData(DataC<T, U> data) {
        this.data = data;
    }

    public NodeC getNext() {
        return next;
    }

    public void setNext(NodeC next) {
        this.next = next;
    }
}
