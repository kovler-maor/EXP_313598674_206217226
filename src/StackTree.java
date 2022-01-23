public class StackTree {
    public LinkedListNodeTree top;

    public StackTree()
    {
        this.top = null;
    }

    public void Push(LinkedListNodeTree nodeTree)
    {
        if (this.top != null) {
            nodeTree.next = this.top;
        }
        this.top = nodeTree;
    }

    public LinkedListNodeTree Pop()
    {
        if(this.top == null)
        {
            throw new ArrayIndexOutOfBoundsException("Cannot pop! Stack is empty.");
        }
        LinkedListNodeTree nodeToPop = this.top;
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
