/*Implementation of stack for DFS and SCC
* Has one attribute top*/



public class Stack
{
    public LinkedListNode top;

    public Stack()
    {
        this.top = null;
    }

    public void Push(LinkedListNode node)
    {
        if (this.top != null) {
            node.next = this.top;
        }
        this.top = node;
    }

    public LinkedListNode Pop()
    {
        if(this.top == null)
        {
            throw new ArrayIndexOutOfBoundsException("Cannot pop! Stack is empty.");
        }
        LinkedListNode nodeToPop = this.top;
        this.top = this.top.next;
        return nodeToPop;
    }

    public boolean IsEmpty()
    {
        return (this.top == null);

    }

    public void EmptyStack()
    {
        this.top = null;
    }
}
