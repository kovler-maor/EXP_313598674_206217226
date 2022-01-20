import java.io.DataOutputStream;

public class RootedTree {
    public TreeNode root;
    public RootedTree(){
        this.root = null;

    }

    public TreeNode getFirstInNextLevel(TreeNode currentNode){
        while (currentNode.rightSibling != null){
            if(currentNode.leftChild != null){
                return currentNode.leftChild;
            }
        }
        return null;
    }

    public void printKids(TreeNode Dad){
        TreeNode currentKid = Dad.leftChild;
        if(currentKid != null){
            while (currentKid.rightSibling != null){
                System.out.print(currentKid.value.key + "---> ");
                currentKid = currentKid.rightSibling;
            }
            System.out.print(currentKid.value.key);
        }

    }

    public void printTree(){
        TreeNode currentTreeNode = this.root;
        printKids(currentTreeNode);



    }

    public void printByLayer(DataOutputStream out){


    }

    public void preorderPrint(DataOutputStream out){

    }
}
