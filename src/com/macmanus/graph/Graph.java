package com.macmanus.graph;

import java.util.ArrayList;
import java.util.List;

import com.macmanus.linkedlist.LinkedList;

public abstract class Graph<T> {
    private List<LinkedList<Integer>> adjacencyList;
    private List<T> nodes;

    public Graph(){
        adjacencyList = new ArrayList<LinkedList<Integer>>();
    }

    public LinkedList<Integer> getAdjacentNodes(int index){
        return adjacencyList.get(index);
    }

    public LinkedList<Integer> getAdjacentNodes(T node){
        int nodeIndex = 0;

        for(int i = 0; i < nodes.size(); i++){
            if(node.equals(nodes.get(i))){
                nodeIndex = i;
            }
        }
        return adjacencyList.get(nodeIndex);
    }

    public void addNode(T node){
        nodes.add(node);
    }

    public void addEdge(int fromNode, int toNode){

    }

    public abstract boolean isPlanar();

    public abstract boolean isTree();

    public abstract boolean isConnected();

    public abstract boolean isComplete();

    public abstract void depthFirstSearch();

    public abstract void bredthFirstSearch();

    public abstract void shortestPath();
}
