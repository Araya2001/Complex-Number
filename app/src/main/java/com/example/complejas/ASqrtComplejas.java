package com.example.complejas;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

public class ASqrtComplejas extends Operations{

    private double magnitud;
    private double modulo_suma;
    private Complex fraccion;
    private ComplexFormat myLocalFormatComplex;
    private Complex resultado;

    public ASqrtComplejas(double complejoA, double complejoB) {
        super(complejoA, complejoB);
        this.myLocalFormatComplex = new ComplexFormat();
        this.setMagnitud(complejoA, complejoB);
        this.setModulo_suma(complejoA, complejoB, getMagnitud());
        this.setFraccion(new Complex(complejoA, complejoB), getMagnitud(), getModulo_suma());
        this.setResultado(getMagnitud(), getFraccion());
    }

    public Complex getResultado() {
        return resultado;
    }

    public void setResultado(double magnitud, Complex fraccion) {
        this.resultado = fraccion;
        this.resultado = resultado.multiply(java.lang.Math.sqrt(magnitud));
    }

    public double getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(double a, double b) {
        this.magnitud = java.lang.Math.sqrt(java.lang.Math.pow(a, 2) + java.lang.Math.pow(b, 2));
    }

    public double getModulo_suma() {
        return modulo_suma;
    }

    public void setModulo_suma(double a, double b, double magnitud) {
        this.modulo_suma = java.lang.Math.sqrt(java.lang.Math.pow((a + magnitud), 2) + java.lang.Math.pow(b, 2));
    }

    public Complex getFraccion() {
        return fraccion;
    }

    public void setFraccion(Complex complejo, double magnitud, double modulo_suma) {
        this.fraccion = complejo;
        this.fraccion = fraccion.add(magnitud);
        this.fraccion = fraccion.divide(new Complex(modulo_suma));
    }

    public String getFraccionString () {
        return myLocalFormatComplex.format(this.getFraccion());
    }

    public String getResultadoString () {
        return myLocalFormatComplex.format(this.getResultado());
    }
}
