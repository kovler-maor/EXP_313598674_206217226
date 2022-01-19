public class LinkedListNodeOfLinkedLists {
    public DoublyLinkedList doublyLinkedList;
    public LinkedListNodeOfLinkedLists next;
    public LinkedListNodeOfLinkedLists prev;

    public LinkedListNodeOfLinkedLists(DoublyLinkedList doublyLinkedList)
    {
        this.doublyLinkedList = doublyLinkedList;
        this.next = null;
        this.prev = null;
    }
}
