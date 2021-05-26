package com.example.complejas;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;


public abstract class Operations {

    private double complejoA;
    private double complejoB;
    private String complejoT;
    private Complex myComplex;
    private ComplexFormat myComplexFormat;

    public Operations(double complejoA, double complejoB) {
        this.complejoA = 0;
        this.complejoB = 0;
        this.myComplex = new Complex(complejoA, complejoB);
        this.myComplexFormat = new ComplexFormat();
        setComplejoT(myComplex);
    }

    public ComplexFormat getMyComplexFormat() {
        return myComplexFormat;
    }

    public void setMyComplexFormat(ComplexFormat myComplexFormat) {
        this.myComplexFormat = myComplexFormat;
    }

    public String getComplejoT() {
        return complejoT;
    }

    public void setComplejoT(Complex complejoT) {
        this.complejoT = myComplexFormat.format(complejoT);
    }

    public double getComplejoB() {
        return complejoB;
    }

    public void setComplejoB(double complejoB) {
        this.complejoB = complejoB;
    }

    public double getComplejoA() {
        return complejoB;
    }

    public void setComplejoA(double complejoA) {
        this.complejoB = complejoA;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "complejoA=" + complejoA +
                ", complejoB=" + complejoB +
                ", complejoT=" + complejoT +
                '}';
    }

}
