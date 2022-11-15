package com.bill.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MergeSortAlgorithm implements ISortAlgorithm{

    public void sort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if(left >= right) return;

        int mid = (left+right) / 2;
        // 分割左半邊陣列
        mergeSort(arr, temp, left, mid);
        // 分割右半邊陣列
        mergeSort(arr, temp, mid+1, right);
        // 合併
        merge(arr, temp, left, mid, right);
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int tempLeft = left;
        int tempRight = mid+1;
        int tempIndex = 0;

        // 1. 左右子序列比較大小，較小的放進temp中
        while(tempLeft <= mid && tempRight <= right) {
            if (arr[tempLeft] <= arr[tempRight]) {
                temp[tempIndex++] = arr[tempLeft++];
            } else {
                temp[tempIndex++] = arr[tempRight++];
            }
        }

        // 2. 把左序列剩餘的資料放進temp中
        while(tempLeft <= mid) {
            temp[tempIndex++] = arr[tempLeft++];
        }

        // 3. 把右序列剩餘的資料放進temp中
        while(tempRight <= right) {
            temp[tempIndex++] = arr[tempRight++];
        }

        // 4. 將 tmep 陣列的元素 copy 到 arr , 並不是每次都 copy 所有
        tempIndex = 0;
        tempLeft = left; // 用於暫時遍歷 temp 陣列
        while(tempLeft <= right) {
            arr[tempLeft++] = temp[tempIndex++];
        }
    }
}
