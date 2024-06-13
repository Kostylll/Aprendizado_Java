package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int lenght;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }


    }

    public LinkedList(String data) {
        lenght = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista Vazia");
        }else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getHead(){
        if(this.head == null){
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }


    public void getLength(){
        System.out.println("Length: " + this.lenght);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        lenght = 0;
    }

    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        lenght++;
    }

   public Node removeLast(){
        if( lenght == 0) return null;
        Node pre = head;
        Node temp = null;
        while(pre.next != tail){
            pre = pre.next;
        }
       tail = pre;
        tail.next = null;
        return temp;
   }




    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("elemento 2");
        list.append("elemento 3");
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
        System.out.println(list.removeLast());
        list.print();
    }

}
