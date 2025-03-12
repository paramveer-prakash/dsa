package com.param.dsa.bst;

public enum BinarySearchOperation {

    EXACT_MATCH,
    FIND_CLOSEST;

    public boolean isFindClosest(){
        return this == FIND_CLOSEST;
    }
}
