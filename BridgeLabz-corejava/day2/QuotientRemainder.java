import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = inputScanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = inputScanner.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2 + ".");

        inputScanner.close();
    }
}
