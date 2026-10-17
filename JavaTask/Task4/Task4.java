package JavaTask.Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inpuString = s.nextLine();
        s.close();

        String reverse = new StringBuilder(inpuString).reverse().toString();

        if (inpuString.equalsIgnoreCase(reverse)){
            System.out.println("The input string is a palindrome.");
        }
        else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
