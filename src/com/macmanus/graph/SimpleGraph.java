package com.macmanus.graph;

import com.macmanus.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SimpleGraph<T> extends AbstractGraph<T> {

    @Override
    public boolean addEdge(int from, int to) {
        if(containsEdge(from, to)) return false;
        checkIndex(to);
        checkIndex(from);

        adjacencyList.get(from).add(to);

        if(from != to) adjacencyList.get(to).add(from);

        return true;
    }

    @Override
    public boolean addEdge(T from, T to) {
        int fromIndex = -1;
        int toIndex = -1;

        for(int i = 0; i < nodes.size(); i++){
            T current = nodes.get(i);
            if(checkEquality(current, from)){
                fromIndex = i;
            }
            if(checkEquality(current, to)){
                toIndex = i;
            }
        }

        if(fromIndex == -1 || toIndex == -1){
            return false;
        }
        else{
            return addEdge(fromIndex, toIndex);
        }
    }

    @Override
    public String toString(){
        String output = "";

        for(int i = 0; i < nodes.size(); i++){
            output += i + ":(" + nodes.get(i) + ") ===>"
                    + adjacencyList.get(i).toString() + "\n";
        }

        return output;
    }

    private boolean checkEquality(T genericOne, T genericTwo){
        if(genericOne != null) {
            Object genericObj = ((Object) genericOne);
            if (genericObj.equals(genericTwo)) {
                return true;
            }
        }
        return false;
    }
}
