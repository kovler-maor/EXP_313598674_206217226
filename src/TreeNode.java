public class TreeNode {
    public GraphNode value;
    public TreeNode leftChild;
    public TreeNode rightSibling;
    public TreeNode mostRightChild;


    public TreeNode(GraphNode value){
        this.value = value;
        this.leftChild = null;
        this.rightSibling = null;
        this.mostRightChild = null;
    }
    public void AddChild(TreeNode treeNode){
        if(this.leftChild == null){
            this.leftChild = treeNode;
        }
        else{
            this.mostRightChild.rightSibling = treeNode;
        }
        this.mostRightChild = treeNode;

    }
//    public TreeNode mostLeftChildWithKids(){
//        if (this.leftChild == null){
//            return null;
//        }
//        TreeNode currentChild = this.leftChild;
//        while (currentChild != null){
//            if (currentChild.leftChild != null){
//                return currentChild;
//            }
//            currentChild = currentChild.rightSibling;
//        }
//        return null;
//    }

}
