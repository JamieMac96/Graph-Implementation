package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractWeightedGraph<T> extends BaseAbstractGraph<T> {
    protected ArrayList<LinkedList<WeightedEdge>> adjacencyList;

    AbstractWeightedGraph(){
        nodes = new ArrayList<>();
        adjacencyList = new ArrayList<>();
    }

    @Override
    public void addNode(T node) {
        nodes.add(node);
        adjacencyList.add(new LinkedList<>());
    }

    public boolean addEdge(T from, T to, int weight) {
        int fromIndex = getNodeIndex(from);
        int toIndex = getNodeIndex(to);
        boolean foundBothElements = (fromIndex != -1 && toIndex != -1);

        return foundBothElements && addEdge(fromIndex, toIndex, weight);
    }

    public ArrayList<LinkedList<WeightedEdge>> getEdges() {
        return adjacencyList;
    }

    @Override
    protected List<Integer> dfsRecursive(boolean[] visited, List<Integer> visitedNodeIndices, int nodeIndex){
        visited[nodeIndex] = true;
        visitedNodeIndices.add(nodeIndex);

        for(WeightedEdge w: adjacencyList.get(nodeIndex)){
            if(!visited[w.getNodexIndex()]){
                dfsRecursive(visited, visitedNodeIndices, w.getNodexIndex());
            }
        }

        return visitedNodeIndices;
    }

    // Returns the indices of the nodes visited when running the DFS algorithm
    @Override
    public List<Integer> breadthFirstSearch(int source) {
        boolean[] visited = new boolean[nodes.size()];
        ArrayList<Integer> visitedNodeIndices = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while(queue.size() != 0){

            source = queue.removeFirst();
            visitedNodeIndices.add(source);

            for(WeightedEdge w: adjacencyList.get(source)){
                int nodeIndex = w.getNodexIndex();
                if(!visited[nodeIndex]){
                    visited[nodeIndex] = true;
                    queue.add(nodeIndex);
                }
            }
        }

        return visitedNodeIndices;
    }

    @Override
    public boolean containsEdge(int fromNode, int toNode){
        LinkedList<WeightedEdge> fromList = adjacencyList.get(fromNode);

        for(WeightedEdge item: fromList){
            if(item.getNodexIndex() == toNode){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        String output = "";

        for(int i = 0; i < nodes.size(); i++){
            output += i + ":(" + nodes.get(i) + ") ===> "
                    + adjacencyList.get(i).toString() + "\n";
        }

        return output;
    }


    public abstract void shortestPath();
    public abstract boolean addEdge(int from, int to, int weight);
}
