package com.example.complejas;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

public class Hiperbolicas extends Operations{

    private double exp_1;
    private double exp_2;
    private Complex myLocalComplexAngu1;
    private Complex myLocalComplexAngu2;
    private Complex myLocalComplexCoshi;
    private Complex myLocalComplexSenhi;
    private ComplexFormat myLocalFormatComplex;

    public Hiperbolicas(double complejoA, double complejoB) {
        super(complejoA, complejoB);
        this.myLocalFormatComplex = new ComplexFormat();
        this.myLocalComplexAngu1 = new Complex(0, 0);
        this.myLocalComplexAngu2 = new Complex(0, 0);
        this.myLocalComplexCoshi = new Complex(0, 0);
        this.myLocalComplexSenhi = new Complex(0, 0);
        this.setExp_1(complejoA);
        this.setExp_2(complejoA);
        this.setMyLocalComplexAngu1(complejoB);
        this.setMyLocalComplexAngu2(complejoB);
        this.setMyLocalComplexCoshi(this.exp_1, this.myLocalComplexAngu1, this.exp_2, this.myLocalComplexAngu2);
        this.setMyLocalComplexSenhi(this.exp_1, this.myLocalComplexAngu1, this.exp_2, this.myLocalComplexAngu2);
    }

    public double getExp_1() {
        return exp_1;
    }

    public void setExp_1(double exp_1) {
        this.exp_1 = Math.exp(exp_1);
    }

    public double getExp_2() {
        return exp_2;
    }

    public void setExp_2(double exp_2) {
        this.exp_2 = Math.exp(-exp_2);
    }

    public Complex getMyLocalComplexAngu1() {
        return myLocalComplexAngu1;
    }

    public void setMyLocalComplexAngu1(double b) {
        this.myLocalComplexAngu1 = new Complex(Math.cos(b), Math.sin(b));
    }

    public Complex getMyLocalComplexAngu2() {
        return myLocalComplexAngu2;
    }

    public void setMyLocalComplexAngu2(double b) {
        this.myLocalComplexAngu2 = new Complex(Math.cos(-b), Math.sin(-b));
    }

    public String getMyLocalComplexCoshi() {
        return myLocalFormatComplex.format(myLocalComplexCoshi);
    }

    public void setMyLocalComplexCoshi(double exp_1, Complex myLocalComplexAngu1, double exp_2, Complex myLocalComplexAngu2) {
        Complex temp1 = myLocalComplexAngu1;
        Complex temp2 = myLocalComplexAngu2;
        temp1 = temp1.multiply(exp_1);
        temp2 = temp2.multiply(exp_2);
        Complex lastComplex = temp1;
        lastComplex = lastComplex.add(temp2);
        lastComplex = lastComplex.multiply(0.5);
        this.myLocalComplexCoshi = lastComplex;
    }

    public String getMyLocalComplexSenhi() {
        return myLocalFormatComplex.format(myLocalComplexSenhi);
    }

    public void setMyLocalComplexSenhi(double exp_1, Complex myLocalComplexAngu1, double exp_2, Complex myLocalComplexAngu2) {
        Complex temp1 = myLocalComplexAngu1;
        Complex temp2 = myLocalComplexAngu2;
        temp1 = temp1.multiply(exp_1);
        temp2 = temp2.multiply(exp_2);
        Complex lastComplex = temp1;
        lastComplex = lastComplex.subtract(temp2);
        lastComplex = lastComplex.multiply(0.5);
        this.myLocalComplexSenhi = lastComplex;
    }

    public ComplexFormat getMyLocalFormatComplex() {
        return myLocalFormatComplex;
    }

    public void setMyLocalFormatComplex(ComplexFormat myLocalFormatComplex) {
        this.myLocalFormatComplex = myLocalFormatComplex;
    }
}
