

/*public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.printLinkedList();

        for(int i=0;i<10;i++){
            linkedList.addNode(i);
        }

        linkedList.printLinkedList();
    }
}*/

import data_structure.non_linear.graph.Graph;
import data_structure.non_linear.graphA.GraphA;

public class Main
{
    public static void main(String[] args){
        /*LinkedList ln= new LinkedList();

        ln.printLinkedList();

        for (char i='a';i<'z'; i++)
        {
            ln.addLast(i);
        }

        ln.printLinkedList();
//add
        System.out.println("Add front");
        Scanner sc = new Scanner(System.in);
        char add= sc.next().charAt(0);
        ln.addFront(add);
        ln.printLinkedList();

        System.out.println("Add back");
        add= sc.next().charAt(0);
        ln.addLast(add);
        ln.printLinkedList();

        System.out.println("Add index");
        add= sc.next().charAt(0);
        int index=sc.nextInt();
        ln.add(index, add);
        ln.printLinkedList();

 //remove
        System.out.println("remove front");
        ln.removeFront();
        ln.printLinkedList();

        System.out.println("remove back");
        ln.removeLast();
        ln.printLinkedList();

        System.out.println("Remove index");
        index=sc.nextInt();
        ln.remove(index);
        ln.printLinkedList();

  //get
        System.out.println("get front");
        System.out.println(ln.getFront());

        System.out.println("get last");
        System.out.println(ln.getLast());

        System.out.println("get index");
        index= sc.nextInt();
        System.out.println(ln.get(index));

    // count
        System.out.println("length of linked list : " + ln.getLength());


        //// queue test
        Queue<Integer> queue = new Queue<>();
        System.out.println("start");
        System.out.println(queue.length());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.enqueue(23);
        System.out.println(queue.toString());
        queue.enqueue(3);
        System.out.println(queue.toString());
        queue.enqueue(5);
        System.out.println(queue.toString());
        queue.enqueue(43);
        System.out.println(queue.toString());
        queue.enqueue(67);
        System.out.println(queue.toString());
        queue.enqueue(87);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.enqueue(546);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        System.out.println("end");



        // test stack
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("start");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.getTop());
        stack.push(23);
        System.out.println(stack.toString());
        stack.push(3);
        System.out.println(stack.toString());
        stack.push(5);
        System.out.println(stack.toString());
        stack.push(43);
        System.out.println(stack.toString());
        stack.push(67);
        System.out.println(stack.toString());
        stack.push(87);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.push(546);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("end");

        // test doubly linked
        DoublyLinkedList<Integer> ln= new DoublyLinkedList<>();
        System.out.println("Start");
        ln.print();
        ln.addFront(98);
        ln.print();
        System.out.println();
        ln.addFront(88);
        ln.addFront(90);
        ln.addFront(67);
        ln.print();System.out.println();
        ln.addLast(44);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        ln.addFromFrontAt(3,56);
        ln.print();System.out.println();
        ln.addFromLastAt(2,11);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        System.out.println(ln.getFront());
        System.out.println(ln.getLast());
        System.out.println(ln.getFromFrontAt(3));
        System.out.println(ln.getFromLastAt(2));
        System.out.println("reverse");
        ln.printReverse();System.out.println();
        ln.removeFront();
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        ln.removeLast();
        ln.print();System.out.println();
        ln.removeFromFrontAt(3);
        ln.print();System.out.println();
        ln.removeFromLastAt(1);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
//////////////////////////////////////////////////////////////////////////////////////
        CircularLinkedList<Integer> ln= new CircularLinkedList<>();
        System.out.println("Start");
        ln.print();
        ln.addFront(98);
        ln.print();
        System.out.println();
        ln.addFront(88);
        ln.addFront(90);
        ln.addFront(67);
        ln.print();System.out.println();
        ln.addLast(44);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        ln.addAt(3,56);
        ln.print();System.out.println();
        System.out.println(ln.getSize());
        ln.addAt(5,11);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        System.out.println(ln.getFront());
        System.out.println(ln.getLast());
        System.out.println(ln.getAt(3));
        System.out.println(ln.getAt(5));
        System.out.println("reverse");
        ln.printReverse();System.out.println();
        ln.removeFront();
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());
        ln.removeLast();
        ln.print();System.out.println();
        ln.removeAt(3);
        ln.print();System.out.println();
        ln.removeAt(5);
        ln.print();System.out.println();
        System.out.println("length:"+ ln.getSize());


        /////// adjacency matrix//////
        GraphM g = new GraphM(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        System.out.print(g.toString());

        g.removeEdge(2, 3);
        System.out.print(g.toString());*/

        //////////////////////////////////////



        //g.removeEdge(10, 5);





        // Printing the graph
       // System.out.println("Graph:\n"
                //+ g.toString());
       // System.out.println(g.getCountVerticies());


        Graph m= new Graph();
        m.addVertices;

    }
}