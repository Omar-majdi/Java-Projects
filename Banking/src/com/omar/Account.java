package com.omar;

import java.util.Scanner;

public class Account {

   private int balance;
   private int previousTransaction;
   private final String customerName;
   private final String customerID;
   private final int defaultIdLength = 6;

    //Class constructor
    Account(String cname, String randomID) {
        customerName = cname;
        customerID = randomID(defaultIdLength);
    }
    //Function for give a random ID
    private String randomID(int length){
        String idSet = "123456789";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int random = (int) (Math.random() * idSet.length());
            password[i] = idSet.charAt(random);
        }
        return new String(password);
    }

    //Function for Depositing money
   private void deposit(int amount) {
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Function for WithDrawing money
    private void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing the previous transaction
    private void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }else if (previousTransaction < 0){
            //We use the (abs) because up of this method the previousTransaction is negative.
            System.out.println("With drawing: " + Math.abs(previousTransaction));
        }else {
            System.out.println("No transaction occurred");
        }
    }

    //Function calculating interest of current funds after a number of years
    private void calculateInterest(int years){
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years);
        //We multiply the interestRate by 100 because its a decimal number.
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years +"Years, your balance will be " + newBalance);
    }
    //Function showing the main menu
    public void showMenu(){
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                //case A allow the user to check there balance
                case 'A' -> {
                    System.out.println("======================================");
                    System.out.println("Balance = $" + Math.abs(balance));
                    System.out.println("======================================");
                    System.out.println();
                }

                //Case B allows the user to deposit money into their account using deposit();
                case 'B' -> {
                    System.out.println("Enter the amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                }

                //Case C allows user withdraw money from their account using withdraw();
                case 'C' -> {
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                }

                //Case D allows user to view their most recent transaction using getPreviousTransaction();
                case 'D' -> {
                    System.out.println("=========================================");
                    getPreviousTransaction();
                    System.out.println("==========================================");
                    System.out.println();
                }

                // Case E calculate the accrued interest on the account after a number of years
                case 'E' -> {
                    System.out.println("Enter how many years of accrued interest: ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                }

                //Case F exits the user from their account
                case 'F' -> System.out.println("==========================================");
                default -> System.out.println("Error: invalid option. Please Enter A,B,C,D,E,F");
            }
        }
        while (option != 'F');
        System.out.println("Thank you for using my Bank");
    }
}
