package com.bill;

import com.bill.enums.SearchAlgorithmEnum;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;

@Slf4j
public class SearchAlgorithmDemo {
    public static void main(String[] args) {
        int arr[] = randomNumber(20);
        Arrays.sort(arr);
        log.info("====");
        Instant startTime = Instant.now();
        int index = SearchFactory.searchFactory(SearchAlgorithmEnum.BinarySearch).searchIndex(arr, 100);
        Instant endTime = Instant.now();
        log.info("====");
        log.info("after search : {}", index);
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
