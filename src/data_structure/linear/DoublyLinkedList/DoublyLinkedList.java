package data_structure.linear.DoublyLinkedList;

public class DoublyLinkedList<T>{
    private Node<T> head;
    private Node<T>tail;
    private int count;

    public DoublyLinkedList(){
        head= null;
        tail=null;
        count=0;
    }

   //add

    public void addFront(T data){
        if(head==null){
            head= new Node<>(data);
            tail=head;
        }
        else{
            Node temp= new Node<>(data);
            temp.setPrevious(null);
            temp.setNext(head);
            head.setPrevious(temp);
            head= temp;
        }
        count++;
    }

    public void addFromFrontAt(int index, T data) {
            Node temp = head;
            Node before = null;
            for (int i = 0; i < index; i++) {
                before = temp;
                temp = temp.getNext();
            }
            Node New = new Node<>(data);
            temp.setPrevious(New);
            New.setNext(temp);
            before.setNext(New);
            New.setPrevious(before);
            count++;
    }

    public void addFromLastAt(int index, T data){
            Node<T> temp= tail;
            Node<T> before=null;
            for(int i=0; i<index; i++){
                before=temp;
                temp=temp.getPrevious();
            }
            Node New= new Node<>(data);
            New.setNext(before);
            before.setPrevious(New);
            New.setPrevious(temp);
            temp.setNext(New);
            count++;
    }

    public void addAt( int index, T data) {
        if (index == 0) {
            addFront(data);
        } else if (index == count ) {
            addLast(data);
        } else if (index > count || index < 0) {
            System.out.println("Index out of bounds");
        }else {
            if(index < count/2){
                addFromFrontAt(index, data);
            }else{
                addFromLastAt(count - index , data);
            }
        }
    }

    public void addLast(T data){
        if(head==null){
            tail=new Node<>(data);
            head=tail;
        }
        else{
            Node<T> temp = new Node<>(data);
            temp.setPrevious(tail);
            tail.setNext(temp);
            temp.setNext(null);
            tail=temp;
        }
        count++;
    }

    // get

    public T getFront(){
        if(head==null){
            System.out.println("empty list");
            return null;
        }
        else{
            return head.getData();
        }
    }

    public T getLast(){
        if(head==null){
            System.out.println("empty list");
            return null;
        }
        else{
            return tail.getData();
        }
    }

    public T getFromFrontAt(int index){
            Node<T> temp= head;

            for(int i=0; i<index; i++){
                temp=temp.getNext();
            }

            return temp.getData();
    }

    public T getFromLastAt(int index){
            Node<T> temp= tail;
            for(int i=0; i<index; i++){
                temp=temp.getPrevious();
            }
            return temp.getData();
    }

    public T getAt( int index) {
        if (index == 0) {
           return getFront();
        } else if (index == count-1) {
           return getLast();
        } else if (index >= count || index < 0) {
            System.out.println("Index out of bounds");
            return null;
        }else {
            if(index<=count/2){
                return getFromFrontAt(index);
            }
            else{
                return getFromLastAt(count-index-1);
            }
        }
    }

    //remove

    public void removeFront(){
        if(head==null){
            System.out.println("empty list");
        }
        else if(head==tail){
            head=null;
            tail=null;
            count=0;
        }
        else{
            head= head.getNext();
            head.setPrevious(null);
            count--;
        }

    }

    public void removeLast(){
        if(head==null){
            System.out.println("empty list");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.getPrevious();
            tail.setNext(null);
        }
        count--;
    }

    public void removeFromFrontAt(int index){
            Node temp= head;
            Node before= null;
            for( int i=0; i<index; i++){
                before=temp;
                temp=temp.getNext();
            }
           before.setNext(temp.getNext());
            temp.getNext().setPrevious(before);

            count--;
    }

    public void removeFromLastAt(int index){
            Node temp= tail;
            Node before= null;
            for( int i=0; i<index; i++){
                before=temp;
                temp=temp.getPrevious();
            }
            before.setPrevious(temp.getPrevious());
            temp.getPrevious().setNext(before);

            count--;
    }

    public void removeAt( int index) {
        if (index == 0) {
            removeFront();
        } else if (index == count - 1) {
            removeLast();
        } else if (index >= count || index < 0) {
            System.out.println("Index out of bounds");
        }else if(index<count/2){
            removeFromFrontAt (index);
        }
        else {
            removeFromLastAt(count-index-1);
        }
    }

    public int getSize(){
        return count;
    }

    //print

    public void print(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.getData() + ">" );
                temp=temp.getNext();
            }
        }
    }

    public void printReverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp= tail;
            while(temp!=null){
                System.out.print(temp.getData() + ">" );
                temp=temp.getPrevious();
            }
        }
    }
}

