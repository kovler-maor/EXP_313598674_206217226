public class Queue {
    public Qnode Head;
    public Qnode Tail;

    Queue(GraphNode node){
        this.Head = null;
        this.Tail = null;
    }

    void Enqueue(GraphNode node){
        Qnode temp = new Qnode(node);
        if(this.Tail == null){
            this.Head = this.Tail = temp;
        }
    }

    void Dequeue(){
        if(this.Head == null){
            return;
        }
        Qnode temp = this.Head;
        this.Head = this.Head.next;
        if(this.Head == null){
            this.Tail = null;
        }

    }



}
