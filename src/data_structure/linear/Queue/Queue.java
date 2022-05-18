package data_structure.linear.Queue;

public class Queue<T> {
    Node<T> head, tail;
    int count;

    public Queue(){
        head= null;
        tail= null;
        count=0;
    }

    public void enqueue(T data){
        if(head==null){

            head = new Node<T>(data);
            tail = head;
        }
        else{
            Node<T> temp = new Node<T>(data);
            tail.setNext(temp);
            tail=temp;
        }
        count++;
    }

    public void dequeue(){
        if (head==null){
            System.out.println("the queue is empty");
        }
        else {
            head = head.getNext();
            if(head == null){
                tail = null;
            }
            count--;
        }
    }
    public T getFront(){
        if(head == null){
            return null;
        }else{
            return head.getData();
        }
    }

    public int length(){
        if(head==null){
            return 0;
        }
        else return count;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                stringBuilder.append(temp.getData()).append(", ");
                temp = temp.getNext();
            }
            stringBuilder.append(temp.getData());
            return stringBuilder.toString();
        }
    }
}
