package com.bill;

import com.bill.sort.*;
import com.bill.enums.SortAlgorithmEnum;

public class SortFactory {
    public static ISortAlgorithm sortFactory(SortAlgorithmEnum enums) {
        switch (enums) {
            case BubbleSort:
                return new BubbleSortAlgorithm();
            case SelectionSort:
                return new SelectionSortAlgorithm();
            case InsertionSort:
                return new InsertionSortAlgorithm();
            case MergeSort:
                return new MergeSortAlgorithm();
            case ShellSort:
                return new ShellSortAlgorithm();
        }
        return null;
    }
}
