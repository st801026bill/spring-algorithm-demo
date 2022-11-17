package com.bill.search;

public class BinarySearchAlgorithm implements ISearchAlgorithm{
    @Override
    public int searchIndex(int[] arr, int target) {
        int begin = 0, end = arr.length-1;
        int index = 0;
        while(begin <= end) {
            index = (begin+end)/2;
            if(target == arr[index]) return index;
            if(target>arr[index]) {
                begin = index+1;
            } else {
                end = index-1;
            }
        }

        return -1;
    }
}
