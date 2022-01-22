public class QueueOfRottedTree {
    public QueueNodeOfRottedTree Head;
    public QueueNodeOfRottedTree Tail;

    // Constructor
    QueueOfRottedTree()
    {
        this.Head = null;
        this.Tail = null;
    }

    // Enqueqe - putting new nodes in the queue
    public void Enqueue(QueueNodeOfRottedTree node)
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
    public QueueNodeOfRottedTree Dequeue()
    {
        if(this.Head == null){
            throw new ArrayIndexOutOfBoundsException("Cannot dequeue! Queue is empty.");
        }
        QueueNodeOfRottedTree temp = this.Head;
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
