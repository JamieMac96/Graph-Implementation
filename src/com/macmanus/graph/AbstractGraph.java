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
    public void bredthFirstSearch() {

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

    @Override
    public void isEularian() {

    }

    public abstract boolean addEdge(int from, int to);

    public abstract boolean addEdge(T from, T to);
}
