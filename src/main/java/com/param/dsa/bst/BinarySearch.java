package com.param.dsa.bst;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public static <T> T binarySearch(List<T> inputs, T target, Comparator<T> comparator, BinarySearchOperation bstOperation){

        T[] s = (T[]) inputs.toArray();

        int start = 0;
        int end = s.length;
        T closest = null;

        if(comparator==null){
            comparator = (x,y)->((Comparable)x).compareTo((Comparable)y);
        }

        // Determine if the array is sorted in ascending or descending order
        boolean ascending = ((Comparable)s[0]).compareTo((Comparable)s[s.length - 1])<=0;

        while(start<=end){
            int mid = start + (end - start) / 2;
            T elementAtMid = s[mid];

            int comparison = comparator.compare(elementAtMid, target);

            if(comparison==0){
                return elementAtMid;
            }
            boolean moveRight = ((Comparable)elementAtMid).compareTo((Comparable)target) < 0  == ascending ;

            if (moveRight) {
                if(bstOperation.isFindClosest()){
                    closest=elementAtMid;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(bstOperation.isFindClosest()){
            return closest;
        }
        return null;
    }

}
