# Graph Implementation
This Repository contains my personal implementation of the graph data structure. 

The data structure is implemented in java and also utilises my own linkedlist implementation in order to represent the graph's adjacency matrix. 

The graph is implemented using an inheritance heirarchy that allows us to abstract common functionality accross different types of graphs (eg directed vs undirected graphs).

The graph interface, which is implemented by each graph class, provides the following methods:
* void addNode(T node)
* void setNode(int index, T node)
* T getNode(int index)
* List<T> getNodes()
* List<Integer> depthFirstSearch(int source)
* List<Integer> breadthFirstSearch(int source)
* boolean containsEdge(int from, int to)
