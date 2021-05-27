package com.imaginary;

public class ComplexNumber {
    float real;
    float imaginary;

    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void toAssign(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void toWrite() {
        System.out.println("El complejo es: " + real + " + imaginario " + imaginary);
    }

    public float absolute(ComplexNumber complexNumber) {
        float answer;
        answer = complexNumber.real * complexNumber.real + complexNumber.imaginary * complexNumber.imaginary;
        answer = (float) Math.sqrt(answer);
        return answer;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        float newReal = real + complexNumber.real;
        float newImaginary = imaginary + complexNumber.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        float newReal = real * complexNumber.real - imaginary * complexNumber.imaginary;
        float newImaginary = real * complexNumber.imaginary - imaginary * complexNumber.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public void denial() {
        real = -real;
        imaginary = -imaginary;
        toWrite();
    }
}
