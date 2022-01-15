public class DynamicGraph
{
    //Linked list  of nodes
    public GraphNode HeadNode;
    public GraphNode TailNode;

    //Linked list  of edges
    public GraphEdge HeadEdge;
    public GraphEdge TailEdge;

    // Counters of nodes and edges
    public  int NumberOfNodes;
    public int NumberOfEdges;

    // Constructor
    public DynamicGraph()
    {
        this.HeadNode = null;
        this.TailNode = null;
        this.HeadEdge = null;
        this.TailEdge = null;
        this.NumberOfEdges = 0;
        this.NumberOfNodes = 0;

    }

    // Insertion of node
    public GraphNode insertNode(int nodeKey)
    {
        GraphNode node = new GraphNode(nodeKey);
        if(this.HeadNode == null)
        {
            this.HeadNode = node;
        } else
        {
            this.TailNode.nextNode = node;
            node.prevNode = this.TailNode;
        }
        this.TailNode = node;
        this.NumberOfNodes++;
        return node;
    }


    //Deletion of node
    public void deleteNode(GraphNode node)
    {
        if (node.outDegree == 0 && node.inDegree == 0)
        {
            node.prevNode.nextNode = node.nextNode;
            node.nextNode.prevNode = node.prevNode;
            this.NumberOfNodes--;
        }

    }

    // Insertion of edge
    public GraphEdge insertEdge(GraphNode from, GraphNode to)
    {
        GraphEdge edge = new GraphEdge(from, to);
        if (this.HeadEdge == null)
        {
            this.HeadEdge = edge;
        } else
        {
            this.TailEdge.nextEdge = edge;
            edge.prevEdge = this.TailEdge;
            this.TailEdge = edge;
        }
        this.NumberOfEdges++;
        return edge;


    }

    //Deletion of edge
    public void deleteEdge(GraphEdge edge)
    {
        edge.prevEdge.nextEdge = edge.nextEdge;
        edge.nextEdge.prevEdge = edge.prevEdge;
        this.NumberOfEdges--;

    }


    // A function that builds for every vertx in the graph adjacency list
    // which is represented by a doubly linked list
    public void CreateLinkedListForNode()
    {
        GraphEdge currentEdge = this.HeadEdge;
        for(int i = 0; i < this.NumberOfEdges; i++)
        {
            //Go to the "from node" of the current edge and add to its adjacency list the "to node"
            currentEdge.fromNode.adjacencyList.AddNode(new LinkedListNode(currentEdge.toNode));
        }
    }

    // Transposing the graph for scc
    public void TransposeGraph()
    {
        GraphEdge currentEdge = this.HeadEdge;
        for(int i = 0; i < this.NumberOfEdges; i++)
        {
            GraphNode temp = currentEdge.fromNode;
            currentEdge.fromNode = currentEdge.toNode;
            currentEdge.toNode = temp;
        }
    }

    // We still don't know what it returns
    public void dfs()
    {
        GraphNode currentVertex = this.HeadNode;
        for(int i = 0; i < this.NumberOfNodes; i++)
        {
            currentVertex.color = 0;
            currentVertex.parent = null;
            currentVertex = currentVertex.nextNode;
        }

        int time = 0;
        currentVertex = this.HeadNode;
        for(int i = 0; i < this.NumberOfNodes; i++)
        {
            if(currentVertex.color == 0)
            {
                dfs_visit(currentVertex, time);
            }
            currentVertex = currentVertex.nextNode;
        }
    }

    public void dfs_visit(GraphNode currentVertex , int time)
    {
        time ++;
        currentVertex.discoveryTime = time;
        currentVertex.color = 1;
        LinkedListNode currentAdjacencyVertex = currentVertex.adjacencyList.head;
        for (int i = 0; i < currentVertex.adjacencyList.amountOfNodes; i++)
        {
            if(currentAdjacencyVertex.graphNode.color == 0)
            {
                currentAdjacencyVertex.graphNode.parent = currentVertex;
                dfs_visit(currentAdjacencyVertex.graphNode,time);
            }
            currentAdjacencyVertex = currentAdjacencyVertex.next;
        }
        currentVertex.color = 2;
        time++;
        currentVertex.finalTime = time;

    }

    public RootedTree scc()
    {
        dfs();
        TransposeGraph();
        dfs();

    }

    public RootedTree bfs(GraphNode source)
    {

    }



}
