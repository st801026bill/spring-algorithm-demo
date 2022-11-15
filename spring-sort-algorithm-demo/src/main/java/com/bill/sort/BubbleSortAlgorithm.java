package com.bill.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSortAlgorithm implements ISortAlgorithm{
    public void sort(int[] arr) {
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                count++;

                //swap
                int[] originArr = arr.clone();
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
//                log.info("step {}: {} -> {}", count, originArr, arr);
            }
        }
    }
}
