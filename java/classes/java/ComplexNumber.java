package classes.java;

import java.lang.Math;

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
        System.out.println("EL complejo es: " + real + " + imaginario " + imaginary);
    }

    public float absolute(ComplexNumber complexNumber) {
        float value;
        value = complexNumber.real * complexNumber.real + complexNumber.imaginary * complexNumber.imaginary;
        value = (float) Math.sqrt(value);
        return value;
    }
}
