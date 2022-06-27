/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    private double numGalones;
    private double costoGalones;
    private double iva;

    public void establecerNumGalones(double nG) {
        numGalones = nG;
    }

    public void establecerCostoGalones(double cG) {
        costoGalones = cG;
    }

    public void establecerIva() {
        iva = (costoGalones * numGalones)*10/100;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (costoGalones * numGalones) + iva;
    }

    public double obtenerNumGalones() {
        return numGalones;
    }

    public double obtenerCostoGalones() {
        return costoGalones;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String c = String.format("%s\nNumero de galones: %.2f\n"
                + "Costo de galones: %.2f\n"
                + "Iva: %.2f\n", super.toString(), numGalones, costoGalones, iva);

        return c;
    }
}