package com.macmanus.graph;

import java.util.ArrayList;
import java.util.List;

/*
 * This class contains the common functionality between AbstractGraph
 * and AbstractWeightedGraph
 */
public abstract class BaseAbstractGraph<T> implements Graph<T>{
    List<T> nodes;

    BaseAbstractGraph(){
        nodes = new ArrayList<>();
    }

    @Override
    public void setNode(int index, T node) {
        nodes.set(index, node);
    }

    @Override
    public T getNode(int index) {
        return nodes.get(index);
    }

    @Override
    public List<T> getNodes(){
        return nodes;
    }

    // Returns the indices of the nodes visited when running the DFS
    @Override
    public List<Integer> depthFirstSearch(int source) {
        int numNodes = nodes.size();
        boolean[] visited = new boolean[numNodes];
        List<Integer> visitedNodeIndices = new ArrayList<>();

        return dfsRecursive(visited, visitedNodeIndices, source);
    }

    void checkIndex(int index){
        if(index < 0 || index >= nodes.size()){
            throw new IndexOutOfBoundsException("Size: "
                    + nodes.size() + ". Index: " + index);
        }
    }

    boolean checkEquality(T genericOne, T genericTwo){
        if(genericOne != null && genericTwo != null) {
            Object genericObj = ((Object) genericOne);
            if (genericObj.equals(genericTwo)) {
                return true;
            }
        }
        return false;
    }

    int getNodeIndex(T node){
        int nodeIndex = -1;

        for(int i = 0; i < nodes.size(); i++){
            T current = nodes.get(i);
            if(checkEquality(current, node)){
                nodeIndex = i;
            }
        }

        return nodeIndex;
    }

    protected abstract List<Integer> dfsRecursive(boolean[] visited, List<Integer> visitedNodeIndices, int nodeIndex);
}
