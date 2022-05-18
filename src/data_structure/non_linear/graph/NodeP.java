package data_structure.non_linear.graph;

import data_structure.linear.LinkedList.LinkedList;

class DataP<T>{
    private T id;
    private LinkedList<NodeC> children;

    public DataP( T id){
        this.id=id;
        children =null;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public LinkedList<NodeC> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<NodeC> children) {
        this.children = children;
    }
}

class NodeP<T>{
    DataP data;
    NodeP next;

    public NodeP(){
        data= null;
        next= null;
    }

    public DataP getData() {
        return data;
    }

    public void setData(DataP data) {
        this.data = data;
    }

    public NodeP getNext() {
        return next;
    }

    public void setNext(NodeP next) {
        this.next = next;
    }
}