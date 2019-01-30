package ua.hillel.Ponomarenko.lesson05.task01;

public class Complex implements Comparable<Complex> {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this(real, 0.0);
    }

    public Complex() {
        this(0.0,0.0);
    }


    public Complex plus(Complex complex){
        return new Complex(real+complex.real,imaginary+complex.imaginary);
    }
    public Complex minus(Complex complex){
        return new Complex(real-complex.real,imaginary-complex.imaginary);
    }
    public Complex multiply(Complex complex){
        return new Complex(real*complex.real-imaginary*complex.imaginary,
                imaginary*complex.real+real*complex.imaginary);
    }
    public Complex divide(Complex complex){
        double denominator = complex.real*complex.real+complex.imaginary*complex.imaginary;
        return new Complex((real*complex.real+imaginary*complex.imaginary)/denominator,
                (imaginary*complex.real-real*complex.imaginary)/denominator);
    }


    @Override
    public String toString() {
        if (imaginary == 0.0) {
            return real + "";
        }
        else if (real == 0.0) {
            return imaginary+ " i";
        }
        else {
            return real + " + " + imaginary + " i";
        }
    }

    @Override
    public int compareTo(Complex o) {
        if(absComplex(this)>absComplex(o)){
            return 1;
        }
        if (absComplex(this)<absComplex(o)){
            return -1;
        }
        return 0;
    }

    private double absComplex(Complex complex){
        return complex.real*complex.real+complex.imaginary*complex.imaginary;
    }
}
