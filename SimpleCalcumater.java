package Assa;

import java.util.Scanner;

public class SimpleCalcumater {
    public static void main(String[] args) {
        System.out.println("this is Simple Calculater ........");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1 number of : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2 number of : ");
        int num2 = scanner.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.println("Enter the operation number ----");
        int operator1 = scanner.nextInt();
        switch (operator1) {
            case 1:
                System.out.println("Addition of two number = " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Addition of two number = " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Addition of two number = " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Addition of two number = " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            default:
                break;
        }
    }
}
