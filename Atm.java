package Assa;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("This is Atm machine ");
        Scanner scanner = new Scanner(System.in);
        int bala = 256000;
        System.out.println("1. Balance :");

        System.out.println("2. Deposite Money ");
        System.out.println("3. Withdraw Money ");

        System.out.println("Choose your Comfortable ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Your Balence in Your Account : " + bala);

                break;
            case 2:
                // System.out.println("Your Deposite Money in Your Bank Account : " + bala);
                System.out.println(" Enter the Your deposite money : ");
                int depo = scanner.nextInt();
                System.out.println("Your Balence after the deposite in Your Account : " + bala);
                System.out.println(" Your Balence  after the deposite in Your Bank Account : " + (bala + depo));

                break;
            case 3:
                System.out.println("Enter the withdrad Money : ");
                int witgh = scanner.nextInt();
                if (witgh<= bala) {
                    System.out.println("Your Balence after the Withdraw in Your Account : " + bala);
                    System.out.println("Your Withdraw Money from Your Account in Your Account : " + (bala - witgh));
                    
                }
                else {
                    System.out.println(" unsufficient  Balance");
                }
                

                break;

            default:
                System.out.println(" Enter the valid option");
                break;
        }
    }
}
