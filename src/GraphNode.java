public class GraphNode {
    public int key;
    public int outDegree;
    public int inDegree;
    public DoublyLinkedList adjacencyList;
    public GraphNode prevNode; //previous graph node in dynamic graph
    public GraphNode nextNode; // next graph node in dynamic graph
    public int color;
    public GraphNode parent;
    public int discoveryTime;
    public int finalTime;




    public GraphNode(int key){
        this.key = key;
        this.outDegree = 0;
        this.inDegree = 0;
        this.adjacencyList = new DoublyLinkedList();
        this.nextNode = null;
        this.prevNode = null;



    }

    public int getOutDegree() {
        return outDegree;
    }

    public int getInDegree() {
        return inDegree;
    }

    public int getKey() {
        return key;
    }
}
