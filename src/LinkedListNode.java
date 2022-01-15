/*Creating from graphnode a new object that contains a new object with the graphnode and a pointer to the next on
* good for creating queues and stacks
* need to ask Or what he thinks about it*/


public class LinkedListNode
    {
    public GraphNode graphNode;
    public LinkedListNode next;
    public LinkedListNode prev;

    public LinkedListNode(GraphNode node)
    {
        this.graphNode = node;
        this.next = null;
    }




}
