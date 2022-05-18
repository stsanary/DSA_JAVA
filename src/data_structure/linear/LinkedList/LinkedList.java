package data_structure.linear.LinkedList;

/*public class LinkedList {
    Node head;

    public LinkedList(){
        head = null;
    }

    public void addNode(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(data));
        }
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("Linkedlist is empty");
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                System.out.print(String.valueOf(temp.getData()) + " >> ");
                temp = temp.getNext();
            }
            System.out.println(String.valueOf(temp.getData()));
        }
    }
}*/
public class LinkedList<T>{
    private Node<T> head;
    private int count;

    public LinkedList() {
       head=null;
       count=0;
    }
    // add


    public void addFront(T data){
        if(head == null)
        head= new Node<>(data);
        else{
            Node<T> temp = new Node<>(data);
            temp.setNext(head);
                head = temp;
            }
        count++;
        }

    public void add(T data, int index){
        if(index>count && index<0){
            System.out.println("invalid index");
        }
        else {
            if (index == 0) addFront(data);
            else if (head != null) {
                Node<T> temp = head;
                Node before= null;
                for (int i = 0; i < index; i++) {
                    before=temp;
                    temp = temp.getNext();
                }
                Node New = new Node<>(data);
                before.setNext(New);
                New.setNext(temp);
            }
            else System.out.println("Invalid index");
        }
        count++;
    }

    public void addLast(T data){
        if(head == null)
            head= new Node<>(data);
        else{
            Node<T> temp= head;
            while(temp.getNext() != null){
                temp= temp.getNext();
            }
            temp.setNext(new Node<>(data));
        }
        count++;
    }

    //get

    public T getFront(){
        if(head == null)
            return null;
        else
        return head.getData();
    }

    public T get(int index) {
        if (index < count && index >= 0) {
                if (head == null) return getFront();
                else {
                    Node<T> temp = head;
                    for (int i = 0; i < index; i++) {
                        temp = temp.getNext();
                    }
                    return temp.getData();
                }
        }
        else{
            System.out.println("Invalid input");
            return null;
        }
    }

    public T getLast(){
        if (head == null) return null;
        else{
            Node<T> temp= head;
            while(temp.getNext() != null){
                temp= temp.getNext();
            }
            return temp.getData();
        }
    }

    // remove

    public void removeFront(){
        if(head != null){
            head=head.getNext();
        }
        count--;
    }

    public void remove(int index){
        if(index>=0 && index<count){
            if(head!=null){
                Node<T> temp= head;
                Node<T> beforetemp = null;
                for (int i =0; i<index; i++){
                    beforetemp= temp;
                    temp=temp.getNext();
                }
                beforetemp.setNext(temp.getNext());
            }
        }
        count--;
    }

    public void removeLast(){
        if (head== null) ;
        else {
            Node<T> temp = head.getNext();
            Node<T> secondLast= null;
            while(temp.getNext()!= null){
                secondLast=temp;
                temp=temp.getNext();
            }
            secondLast.setNext(null);

        }
        count--;
    }


//print

    public void printLinkedList(){
        if (head == null)
            System.out.println("Empty LinkedList");
        else{
            Node temp= head;
            while(temp.getNext() != null){
                System.out.print(String.valueOf(temp.getData()) + " >> ");
                temp=temp.getNext();
            }
            System.out.println(String.valueOf(temp.getData()));
        }
    }
    // length

    public int getLength(){
        return count;
    }
}
