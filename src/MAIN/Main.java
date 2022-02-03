package MAIN;
import Armstrong.Armstrong;
import EvenNumber.EvenNumber;
import Fibonacci.Fibonacci;
import Login.LoginPassword;
import Replace.Replace;
import Reverse.Reverse;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new LoginPassword().loginpassword();

        int number = sc.nextInt();
        switch (number) {

            case 1:
                new Fibonacci().fibonacci();
                break;

            case 2:
                new EvenNumber().evennumber();
                break;

            case 3:
                new Replace().replace();
                break;

            case 4:
                new Reverse().reverse();
                break;

            case 5:
                new Armstrong().armstrong();
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}



