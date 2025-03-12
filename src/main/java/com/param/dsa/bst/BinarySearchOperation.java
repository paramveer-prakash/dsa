package com.param.dsa.bst;

public enum BinarySearchOperation {

    EXACT_MATCH,
    FIND_CLOSEST;

    public boolean isFindClosest(){
        if(this.equals(BinarySearchOperation.FIND_CLOSEST)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
