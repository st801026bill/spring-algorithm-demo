package com.bill.search;

public class LinearSearchAlgorithm implements ISearchAlgorithm{
    @Override
    public int searchIndex(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i])
                return i;
        }
        return -1;
    }
}
