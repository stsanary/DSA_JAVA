package data_structure.non_linear.graphA;

import java.util.ArrayList;

public class GraphA<T> {
    private int vertices;
    private ArrayList<Node> node;


    public void addVertices( int index){
        if(vertices > index) return;
        for(int i=vertices;i<index+1 ;i++){
            node.add(new Node(true));
        }
        vertices=index+1;
    }

    public GraphA(int vertices) {
        this.vertices = vertices;
        node = new ArrayList<Node>();
        for(int i= 0;i<vertices ;i++){
            node.add(new Node(true));
        }
    }

    public void addEdge(int from, int to, int weight) {
        Node New= new Node(weight, to);
        if(to>vertices-1){
            addVertices(to);
        }
        else if (from>vertices-1){
            addVertices(to);
        }
        Node temp = node.get(from);
        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(New);

    }

    public void removeEdge( int from, int to){

        if(from >= node.size()) return;

        Node before = node.get(from);
        Node after = before.getNext();

        while(after.getNext() != null){
            if(after.getTo() == to){
                before.setNext(after.getNext());
                break;
            }
            before = after;
            after = after.getNext();
        }

    }

    public int getCountVerticies(){
        return vertices;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<vertices;i++){
            Node<T> temp = node.get(i).getNext();

            stringBuilder.append(i).append("==>");
            while(temp != null){
                stringBuilder.append(temp.getTo()).append("(").append(temp.getWeight()).append(")");
                temp = temp.getNext();
                if(temp != null){
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
