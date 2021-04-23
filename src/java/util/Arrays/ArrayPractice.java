package org.launchcode.java.demos.collections;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int students[] = new int[] {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat them with a mouse.";
        String words[] = new String[100];
        int numWords = 0;
        for(int i=0; i<students.length; i++){
            if (students[i] % 2 != 0) {
                System.out.println(students[i]);
            }
        }
        for (String retval: phrase.split("\\.")){
            System.out.println(retval);
            if (!retval.equals("")) {
                words[numWords] = retval;
                numWords++;
            }
        }

        System.out.println(Arrays.toString(words));

    }
}