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

    void checkIndex(int index){
        if(index < 0 || index >= nodes.size()){
            throw new IndexOutOfBoundsException("Size: "
                    + nodes.size() + ". Index: " + index);
        }
    }

    protected boolean checkEquality(T genericOne, T genericTwo){
        if(genericOne != null && genericTwo != null) {
            Object genericObj = ((Object) genericOne);
            if (genericObj.equals(genericTwo)) {
                return true;
            }
        }
        return false;
    }
}
