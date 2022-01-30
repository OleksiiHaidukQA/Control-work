package Controlwork;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {

        String Username = "Oleksii";
        String Password = "371";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username : ");
        String username = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Access Granted! Welcome!");
            System.out.println("Enter number from 1 to 5: ");
            int number = sc.nextInt();

            if (number == 1) {
                new Fibonacci().fibonacci();

                if (number == 2) {
                    new EvenNumber().evennumber();

                    if (number == 3) {
                        new Replace().replace();

                        if (number == 4) {
                            new Reverse().reverse();

                            if (number == 5) {
                                new Armstrong().armstrong();
                            }


                        } else {
                            System.out.println("Invalid number");
                        }
                    } else if (username.equals(Username)) {
                        System.out.println("Invalid Password!");
                    } else if (password.equals(Password)) {
                        System.out.println("Invalid Username!");
                    } else {
                        System.out.println("Invalid Username & Password!");
                    }
                }
            }
        }
    }
}