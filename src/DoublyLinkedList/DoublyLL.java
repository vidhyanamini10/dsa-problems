package DoublyLinkedList;

public class DoublyLL {
    // pointer to start and end of the list
    //The memory address of the first or last node in the list.
    Node head;
    Node tail;

    DoublyLL(){
        this.head = null;
        this.tail = null;
    }
    // inserting at head position
    private void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
          head = newNode;
          tail = newNode;
        }else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    // inserting at tail
    private  void  insertAttail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
        }
    }

    private  void displayForward(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "<->");
           current =  current.next;
        }
        System.out.println("null");
    }

    private  void displayBackward(){
        Node current = tail;

        while(current != null){
            System.out.print(current.data + "<->");
            current =  current.prev;
        }
        System.out.println("null");
    }



    public  static  void main(String[] args){
        DoublyLL dll = new DoublyLL();
        System.out.println("Inserting at head.....");
        dll.insertAtHead(10);
        dll.insertAtHead(20);

        System.out.println("Inserting at tail .....");
        dll.insertAttail(70);
        dll.insertAttail(80);

        dll.displayForward();
        System.out.println("disply in backwords-------");
        dll.displayBackward();

    }
}
