package com.company;

import com.company.SearchStrategy.SearchMethod;

import java.util.List;

public class SearchSender {
    private SearchMethod searchMethod;

    public void setMethod(SearchMethod method) {
        this.searchMethod = method;
    }

    public void search(List<String> arr, String pattern) {
        searchMethod.search(arr, pattern);
    }
}
