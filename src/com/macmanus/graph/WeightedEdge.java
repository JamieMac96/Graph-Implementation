package com.macmanus.graph;

// This class contains the
//
public class WeightedEdge {
    private int nodexIndex;
    private int weight;

    WeightedEdge(int nodexIndex, int weight){
        this.nodexIndex = nodexIndex;
        this.weight = weight;
    }

    public int getNodexIndex(){
        return nodexIndex;
    }

    public int getWeight(){
        return weight;
    }

    public void setNodexIndex(){
        this.weight = weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "(" + nodexIndex + ": " + weight + ")";
    }
}
