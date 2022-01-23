import java.io.DataOutputStream;
import java.io.IOException;


public class RootedTree {
    public TreeNode root;
    public RootedTree(){
        this.root = null;

    }



    public void printByLayer(DataOutputStream out) throws IOException {
        QueueOfRottedTree PBLqueue = new QueueOfRottedTree();
        TreeNode spaceFlag = new TreeNode(new GraphNode(-1));
        PBLqueue.Enqueue(new QueueNodeOfRottedTree(this.root));
        PBLqueue.Enqueue(new QueueNodeOfRottedTree(spaceFlag));
        while (PBLqueue.Head.value.value.key == -1 && PBLqueue.Head.prev == null){
            QueueNodeOfRottedTree currentFatherNode = PBLqueue.Dequeue();
            TreeNode currentFather = currentFatherNode.value;
            if(currentFatherNode.prev != null){
                if(currentFatherNode.prev.value.value.key == -1)
                    out.writeBytes(String.valueOf(currentFather.value.key));
                else {
                    out.writeBytes(String.valueOf(currentFather.value.key)+ ",");
                }
            }
            else {
                break;
            }


            TreeNode currentBrother = currentFather.rightSibling;
            TreeNode currentKid = currentFather.leftChild;


            while(currentKid != null){
                PBLqueue.Enqueue(new QueueNodeOfRottedTree(currentKid));
                currentKid = currentKid.rightSibling;
            }

            if(currentFatherNode.prev.value.value.key == -1){
                PBLqueue.Dequeue();
                PBLqueue.Enqueue(new QueueNodeOfRottedTree(spaceFlag));
                out.writeBytes(System.lineSeparator());
                continue;
            }

        }

    }



    public void preorderPrintTest(TreeNode currentNode , DataOutputStream out) throws IOException {
        out.writeBytes("," + currentNode.value.key);
        if (currentNode.leftChild != null){
            preorderPrintTest(currentNode.leftChild, out);
        }
        if(currentNode.rightSibling != null){
            preorderPrintTest(currentNode.rightSibling, out);
        }

    }

//    public void preorderPrint(DataOutputStream out) throws IOException {
//        out.writeBytes(String.valueOf(this.root.value.key));
//        if(this.root.leftChild != null){
//            preorderPrintTest(this.root.leftChild, out);
//        }
//    }

    public void preorderPrint(DataOutputStream out) throws IOException {
        StackTree stackTree = new StackTree();
        stackTree.Push(new LinkedListNodeTree(this.root));
        while (!stackTree.IsEmpty()){
            LinkedListNodeTree current = stackTree.Pop();
            TreeNode currentChild = current.treeNode.leftChild;
            while (currentChild != null){
                stackTree.Push(new LinkedListNodeTree(currentChild));
                currentChild = currentChild.rightSibling;
            }
//            TreeNode currentSibling = current.treeNode.rightSibling;
//            while (currentSibling != null){
//                stackTree.Push(new LinkedListNodeTree(currentSibling));
//                currentSibling = currentSibling.rightSibling;
//            }
            if(!stackTree.IsEmpty()){
                out.writeBytes(current.treeNode.value.key + ",");
            }
            else {
                out.writeBytes(String.valueOf(current.treeNode.value.key));
            }
        }
    }


}
