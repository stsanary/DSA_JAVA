package data_structure.linear.Stack;

public class Stack<T> {
    private Node<T> head;
    private int count;

    public Stack(){
        head= null;
        count= 0;
    }

    public void push(T data){
        if(head==null){
           head= new Node<T>(data);
        }
        else{
            Node temp = new Node<>(data);
            temp.setNext(head);
            head=temp;
        }
        count++;
    }

    public void pop(){
        if (head == null){
            System.out.println("empty stack");
        }
        else{
            head=head.getNext();
        }
        count--;
    }

    public T getTop(){
        if (head == null){
            System.out.println("empty stack");
            return null;
        }
        else{
            return head.getData();
        }
    }

    public int length(){
        return count;
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return "";
        } else {
            data_structure.linear.Stack.Node<T> temp = head;
            while (temp.getNext() != null) {
                stringBuilder.append(temp.getData()).append(", ");
                temp = temp.getNext();
            }
            stringBuilder.append(temp.getData());
            return stringBuilder.toString();
        }
    }
}
