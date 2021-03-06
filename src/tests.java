import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

//public class tests {
//    public static void main(String[] args) throws IOException {
//        DynamicGraph dynamicGraph = new DynamicGraph();
//        GraphNode nodesArray[] = new GraphNode[12];
//
//        for (int i = 0; i < 12 ; i++)
//        {
//            nodesArray[i] = dynamicGraph.insertNode(i +1);
//        }


//        TreeNode treeNodesArray[] = new TreeNode[10];
//
//        for (int i = 0; i < 10 ; i++)
//        {
//            treeNodesArray[i] = new TreeNode(new GraphNode(i+1));
//        }
// test 1
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[2]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[0]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[4]);
//        dynamicGraph.insertEdge(nodesArray[4],nodesArray[5]);
//        dynamicGraph.insertEdge(nodesArray[5],nodesArray[6]);
//        dynamicGraph.insertEdge(nodesArray[6],nodesArray[4]);
// test 2
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[2]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[0]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[4]);
//        dynamicGraph.insertEdge(nodesArray[4],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[5]);
//        dynamicGraph.insertEdge(nodesArray[5],nodesArray[6]);
//        dynamicGraph.insertEdge(nodesArray[6],nodesArray[5]);
// test 3
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[0]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[2]);
//        dynamicGraph.insertEdge(nodesArray[4],nodesArray[5]);
//        dynamicGraph.insertEdge(nodesArray[5],nodesArray[4]);
//// test 4 BFS test
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[2]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[5]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[6]);
//        dynamicGraph.insertEdge(nodesArray[2],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[6],nodesArray[4]);
//        dynamicGraph.insertEdge(nodesArray[5],nodesArray[7]);


        // Adjacency lists
//        GraphNode currentGraphNode = dynamicGraph.HeadNode;
//        for(int i = 1; i < dynamicGraph.NumberOfNodes + 1; i++){
//            System.out.println("Node number " + i + " key is: " + currentGraphNode.key);
//            System.out.print("The node's neighbors are: ");
//            LinkedListNode Neighbor = currentGraphNode.adjacencyList.head;
//            for (int j = 0; j<currentGraphNode.adjacencyList.numberOfNodesInList;j++){
//                if(j ==0)
//                {
//                    System.out.print(Neighbor.graphNode.key);
//                }
//                else
//                {
//                    System.out.print(", " + Neighbor.graphNode.key);
//                }
//
//                Neighbor = Neighbor.next;
//            }
//            currentGraphNode = currentGraphNode.nextNode;
//            System.out.println();
//        }
//        dynamicGraph.dfs();
//        System.out.print("");
//        dynamicGraph.TransposeGraph();
//        dynamicGraph.dfs();
//        System.out.print("");

        // scc test
//        dynamicGraph.scc();
//        LinkedListNodeOfLinkedLists current_component = dynamicGraph.scc_list.head;
//        for (int i = 1; i<dynamicGraph.scc_list.numberOfNodesInList+1; i++)
//        {
//            LinkedListNode currentNode = current_component.doublyLinkedList.head;
//            System.out.println("Strongly connected component #" + i + " :");
//            for(int j = 0; j<current_component.doublyLinkedList.numberOfNodesInList;j++)
//            {
//                if(j == current_component.doublyLinkedList.numberOfNodesInList-1)
//                {
//                    System.out.println(currentNode.graphNode.key);
//                }
//                else
//                {
//                    System.out.print(currentNode.graphNode.key + "--> ");
//                }
//                currentNode = currentNode.next;
//            }
//            current_component = current_component.next;
//        }

        //bfs test
//        RootedTree rootedTree = dynamicGraph.bfs(nodesArray[0]);
//        rootedTree.printTree();
//        rootedTree.preorderPrintTest(rootedTree.root);
//        System.out.print(rootedTree.getFirstInNextLevel(rootedTree.root).value.key);

//        RootedTree rootedTree = dynamicGraph.scc();
//        RootedTree rootedTree = new RootedTree();
//        rootedTree.root = treeNodesArray[0];
//        rootedTree.root.leftChild = treeNodesArray[1];
//        rootedTree.root.leftChild.rightSibling = treeNodesArray[2];
//        rootedTree.root.leftChild.rightSibling.rightSibling = treeNodesArray[3];
//        rootedTree.root.leftChild.rightSibling.rightSibling.leftChild = treeNodesArray[8];
//        rootedTree.root.leftChild.rightSibling.leftChild = treeNodesArray[6];
//        rootedTree.root.leftChild.rightSibling.leftChild.rightSibling = treeNodesArray[7];
//        rootedTree.root.leftChild.rightSibling.leftChild.rightSibling.leftChild = treeNodesArray[9];
//        rootedTree.root.leftChild.leftChild = treeNodesArray[4];
//        rootedTree.root.leftChild.leftChild.rightSibling = treeNodesArray[5];

//        rootedTree.printTree();
//        Dy
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[1]);
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[2]);
//        dynamicGraph.insertEdge(nodesArray[0],nodesArray[3]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[4]);
//        dynamicGraph.insertEdge(nodesArray[1],nodesArray[5]);
//        dynamicGraph.insertEdge(nodesArray[3],nodesArray[6]);
//        dynamicGraph.insertEdge(nodesArray[5],nodesArray[7]);
//        dynamicGraph.insertEdge(nodesArray[6],nodesArray[8]);
//        dynamicGraph.insertEdge(nodesArray[7],nodesArray[9]);
//        dynamicGraph.insertEdge(nodesArray[8],nodesArray[10]);
//        dynamicGraph.insertEdge(nodesArray[10],nodesArray[11]);
//        RootedTree rootedTree = dynamicGraph.bfs(nodesArray[0]);
//        DataOutputStream outStream = new DataOutputStream(out);
//        rootedTree.printByLayer(outStream);
//        rootedTree.preorderPrint1(outStream);
//        outStream.close();



class Main {
    public static void main(String[] args) throws IOException {
        DynamicGraph dynGraph2 = new DynamicGraph();

        GraphNode n1 = dynGraph2.insertNode(1);
        GraphNode n2 = dynGraph2.insertNode(2);
        GraphNode n3 = dynGraph2.insertNode(3);
        GraphNode n4 = dynGraph2.insertNode(4);
        GraphNode n5 = dynGraph2.insertNode(5);
        GraphNode n6 = dynGraph2.insertNode(6);
        GraphNode n7 = dynGraph2.insertNode(7);
        GraphNode n8 = dynGraph2.insertNode(8);
        GraphNode n9 = dynGraph2.insertNode(9);
        GraphNode n10 = dynGraph2.insertNode(10);


        GraphEdge t1 = dynGraph2.insertEdge(n1, n2);
        GraphEdge t2 = dynGraph2.insertEdge(n2, n3);
        GraphEdge t3 = dynGraph2.insertEdge(n3, n4);
        GraphEdge t4 = dynGraph2.insertEdge(n4, n1);
        //===================
        GraphEdge t5 = dynGraph2.insertEdge(n5, n6);
        GraphEdge t6 = dynGraph2.insertEdge(n6, n5);
        //===================
        GraphEdge t7 = dynGraph2.insertEdge(n7, n8);
        GraphEdge t8 = dynGraph2.insertEdge(n8, n9);
        GraphEdge t9 = dynGraph2.insertEdge(n9, n7);
        //===================


        try (FileOutputStream fOut = new FileOutputStream("C:\\Users\\kovle\\OneDrive\\Desktop\\test.txt");
             DataOutputStream dOut = new DataOutputStream(fOut);) {

            RootedTree rt;

            rt = dynGraph2.bfs(n1);
            dOut.writeBytes("BFS TEST:" + System.lineSeparator());
            dOut.writeBytes("printByLayer:" + System.lineSeparator());
            rt.printByLayer(dOut);
            dOut.writeBytes(System.lineSeparator() + "preorderPrint:" + System.lineSeparator());
            rt.preorderPrint(dOut);
            dOut.writeBytes(System.lineSeparator() + System.lineSeparator());

            rt = dynGraph2.scc();
            dOut.writeBytes("SCC TEST:" + System.lineSeparator());
            dOut.writeBytes("printByLayer:" + System.lineSeparator());
            rt.printByLayer(dOut);
            dOut.writeBytes(System.lineSeparator() + "preorderPrint:" + System.lineSeparator());
            rt.preorderPrint(dOut);


//            dOut.writeBytes(System.lineSeparator() + System.lineSeparator());
//            dOut.writeBytes("TEST 2!! now i will delete 2 edges:  Edge(n1, n2);  Edge(n2, n3);" + System.lineSeparator());
//
//            ///
//            dynGraph2.deleteEdge(t1);
//            dynGraph2.deleteEdge(t2);
//            ///
//
//            rt = dynGraph2.bfs(n1);
//            dOut.writeBytes("BFS TEST:" + System.lineSeparator());
//            dOut.writeBytes("printByLayer:" + System.lineSeparator());
//            rt.printByLayer(dOut);
//            dOut.writeBytes(System.lineSeparator() + "preorderPrint:" + System.lineSeparator());
//            rt.preorderPrint(dOut);
//            dOut.writeBytes(System.lineSeparator() + System.lineSeparator());
//
//
//            rt = dynGraph2.scc();
//            dOut.writeBytes("SCC TEST:" + System.lineSeparator());
//            dOut.writeBytes("printByLayer:" + System.lineSeparator());
//            rt.printByLayer(dOut);
//            dOut.writeBytes(System.lineSeparator() + "preorderPrint:" + System.lineSeparator());
//            rt.preorderPrint(dOut);


        }


//            public static void print_adj(DynamicGraph dynGraph, GraphNode node) {
//
//                System.out.printf("\n### adj test, print all adj of node '%d':\n", node.getKey());
//
//                while (node.NeighborsD.headOfList != null) {
//                    System.out.printf("%d", node.NeighborsD.headOfList.value.getKey());
//                    if (node.NeighborsD.headOfList.nextDDL != null) {
//                        node.NeighborsD.headOfList = node.NeighborsD.headOfList.nextDDL;
//                    } else {
//                        return;
//                    }
//                }
//            }
    }
}






