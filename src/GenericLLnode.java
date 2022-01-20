public class GenericLLnode <T>
{
    public T value;
    public T next;
    public T prev;

    public GenericLLnode(T value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
