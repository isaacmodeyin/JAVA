//Always remember to name your java files with your class name.

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int first, second, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        second = scanner.nextInt();

        sum = first + second; 

        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }
}
// compile your file with javac in the terminal EXAMPLE: javac AddTwoNumbers.java
// Then run the file with: java AddTwoNumbers