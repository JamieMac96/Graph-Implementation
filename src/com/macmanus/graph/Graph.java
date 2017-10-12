package com.macmanus.graph;

import java.util.ArrayList;
import java.util.List;

import com.macmanus.linkedlist.LinkedList;

public abstract class Graph<T> {
    public List<LinkedList<Integer>> adjacencyList;
    List<T> nodes;

    Graph(){
        nodes = new ArrayList<>();
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

    public abstract void addEdge(int fromNode, int toNode);

    public abstract boolean containsEdge(int from, int to);

    public abstract boolean isPlanar();

    public abstract boolean isTree();

    public abstract boolean isConnected();

    public abstract boolean isComplete();

    public abstract void depthFirstSearch();

    public abstract void bredthFirstSearch();

    public abstract void shortestPath();
}
