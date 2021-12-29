public class GraphEdge {
    public GraphNode fromNode;
    public GraphNode toNode;
    public GraphEdge(GraphNode fromNode, GraphNode toNode){
        this.fromNode = fromNode;
        fromNode.outDegree ++;
        this.toNode = toNode;
        toNode.inDegree++;

    }

}
