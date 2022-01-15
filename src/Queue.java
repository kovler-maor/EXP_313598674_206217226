/*Implementation of Queue*/
public class Queue
{
    public LinkedListNode Head;
    public LinkedListNode Tail;

    // Constructor
    Queue()
    {
        this.Head = null;
        this.Tail = null;
    }

    // Enqueqe - putting new nodes in the queue
    public void Enqueue(LinkedListNode node)
    {
        if(this.Tail == null)
        {
            this.Tail = node;
        }
        this.Head = node;

    }


    //Deqeue - getting nodes out of the queue
    public LinkedListNode Dequeue()
    {
        // don't know if it will work!!!??
        if(this.Head == null){
            throw new ArrayIndexOutOfBoundsException("Cannot dequeue! Queue is empty.");
        }
        LinkedListNode temp = this.Head;
        this.Head = this.Head.next;
        if(this.Head == null){
            this.Tail = null;
        }
        return temp;
    }


    // Emptying the Queue
    public void EmptyQueue()
    {
        this.Head = null;
        this.Tail = null;

    }



}
