package exercises;
import java.util.Scanner;

public class RecArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        String len = input.nextLine();
        float val = Float.parseFloat(len);

        System.out.println("What is the width of the rectangle?");
        String wid = input.nextLine();
        float val2 = Float.parseFloat(wid);

        System.out.println("The length of the rectangle is " + val * val2);
        input.close();
    }

}
