package PasswordChecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scan.nextLine();

        Password pass = new Password(password);

        pass.checker();
        pass.printScore();

        scan.close();
    }
}