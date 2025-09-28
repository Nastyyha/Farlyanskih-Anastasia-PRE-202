package com.example.task03;

public class ComplexNumber {
    private final double  real;
    private final double imaginary;
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public  double getImaginary(){
        return imaginary;
    }
    public ComplexNumber add(ComplexNumber numb){
        double newReal = this.real + numb.real;
        double newImaginary = this.imaginary + numb.imaginary;
        ComplexNumber sumNumb = new ComplexNumber(newReal,newImaginary);
        return sumNumb;
    }
    public ComplexNumber multiple(ComplexNumber other){
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

}
