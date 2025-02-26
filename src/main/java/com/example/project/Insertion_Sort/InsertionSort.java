package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int counter = 0;
        for (int i = 0; i < elements.length; i++){
            int idx = i;
            for (int j = i + 1; 0 < j && j < elements.length && elements[j] < elements[idx]; j--){
                counter++;
                if (elements[j] < elements[idx]){
                    int temp = elements[j];
                    elements[j] = elements[idx];
                    elements[idx] = temp;
                    idx--;
                }else {
                    break;
                }
            }
        }
        System.out.println(counter);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int index = 0;
        int counter = 0;
        for (int i = 0; i < elements.length; i++){
            int min = elements[i];
            index = i;
            for (int j = i; j < elements.length; j++){
                if (elements[j] < min){
                    min = elements[j];
                    index = j; 
                }
                counter++;
            }
            elements[index] = elements[i];
            elements[i] = min;
        }
        System.out.println(counter);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int counter = 0;
        for (int i = 0; i < words.size(); i++){
            int idx = i;
            for (int j = i + 1; 0 < j && j < words.size() && words.get(j).compareTo(words.get(idx)) < 0; j--){
                if (words.get(j).compareTo(words.get(idx)) < 0){
                    counter++;
                    String temp = words.get(idx);
                    words.add(idx, words.remove(j));
                    words.remove(idx + 1);
                    words.add(j, temp);
                    idx--;
                }else {
                    break;
                }
            }
        }
        System.out.println(counter);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int counter = 0;
        int index = 0;
        for (int i = 0; i < words.size(); i++){
            String minWord = words.get(i);
            index = i;
            for (int j = i; j < words.size(); j++){
                counter++;
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
        System.out.println(counter);
        return words;
    }

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