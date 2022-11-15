package com.bill;

import com.bill.enums.SortAlgorithmEnum;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;

/**
 *  SortAlgorithmEnum:
 *  1. BubbleSort
 *  2. SelectionSort
 *  3. InsertionSort
 *  4. MergeSort
 */

@Slf4j
public class SortAlgorithmDemo {
    public static void main(String[] args) {
//        int arr[] = {8, 4, 5, 7, 1, 3, 6, 2};
//        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr[] = randomNumber(20);
        log.info("before sort : {}", arr);
        log.info("====");
        Instant startTime = Instant.now();
        SortFactory.sortFactory(SortAlgorithmEnum.ShellSort).sort(arr);
        Instant endTime = Instant.now();
        log.info("====");
        log.info("after sort : {}", arr);
        log.info("cost time: {} ms", Duration.between(startTime, endTime).toMillis());
    }

    private static int[] randomNumber(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
        }
        return arr;
    }
}
