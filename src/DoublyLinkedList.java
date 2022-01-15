public class DoublyLinkedList
{
     public T head;
     public T tail;
     public int amountOfNodes;
     public int amountOfNodes;


     public DoublyLinkedList()
     {
         this.head = null;
         this.tail = null;
         this.amountOfNodes = 0;
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
         this.amountOfNodes ++;

     }
}
