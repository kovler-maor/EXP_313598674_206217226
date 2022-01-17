public class DoublyLinkedList
{
     public LinkedListNode head;
     public LinkedListNode tail;
     public int numberOfNodesInList;


     public DoublyLinkedList()
     {
         this.head = null;
         this.tail = null;
         this.numberOfNodesInList = 0;
     }

     public void AddNode(LinkedListNode node)
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
