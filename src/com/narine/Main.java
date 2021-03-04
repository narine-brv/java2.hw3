package com.narine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("На счету: " + bankAccount.getAmount());
        System.out.println("Сумма пополнения: ");
        bankAccount.deposit(scanner.nextDouble());
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}
