package com.bill;

import com.bill.enums.SearchAlgorithmEnum;
import com.bill.search.ISearchAlgorithm;
import com.bill.search.LinearSearchAlgorithm;

public class SearchFactory {
    public static ISearchAlgorithm searchFactory(SearchAlgorithmEnum enums) {
        switch (enums) {
            case LinearSearch:
                return new LinearSearchAlgorithm();
        }
        return null;
    }
}
