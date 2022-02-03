package Login;

import java.util.Scanner;
public class LoginPassword {
    public void loginpassword() {
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
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }
    }
}
