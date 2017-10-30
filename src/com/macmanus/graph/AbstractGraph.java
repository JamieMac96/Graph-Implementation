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
    public void depthFirstSearch() {

    }

    @Override
    public void breadthFirstSearch() {

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
