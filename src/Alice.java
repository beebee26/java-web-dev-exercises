package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String para = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word to search");
        String search = input.nextLine();

        int intIndex = para.indexOf(search);

        if(intIndex == - 1) {
            System.out.println(search + " not found");}
        else {
                System.out.println(search + " found");
        }
    }
}