package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int index = 0;
        for (int i = 0; i < elements.length; i++){
            int min = elements[i];
            index = i;
            for (int j = i; j < elements.length; j++){
                if (elements[j] < min){
                    min = elements[j];
                    index = j; 
                }
            }
            elements[index] = elements[i];
            elements[i] = min;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int index = 0;
        for (int i = 0; i < words.size(); i++){
            String minWord = words.get(i);
            index = i;
            for (int j = i; j < words.size(); j++){
                int diff = minWord.compareTo(words.get(j));
                if (diff > 0){
                    minWord = words.get(j);
                    index = j; 
                }
            }
            words.add(index, words.remove(i));
            words.remove(index - 1);
            words.add(i, minWord);
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
