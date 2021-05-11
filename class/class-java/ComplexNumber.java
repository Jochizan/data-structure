import java.lang.Math;

public class ComplexNumber {
    float real;
    float imaginary;

    ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void toAssign(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void toWrite() {
        System.out.println("EL complejo es: " + real + " + imaginario " + imaginary);
    }

    float absolute(ComplexNumber complexNumber) {
        float value;
        value = complexNumber.real * complexNumber.real + complexNumber.imaginary * complexNumber.imaginary;
        value = (float) Math.sqrt(value);
        return value;
    }
}
