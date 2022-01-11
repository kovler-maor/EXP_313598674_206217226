public class DynamicGraph {
    public GraphNode HeadNode;
    public GraphNode TailNode;
    public GraphEdge HeadEdge;
    public GraphEdge TailEdge;
    public  int NumberOfNodes;
    public int NumberOfEdges;

    public DynamicGraph() {
        this.HeadNode = null;
        this.TailNode = null;
        this.HeadEdge = null;
        this.TailEdge = null;
        this.NumberOfEdges = 0;
        this.NumberOfNodes = 0;

    }

    public GraphNode insertNode(int nodeKey) {
        GraphNode node = new GraphNode(nodeKey);
        if(this.HeadNode == null) {
            this.HeadNode = node;
        } else {
            this.TailNode.nextNode = node;
            node.prevNode = this.TailNode;
        }
        this.TailNode = node;
        this.NumberOfNodes++;
        return node;
    }

    public void deleteNode(GraphNode node) {
        if (node.outDegree == 0 && node.inDegree == 0) {
            node.prevNode.nextNode = node.nextNode;
            node.nextNode.prevNode = node.prevNode;
            this.NumberOfNodes--;
        }

    }

    public GraphEdge insertEdge(GraphNode from, GraphNode to) {
        GraphEdge edge = new GraphEdge(from, to);
        if (this.HeadEdge == null) {
            this.HeadEdge = edge;
        } else {
            this.TailEdge.nextEdge = edge;
            edge.prevEdge = this.TailEdge;
            this.TailEdge = edge;
        }
        this.NumberOfEdges++;
        return edge;


    }

    public void deleteEdge(GraphEdge edge) {
        edge.prevEdge.nextEdge = edge.nextEdge;
        edge.nextEdge.prevEdge = edge.prevEdge;
        this.NumberOfEdges--;

    }
    public GraphNode[] createAdjacencyList(){
        GraphNode[][] adjList = new GraphNode[this.NumberOfNodes][this.NumberOfNodes
                ];
        for(int i = 0; i < this.NumberOfEdges; i++){


        }
    }

    public RootedTree scc() {

    }

    public RootedTree bfs(GraphNode source) {

    }

    public void Dfs(DynamicGraph G) {

    }

}
