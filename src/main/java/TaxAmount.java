/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class TaxAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();
        double total = amount;
        double tax = 0;

        if(state.compareTo("WI") == 0) {
            tax = 0.055 * amount;
            total += tax;
            System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f",amount,tax,total);
            return;
        }
        System.out.printf("The total is $%.2f",total);
    }
}




