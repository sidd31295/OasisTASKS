package Rihanna;

import java.util.Scanner;

public class InterfaceATM {
    public static void main(String[] args)
    {
        int pin = 1234;
        int balance = 10000;
        int Addamount = 0;
        int Takeamount = 0;

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter your pin number: ");
        int password = scanner.nextInt();
        scanner.nextLine();
        if(password == pin)
        {
            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.println("Welcome "+ name);

            while (true)
            {
                System.out.println("Press 1 to check your Balance ");
                System.out.println("Press 2 to Withdraw Money ");
                System.out.println("Press 3 to Deposit Money ");
                System.out.println("Press 4 to Transfer Money ");
                System.out.println("Press 5 to EXIT ");
                System.out.println("================================");

                int option = scanner.nextInt();
                switch (option)
                {
                    case 1:
                        System.out.println("================================");
                        System.out.println("Your current Balance is : "+balance);
                        System.out.println("================================");
                        break;
                    case 3:
                        System.out.print("Enter the amount you want to enter : ");
                        Addamount = scanner.nextInt();
                        System.out.println("================================");
                        System.out.println("Amount credited Sucessfully!");
                        System.out.println("================================");
                        balance=Addamount + balance;
                        break;
                    case 2:
                        System.out.print("How much amount do you want to withdraw:   ");
                        Takeamount = scanner.nextInt();
                        if(Takeamount>balance)
                        {
                            System.out.println("================================");
                            System.out.println("Insufficient Balance!");
                            System.out.println("Try Less than your current balance account");
                            System.out.println("================================");
                        }
                        else
                        {   System.out.println("================================");
                            System.out.println("Amount debited Sucessfully!");
                            System.out.println("================================");
                        }
                        balance = balance - Takeamount;
                        break;
                    case 4:
                        int a=0;
                        System.out.println("================================");
                        System.out.println("Enter the amount you want to transfer : ");
                        System.out.println("--------------------------------");
                        a= scanner.nextInt();
                        System.out.println("Enter the Account No of Reciever");
                        scanner.nextInt();
                        System.out.println("--------------------------------");
                        System.out.println("Amount Transferred!");
                        balance=balance-a;
                        System.out.println("--------------------------------");
                        System.out.println("Current Balance : "+balance);
                        System.out.println("--------------------------------");
                        System.out.println("Thank You Visit Again :)");
                        System.out.println("================================");
                        break;
                    case 5:
                        System.out.println("Collect Your Card :)");
                        System.exit(0);

                }
                if(option>5)
                {
                    System.out.println("Invalid Operation");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Wrong Pin Number!");
        }
    }
}
