package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;

        System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.add(firstNumber, secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.subtract(firstNumber, secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.multiply(firstNumber, secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.divide(firstNumber, secondNumber));

        try {
            System.out.println(firstNumber + " / 0 = " + calculator.divide(firstNumber, 0));
        } catch (ArithmeticException exception) {
            System.out.println(firstNumber + " / 0 -> Error: " + exception.getMessage());
        }
    }
}
