/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;



/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nomPro;
    protected String placa;
    protected double valorCancelar;

    public void establecerNomPro(String np) {
        nomPro = np;
    }

    public void establecerPlaca(String p) {
        placa = p;
    }

    public void calcularValorCancelar() {
    }

    public String obtenerNomPro() {
        return nomPro;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String c = String.format("*************DATOS DEL AUTOMOVIL*************\n"
                + "Nombre del propietario: %s\n"
                + "Placa del automovil: %s\n\n"
                + "Valor total a cancelar: %.2f\n\n", nomPro, placa, valorCancelar);
        return c;
    }
}