package com.smeusmihai.homework;

import java.util.Scanner;

public class UsernameValidator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String username;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // Rule 1: No spaces
            boolean hasSpace = false;
            for (int i = 0; i < username.length(); i++) {
                if (username.charAt(i) == ' ') {
                    hasSpace = true;
                    break;
                }
            }
            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                continue;
            }

            // Rule 2: Length between 6 and 12
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                continue;
            }

            // Rule 3: At least one digit
            boolean hasDigit = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                continue;
            }

            // All rules passed
            System.out.println("Username acceptat: " + username);
            break;

        } while (true);

        scanner.close();
    }
}