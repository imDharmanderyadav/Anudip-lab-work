import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Finding the maximum using the ternary operator
        double max = (num1 > num2) ? num1 : num2;
        
        // Print the maximum number
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
}
