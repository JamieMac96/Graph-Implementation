package com.macmanus.graph;

import java.util.ArrayList;
import com.macmanus.linkedlist.LinkedList;
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
    public void depthFirstSearch() {

    }

    @Override
    public void breadthFirstSearch() {

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
