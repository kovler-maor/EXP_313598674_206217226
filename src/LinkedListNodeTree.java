public class LinkedListNodeTree {
    public TreeNode treeNode;
    public LinkedListNodeTree next;
    public LinkedListNodeTree prev;

    public LinkedListNodeTree(TreeNode treeNode)
    {
        this.treeNode = treeNode;
        this.next = null;
        this.prev = null;
    }
}
