package com.kodilla.kalkulator;

public class Calculator {
    int a;
    int b;
    public int sumAAndB(int a, int b){
        int sum = a + b;
        return sum;
    }
    public double subtractAFromB(int a, int b){
        double subtract = b-a;
        return subtract;
    }
    public double subtractBfromA(int a, int b){
        double sub = a - b;
        return sub;
    }
    public static void main (String args[]){
        Calculator calculator = new Calculator();
        calculator.sumAAndB(4, 3);
        System.out.println(calculator.sumAAndB(4,3));
    }
}
