package com.bill.search;

public class InterpolationSearchAlgorithm implements ISearchAlgorithm{
    @Override
    public int searchIndex(int[] arr, int target) {
        /**
         * x1, y1 = begin, arr[begin]
         * x2, y2 = end, arr[end]
         * x, y = index target
         * x = (y-y1)(x2-x1)/(y2-y1) + x1
         */
        int begin = 0;
        int end = arr.length-1;
        int index;
        int count = 0;
        while(begin <= end) {
            index = (target - arr[begin]) * (end - begin) / (arr[end] - arr[begin]) + begin;
            if(arr[index] == target) return index;

            if(target>arr[index])
                begin = index+1;
            else
                end = index-1;
        }

        return -1;
    }
}
