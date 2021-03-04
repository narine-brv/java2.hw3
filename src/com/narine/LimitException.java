package com.narine;

public class LimitException extends Exception {

    private String message;
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public LimitException (String message){
        super(message);
    }

    public double getRemainingAmount (){
        return remainingAmount;
    }

}
