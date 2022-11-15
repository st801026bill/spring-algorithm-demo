package com.bill.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSortAlgorithm implements ISortAlgorithm{
    @Override
    public void sort(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            count++;
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIdx]) minIdx = j;
            }

            //swap
            int[] originArr = arr.clone();
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
//            log.info("step {}: {} -> {}", count, originArr, arr);
        }
    }
}
