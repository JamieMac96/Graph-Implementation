package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph<T> extends Graph<T>{

    @Override
    public void addEdge(int fromNode, int toNode) {
        if(!(nodes.contains(fromNode) && nodes.contains(toNode))){
            return;
        }
        if(!containsEdge(fromNode, toNode)) {
            adjacencyList.get(fromNode).add(toNode);
            adjacencyList.get(toNode).add(fromNode);
        }
    }

    @Override
    public void depthFirstSearch() {

    }

    @Override
    public void bredthFirstSearch() {

    }

    @Override
    public void shortestPath() {

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
    public boolean isPlanar() {
        return false;
    }

    @Override
    public boolean isTree() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isComplete() {
        return false;
    }
}
