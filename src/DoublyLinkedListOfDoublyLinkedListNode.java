public class DoublyLinkedListOfDoublyLinkedListNode {
    public LinkedListNodeOfLinkedLists head;
    public LinkedListNodeOfLinkedLists tail;
    public int numberOfNodesInList;


    public DoublyLinkedListOfDoublyLinkedListNode()
    {
        this.head = null;
        this.tail = null;
        this.numberOfNodesInList = 0;
    }
    public void EmptyList()
    {
        this.head = null;
        this.tail = null;
        this.numberOfNodesInList = 0;
    }

    public void AddNode(LinkedListNodeOfLinkedLists node)
    {
        if(this.head == null)
        {
            this.head = node;
        } else
        {
            this.tail.next = node;
            node.prev = this.tail;
        }
        this.tail = node;
        this.numberOfNodesInList ++;
    }

    public void DeleteNode(LinkedListNode node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        this.numberOfNodesInList --;
    }
}
