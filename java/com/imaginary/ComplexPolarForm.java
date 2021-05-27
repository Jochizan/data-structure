package com.imaginary;

public class ComplexPolarForm {
    private double r;
    private double real;
    private double imaginary;
    private double theta;

    public ComplexPolarForm(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        this.r = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
        this.theta = Math.atan(imaginary / real);
    }

    public static ComplexPolarForm sum(ComplexPolarForm a, ComplexPolarForm b) {
        return new ComplexPolarForm(a.r * Math.cos(a.theta) + b.r * Math.cos(b.theta), a.r * Math.sin(a.theta) + b.r * Math.sin(b.theta));
    }

    public static ComplexPolarForm multiply(ComplexPolarForm a, ComplexPolarForm b) {
        return new ComplexPolarForm(a.r * b.r * Math.cos(b.theta + a.theta), Math.sin(a.theta + b.theta));
    }

    public void toWriteNormal() {
        System.out.println("El complejo es: " + String.format("%.2f", real) + " + imaginario " + String.format("%.2f", imaginary));
    }

    public void toWritePolar() {
        // Los angulos estan en radianes
        System.out.println("Su forma polar: " + String.format("%.2f", r)
                + "(cos(" + String.format("%.2f", theta) + ") + isen(" + String.format("%.2f", theta) + "))\n"
        );
    }
}
