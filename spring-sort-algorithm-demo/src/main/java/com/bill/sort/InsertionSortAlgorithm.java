package com.bill.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertionSortAlgorithm implements ISortAlgorithm{
    @Override
    public void sort(int[] arr) {
        int count = 0;
        int[] originArr = null;

        for(int i=1; i<arr.length; i++) {
            if(arr[i]>arr[i-1]) {
                count++;
//                log.info("step {}: {}", count, arr);
                continue;
            }
            for(int j=i; j>0; j--) {
                count++;
                originArr = arr.clone();
                if(arr[j]>arr[j-1]) {
//                    log.info("step {}: {}", count, arr);
                    continue;
                }
                //swap
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
//                log.info("step {}: {} -> {}", count, originArr, arr);
            }
        }
    }
}
