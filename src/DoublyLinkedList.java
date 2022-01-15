public class DoublyLinkedList
{
     public LinkedListNode head;
     public LinkedListNode tail;


     public DoublyLinkedList()
     {
         this.head = null;
         this.tail = null;
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
     }
}
