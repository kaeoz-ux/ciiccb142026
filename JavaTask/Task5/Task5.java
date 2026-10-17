package JavaTask.Task5;
import java.util.Scanner;

class Task5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = s.nextDouble();

         if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } 
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } 
        else if (num1 <= num2 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } 
        else {
            System.out.println("The largest number is: " + num3);
        }

    }
}
