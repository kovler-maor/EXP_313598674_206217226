public class DynamicGraph
{
    // Linked list  of nodes
    public GraphNode HeadNode;
    public GraphNode TailNode;

    // Linked list  of edges
    public GraphEdge HeadEdge;
    public GraphEdge TailEdge;

    // Counters of nodes and edges
    public  int NumberOfNodes;
    public int NumberOfEdges;

    public Stack stack;
    public Queue queue;

    public DoublyLinkedListOfDoublyLinkedListNode scc_list;

    public DoublyLinkedListOfDoublyLinkedListNode bfs_list;

    // Constructor
    public DynamicGraph()
    {
        this.HeadNode = null;
        this.TailNode = null;
        this.HeadEdge = null;
        this.TailEdge = null;
        this.NumberOfEdges = 0;
        this.NumberOfNodes = 0;
        this.stack = new Stack();
        this.queue = new Queue();
        this.scc_list = new DoublyLinkedListOfDoublyLinkedListNode();

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
        }
        else
        {
            this.TailEdge.nextEdge = edge;
            edge.prevEdge = this.TailEdge;
        }
        this.TailEdge = edge;

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
        GraphNode currentNode = this.TailNode;
        for(int i = 0; i < this.NumberOfNodes; i++)
        {
            currentNode.adjacencyList.EmptyList();
            currentNode = currentNode.prevNode;
        }

        GraphEdge currentEdge = this.TailEdge;
        for(int i = 0; i < this.NumberOfEdges; i++)
        {
            //Go to the "from node" of the current edge and add to its adjacency list the "to node"
            currentEdge.fromNode.adjacencyList.AddNode(new LinkedListNode(currentEdge.toNode));
            currentEdge = currentEdge.prevEdge;
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
            currentEdge = currentEdge.nextEdge;
        }
    }

    public void dfs_visit(GraphNode graphNode){
        graphNode.color = 1;
        LinkedListNode currentNode = graphNode.adjacencyList.head;
        if (currentNode != null)
        {
            for(int i = 0; i < graphNode.adjacencyList.numberOfNodesInList; i++){
                if(currentNode.graphNode.color == 0){
                    dfs_visit(currentNode.graphNode);
                }
                currentNode = currentNode.next;
            }
        }

        graphNode.color = 2;
        this.stack.Push(new LinkedListNode(graphNode));

    }
    public void  dfs()
    {
        CreateLinkedListForNode();
        GraphNode currentNode = this.TailNode;

        // Initialization of nodes.
        if(!stack.IsEmpty()){
            this.stack.EmptyStack();
        }
        for(int i = 0; i < this.NumberOfNodes; i++){
            currentNode.color = 0;
            currentNode.parent = null;
            currentNode = currentNode.prevNode;
        }

        currentNode = this.TailNode;
        for(int i = 0; i < this.NumberOfNodes; i++){
            if(currentNode.color == 0){
                dfs_visit(currentNode);
            }
            currentNode = currentNode.prevNode;
        }
    }


    public void dfs2()
    {
        CreateLinkedListForNode();
        GraphNode currentNode = this.TailNode;

        // Initialization of nodes.
        for(int i = 0; i < this.NumberOfNodes; i++){
            currentNode.color = 0;
            currentNode.parent = null;
            currentNode = currentNode.prevNode;
        }

        currentNode = this.stack.top.graphNode;
        for(int i = 0; i < this.NumberOfNodes; i++){
            if(currentNode.color == 0){
                LinkedListNodeOfLinkedLists currentScc = new LinkedListNodeOfLinkedLists(new DoublyLinkedList());
                currentScc.doublyLinkedList.AddNode(new LinkedListNode(currentNode));
                dfs_visit2(currentNode , currentScc);
                this.scc_list.AddNode(currentScc);
            }
            this.stack.Pop();
            if(!stack.IsEmpty())
            {
                currentNode = this.stack.top.graphNode;
            }

        }
    }
    public void dfs_visit2(GraphNode graphNode,LinkedListNodeOfLinkedLists currentScc){
        graphNode.color = 1;
        LinkedListNode currentNode = graphNode.adjacencyList.head;
        for(int i = 0; i < graphNode.adjacencyList.numberOfNodesInList; i++){
            if(currentNode.graphNode.color == 0){
                currentScc.doublyLinkedList.AddNode(new LinkedListNode(currentNode.graphNode));
                dfs_visit2(currentNode.graphNode,currentScc);
            }
            currentNode = currentNode.next;
        }
        graphNode.color = 2;

    }





    public RootedTree scc()
    {
        dfs();
        TransposeGraph();
        dfs2();
        RootedTree dfs_rootedTree = new RootedTree();
        dfs_rootedTree.root = new TreeNode(new GraphNode(0));

        LinkedListNodeOfLinkedLists currentScc = this.scc_list.head;

        if(currentScc != null){
            for (int i = 0; i < this.scc_list.numberOfNodesInList; i++)
            {
                LinkedListNode linkedListCurrentSon = currentScc.doublyLinkedList.head;
                TreeNode currentSon = new TreeNode(linkedListCurrentSon.graphNode);
                dfs_rootedTree.root.AddChild(currentSon);
                if(linkedListCurrentSon.next != null){
                    LinkedListNode linkedListCurrentGrandSon = linkedListCurrentSon.next;
                    TreeNode currentGrandSon = new TreeNode(linkedListCurrentGrandSon.graphNode);
                    for(int j = 0; j < currentScc.doublyLinkedList.numberOfNodesInList - 1; j++){
                        currentSon.AddChild(currentGrandSon);
                        linkedListCurrentGrandSon = linkedListCurrentGrandSon.next;
                        if(linkedListCurrentGrandSon != null){
                            currentGrandSon = new TreeNode(linkedListCurrentGrandSon.graphNode);
                        }
                    }
                }
                currentScc = currentScc.next;
            }
        }
        return dfs_rootedTree;
    }

    public RootedTree bfs(GraphNode source)
    {
        RootedTree bfsTree = new RootedTree();
        TreeNode currentTreeNode = new TreeNode(source);
        source.treeNode = currentTreeNode;
        bfsTree.root = currentTreeNode;
        // Start of initialization
        CreateLinkedListForNode();
        GraphNode currentNode = this.TailNode;

        if(!this.queue.IsEmpty()){
            this.queue.EmptyQueue();
        }
        for(int i = 0; i < this.NumberOfNodes; i++){
            currentNode.color = 0;
            currentNode.parent = null;
            currentNode.distance = -1;
            currentNode.treeNode = null;
            currentNode = currentNode.prevNode;
        }
        source.color = 1;
        source.distance = 0;
        this.queue.Enqueue(new QueueNode(source));


        // End of initialization


        while (!this.queue.IsEmpty()){
            GraphNode current_node = this.queue.Dequeue().value;
            LinkedListNode current_neighbor = current_node.adjacencyList.head;
            for (int i = 0; i < current_node.adjacencyList.numberOfNodesInList; i++){
                if(current_neighbor.graphNode.color == 0){
                    current_neighbor.graphNode.treeNode = new TreeNode(current_neighbor.graphNode);
                    currentTreeNode.AddChild(current_neighbor.graphNode.treeNode);
                    current_neighbor.graphNode.color = 1;
                    queue.Enqueue(new QueueNode(current_neighbor.graphNode));
                }
                current_neighbor = current_neighbor.next;
            }
            if(!this.queue.IsEmpty()){
                currentTreeNode = this.queue.Head.value.treeNode;
            }



        }
        return bfsTree;

    }





}
