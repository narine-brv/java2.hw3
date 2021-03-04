package com.narine;

public class BankAccount {

    private double amount; //остаток денег на счете

    public void deposit (double sum){
        this.amount += sum;
        System.out.println("Выполнено пополнение счета на сумму: " + sum);
    }

    public void withDraw (int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете для выполнения операции");
        }
        this.amount -= sum;
        System.out.println("Снято со счета сумма в размере: " + sum + "\nОстаток счета составляет: " + amount);

    }

    public double getAmount (){
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
