package com.bill;

import com.bill.enums.SearchAlgorithmEnum;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;

@Slf4j
public class SearchAlgorithmDemo {
    public static void main(String[] args) {
        int n = 20;
//        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26};
        int arr[] = randomNumber(n);
        int target = (int)(Math.random() * n);
        Arrays.sort(arr);

        log.info("====");
        log.info("before search, arr: {}, target: {}", arr, target);
        Instant startTime = Instant.now();
        int index = SearchFactory.searchFactory(SearchAlgorithmEnum.InterpolationSearch).searchIndex(arr, target);
        Instant endTime = Instant.now();
        log.info("====");
        log.info("after search : {}", index);
        log.info("cost time: {} ms", Duration.between(startTime, endTime).toMillis());
    }

    private static int[] randomNumber(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
