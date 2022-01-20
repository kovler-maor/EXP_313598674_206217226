/*Implementation of Queue*/
public class Queue
{
    public QueueNode Head;
    public QueueNode Tail;

    // Constructor
    Queue()
    {
        this.Head = null;
        this.Tail = null;
    }

    // Enqueqe - putting new nodes in the queue
    public void Enqueue(QueueNode node)
    {
        if(this.Tail == null)
        {
            this.Head = node;
        }
        else
        {
            this.Tail.prev = node;
            node.next = this.Tail;
        }
        this.Tail = node;


    }


    //Deqeue - getting nodes out of the queue
    public QueueNode Dequeue()
    {
        if(this.Head == null){
            throw new ArrayIndexOutOfBoundsException("Cannot dequeue! Queue is empty.");
        }
        QueueNode temp = this.Head;
        this.Head = this.Head.prev;
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
    public boolean IsEmpty()
    {
        if(Head == null && Tail == null)
        {
            return true;
        }
        return false;
    }


}
