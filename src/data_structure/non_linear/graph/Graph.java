package data_structure.non_linear.graph;

import data_structure.linear.LinkedList.LinkedList;

public class Graph<T,U>{
    private int vertices;
    private LinkedList<NodeP> node;

    public void addVertices(NodeP data){
        node.addLast(data);
        vertices++;
    }

    public void print(){
        System.out.println(node.getFront().getData().getId());
    }
}
