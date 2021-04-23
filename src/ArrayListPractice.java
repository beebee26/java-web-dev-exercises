package org.launchcode.java.demos.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> wordPhrase = new ArrayList<>();

        wordPhrase.add("I");
        wordPhrase.add("would");
        wordPhrase.add("not");
        wordPhrase.add("could");
        wordPhrase.add("in");

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);

        System.out.println(even(numbers));

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the word?");
        int len = input.nextInt();
        System.out.println(words(wordPhrase, len));
    }
    public static Integer even(ArrayList num) {

        List<Integer> ints = num;
        int sum = 0;

        for(int i = 0; i < ints.size(); i++)
            if (ints.get(i) % 2 == 0) {
                sum += ints.get(i);
            }
        return sum;


    }
    public static String words(ArrayList word, int numb) {
        List<String> wordyWords = word;
        String wordString = "";

        for(String s : wordyWords) {
            if (s.length() == numb) {
                wordString += s + "\t";
            }
        }
        return wordString;
    }
}