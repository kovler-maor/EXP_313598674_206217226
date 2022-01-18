public class TreeNode {
    public GraphNode value;
    public TreeNode leftChild;
    public TreeNode rightSibling;


    public TreeNode(GraphNode value){
        this.value = value;
        this.leftChild = null;
        this.rightSibling = null;
    }
}
