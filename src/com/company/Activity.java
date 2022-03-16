package com.company;

import java.util.*;

public class Activity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> user = new HashMap<>();

        int counter = 0;
        int upperCount = 0;
        int numCount = 0;
        int charCount = 0;
        String password = "";

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();

        do {
            counter = 0;
            upperCount = 0;
            numCount = 0;
            charCount = 0;

            System.out.print("\nEnter password: ");
            password = scanner.nextLine();

            if (password.length() >= 8) {
                counter++;
            }

            for (char letter : password.toCharArray()) {
                if (Character.isUpperCase(letter)) {
                    upperCount++;
                }

                if (Character.isDigit(letter)) {
                    numCount++;
                }

                if (!Character.isLetterOrDigit(letter) && letter != ' ') {
                    charCount++;
                }
            }

            if (upperCount >= 1) {
                counter++;
            }

            if (numCount >= 1) {
                counter++;
            }

            if (charCount >= 1) {
                counter++;
            }

            if (counter >= 4) {
                System.out.println("Password made successfully.\n");
            }

        } while (counter < 4);

        user.put(userName, password);

        int i = 0;
        String enteredUserName;
        do {
            System.out.print("Enter username again: ");
            enteredUserName = scanner.nextLine();
            i++;
            /*
            if (!userName.equals(enteredUserName)) {
                System.out.println("No users with that username.\n");
            }
            */
            if (!user.containsKey(enteredUserName)) {
                System.out.println("No users with that username.\n");
            }
            if (enteredUserName.equals(userName)) {
                break;
            }
        } while (!enteredUserName.equals(userName));

        i = 0;
        String enteredPassword;
        do {
            System.out.print("Enter password again: ");
            enteredPassword = scanner.nextLine();
            i++;
            if(user.get(enteredUserName).equals(enteredPassword)){
                System.out.println("\nSuccessfully logged in.");
                break;
            }
           /*
           if (enteredPassword.equals(password)) {
                System.out.println("\nSuccessfully logged in.");
                break;
            }
            */
            if (i >= 3) {
                System.out.println("\nYou entered wrong the password 3 times. Your account is blocked.");
                user.remove(userName);
                break;
            }
        } while (!enteredPassword.equals(password));

        userName = user.get(userName);

        System.out.println("Logged in users: " + userName + "\n");

        Set<String> countries = new HashSet<>();

        while (i <= 3) {
            System.out.print("Enter a country: ");
            countries.add(scanner.nextLine());
            i++;
        }

        System.out.println("\nCountry set is: " + countries);
        /*
        for (String country : countries) {
            if (country.startsWith("D")){
                countries.remove(country);
            }
        }
        */

        countries.removeIf(country -> country.startsWith("D") || country.startsWith("d"));

        System.out.println("Countries without ones starting with D: " + countries);

    }
}
