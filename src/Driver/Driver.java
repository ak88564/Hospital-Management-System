package Driver;

import Service.HospitalService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        HospitalService hService = new HospitalService();
        Scanner sc = new Scanner(System.in);
        outer:while(true){
            System.out.println("Options");
            System.out.println("1. Create Account");
            System.out.println("2. Update the fees status");
            System.out.println("3. Overview");
            System.out.println("4. Exit");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("You selected create account");
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter the fees of the patient");
                    BigDecimal amount = sc.nextBigDecimal();
                    hService.createAccount(name, amount);
                    break;

                case 2:
                    System.out.println("You selected- Update fees status");
                    System.out.println("Enter account number");
                    int acc = sc.nextInt();
                    System.out.println("Enter text: Paid/Unpaid");
                    String text = sc.next();
                    hService.updateFeesStatus((Integer) acc, text);
                    break;

                case 3:
                    System.out.println("You selected overview");
                    System.out.println("Enter account number");
                    hService.overview();
                    break;

                case 4:
                    System.out.println("Application stopped");
                    break outer;

                default:
                    System.out.println("You have selected invalid option");
                    break;
            }
        }
    }
}
