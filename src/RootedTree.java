import java.io.DataOutputStream;
import java.security.PublicKey;

public class RootedTree {
    public TreeNode root;
    public RootedTree(){
        this.root = null;

    }

    public TreeNode getFirstInNextLevel(TreeNode currentNode){
        while (currentNode.rightSibling != null || currentNode.leftChild !=null){
            if(currentNode.leftChild != null){
                return currentNode.leftChild;
            }
            currentNode = currentNode.rightSibling;
        }
        return null;
    }
// start of printByLayer
    public void printKids(TreeNode Dad){
        TreeNode currentKid = Dad.leftChild;
        if(currentKid != null){
            while (currentKid.rightSibling != null){
                System.out.print(currentKid.value.key + ",");
                currentKid = currentKid.rightSibling;
            }
            System.out.print(currentKid.value.key + ",");
        }

    }
    public void printLayer(TreeNode firstInPreviousLayer){
        while (firstInPreviousLayer != null){
            printKids(firstInPreviousLayer);
            firstInPreviousLayer = firstInPreviousLayer.rightSibling;
        }
        System.out.println("");
    }

    public void printTree(){
        TreeNode currentTreeNode = this.root;
        System.out.println(currentTreeNode.value.key);
        while (currentTreeNode != null){
            printLayer(currentTreeNode);
            currentTreeNode = getFirstInNextLevel(currentTreeNode);
        }
    }
// end of printByLayer
    public void printByLayer(DataOutputStream out){


    }

    public void preorderPrint(DataOutputStream out){


    }

    public void preorderPrintTest(TreeNode currentNode){
        System.out.print("," + currentNode.value.key);
        if (currentNode.leftChild != null){
            preorderPrintTest(currentNode.leftChild);
        }
        if(currentNode.rightSibling != null){
            preorderPrintTest(currentNode.rightSibling);
        }

    }
}
