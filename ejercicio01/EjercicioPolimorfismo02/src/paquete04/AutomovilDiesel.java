/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
    */ 
    
    double numeroLimax;
    double costolitro;
    double descuentol;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecernumeroLimax(double numero){
        numeroLimax = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecercostolitro(double valor){
        costolitro = valor;
    }
    public void establecerdescuentol(double desc){
        descuentol = desc;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularValorCancelar(){
        valorCancelar = numeroLimax-((numeroLimax*descuentol)/100);
        valorCancelar = valorCancelar*costolitro;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public double obtenernumeroLimax(){
        return numeroLimax; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenercostolitro(){
        return costolitro;
    }
    public double obtenerdescuentol(){
        return descuentol;
    }
    
    public String toString(){
        String cadena = String.format("%s\n"
                        + "Numero Litro: %.2f\n"
                        + "Costo de Litros: %.2f\n"
                        + "Descuento: %.2f\n",
                        super.toString(),
                        obtenernumeroLimax(),
                        obtenercostolitro(),
                        obtenerdescuentol()); 
        return cadena;
    }
}
