package org.launchcode.java.demos.collections;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountingCharacterClass {
    public static void main (String[] args) throws IOException {
        //String to iterate and count

        int count = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a string to count: ");
        //String rawString = input.nextLine();
        Path fileName = Path.of("C://Users/nahli/lc101/java-practice/chapter-1/java-web-dev-exercises/stringfile.txt");
        //String content  = "";

        String rawString = Files.readString(fileName);
        System.out.println(rawString);

        HashMap<Character,Integer> characters = new HashMap<Character, Integer>();

        for (int i=0; i < rawString.length(); i++){
            char charInLoop = rawString.charAt(i);

            if (java.lang.Character.isLetter(charInLoop)) {
                if (!characters.containsKey(charInLoop)) {
                    characters.put(charInLoop, 1);
                } else {
                    characters.put(charInLoop, characters.get(charInLoop) + 1);
                }
            }
        }
        System.out.println("characters hashmap contains: " + characters);
    }
}
