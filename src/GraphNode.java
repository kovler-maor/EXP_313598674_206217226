public class GraphNode {
    public int key;
    public int outDegree;
    public int inDegree;
    public int intds;

    public GraphNode(int key){
        this.key = key;
        this.outDegree = 0;
        this.inDegree = 0;


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
