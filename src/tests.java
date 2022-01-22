
public class tests {
    public static void main(String[] args) {
        DynamicGraph dynamicGraph = new DynamicGraph();
        GraphNode nodesArray[] = new GraphNode[7];

        for (int i = 0; i < 7 ; i++)
        {
            nodesArray[i] = dynamicGraph.insertNode(i +1);
        }
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
// test 4
        dynamicGraph.insertEdge(nodesArray[0],nodesArray[1]);
        dynamicGraph.insertEdge(nodesArray[2],nodesArray[1]);
        dynamicGraph.insertEdge(nodesArray[0],nodesArray[2]);
        dynamicGraph.insertEdge(nodesArray[1],nodesArray[3]);
        dynamicGraph.insertEdge(nodesArray[2],nodesArray[5]);
        dynamicGraph.insertEdge(nodesArray[2],nodesArray[6]);
        dynamicGraph.insertEdge(nodesArray[2],nodesArray[3]);
        dynamicGraph.insertEdge(nodesArray[6],nodesArray[4]);


        // Adjacency lists
        GraphNode currentGraphNode = dynamicGraph.HeadNode;
        for(int i = 1; i < dynamicGraph.NumberOfNodes + 1; i++){
            System.out.println("Node number " + i + " key is: " + currentGraphNode.key);
            System.out.print("The node's neighbors are: ");
            LinkedListNode Neighbor = currentGraphNode.adjacencyList.head;
            for (int j = 0; j<currentGraphNode.adjacencyList.numberOfNodesInList;j++){
                if(j ==0)
                {
                    System.out.print(Neighbor.graphNode.key);
                }
                else
                {
                    System.out.print(", " + Neighbor.graphNode.key);
                }

                Neighbor = Neighbor.next;
            }
            currentGraphNode = currentGraphNode.nextNode;
            System.out.println();
        }
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

        RootedTree rootedTree = dynamicGraph.scc();
        rootedTree.printTree();
        rootedTree.preorderPrintTest(rootedTree.root);





    }

}




