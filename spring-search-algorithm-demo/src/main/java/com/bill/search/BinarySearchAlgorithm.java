package com.bill.search;

public class BinarySearchAlgorithm implements ISearchAlgorithm{
    @Override
    public int searchIndex(int[] arr, int target) {

        int begin = 0, end = arr.length-1;
        int mid = arr.length/2;
        do {
            if(target == arr[mid]) return mid;

        } while(arr[i] != target);
        return i;
    }
}
