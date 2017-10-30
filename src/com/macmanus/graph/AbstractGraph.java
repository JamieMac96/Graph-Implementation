package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGraph<T> extends BaseAbstractGraph<T>{
    List<LinkedList<Integer>> adjacencyList;

    AbstractGraph(){
        nodes = new ArrayList<>();
        adjacencyList = new ArrayList<>();
    }

    public boolean addEdge(T from, T to) {
        int fromIndex = getNodeIndex(from);
        int toIndex = getNodeIndex(to);
        boolean foundBothElements = (fromIndex != -1 && toIndex != -1);

        return foundBothElements && addEdge(fromIndex, toIndex);
    }

    @Override
    public void addNode(T node){
        nodes.add(node);
        adjacencyList.add(new LinkedList<>());
    }

    public List<LinkedList<Integer>> getEdges(){
        return adjacencyList;
    }

    @Override
    protected List<Integer> dfsRecursive(boolean[] visited, List<Integer> visitedNodeIndices, int nodeIndex){
        visited[nodeIndex] = true;
        visitedNodeIndices.add(nodeIndex);

        for(int w: adjacencyList.get(nodeIndex)){
            if(!visited[w]){
                dfsRecursive(visited, visitedNodeIndices, w);
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
            source = queue.getFirst();
            visitedNodeIndices.add(source);

            for(int nodeIndex: adjacencyList.get(source)){
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
        LinkedList<Integer> fromList = adjacencyList.get(fromNode);

        for(int item: fromList){
            if(item == toNode){
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

    public abstract boolean addEdge(int from, int to);
}
