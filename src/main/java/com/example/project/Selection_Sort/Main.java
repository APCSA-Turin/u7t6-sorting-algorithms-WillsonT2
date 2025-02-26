package com.example.project.Selection_Sort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        words = SelectionSort.selectionSortWordList(words);
        
    }
}
