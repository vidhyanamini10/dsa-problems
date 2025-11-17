package DoublyLinkedList;

public class Node {
    int data;
    // prev and next don't store data; they store the memory address of the element , just arrowing
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null; // very initial node prev pointer is pointing to null
        this.next= null; // at last node next pointer is pointing to null
    }
}
