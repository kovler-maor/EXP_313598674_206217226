public class GraphNode {
    public int key;
    public int outDegree;
    public int inDegree;
    public DoublyLinkedList adjacencyList;
//    public GraphNode prevNode; //previous graph node in dynamic graph
//    public GraphNode nextNode; // next graph node in dynamic graph
//    public Queue QAdjList;
//    public Stack SAdjList;



    public GraphNode(int key){
        this.key = key;
        this.outDegree = 0;
        this.inDegree = 0;
        this.adjacencyList = new DoublyLinkedList();
//        this.nextNode = null;
//        this.prevNode = null;
////        this.QAdjList = new Queue();
////        this.SAdjList = new Stack();
////        this.color = 0;


    }
}
