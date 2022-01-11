public class GraphNode {
    public int key;
    public int outDegree;
    public int inDegree;
    public GraphNode prevNode;
    public GraphNode nextNode;



    public GraphNode(int key){
        this.key = key;
        this.outDegree = 0;
        this.inDegree = 0;
        this.nextNode = null;
        this.prevNode = null;

    }
    public int getOutDegree(){
        return outDegree;
    }

    public int getInDegree(){
        return inDegree;
    }

    public int getKey(){
        return key;
    }

}
