package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2,8);
        ComplexNumber number2 = new ComplexNumber(2,-4);
        System.out.println(number2.add(number1));
        System.out.println(number2.multiple(number1));

    }
}
