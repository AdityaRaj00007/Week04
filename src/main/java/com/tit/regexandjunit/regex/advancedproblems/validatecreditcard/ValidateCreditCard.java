package com.tit.regexandjunit.regex.advancedproblems.validatecreditcard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static boolean validateVisaCard(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
    public static boolean validateMasterCard(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regexVisa = "^4\\d{3} \\d{4} \\d{4} \\d{4}$";
        String regexMasterCard = "^5\\d{3} \\d{4} \\d{4} \\d{4}$";
        System.out.print("Enter a Credit Card Number: ");
        while (true) {
            String string = input.nextLine();
            if (string.equalsIgnoreCase("exit")) {
                break;
            }
            if (validateVisaCard(regexVisa, string)) {
                System.out.println("Valid Visa Card");
            } else if (validateMasterCard(regexMasterCard, string)) {
                System.out.println("Valid MasterCard");
            }
            else {
                System.out.println("Invalid");
            }
            System.out.println("Enter exit to quit!");
        }
        input.close();
    }
}