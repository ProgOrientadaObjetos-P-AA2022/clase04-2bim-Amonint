/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        String[] nombres = {"Austin", "Monique", "Glen", "Richard", "Patrick"};
        String[] apellidos = {"Martinez", "Lyons", "Kim", "Tate", "Lee"};
        int[] edad = {9, 70, 35, 23, 10};
        double pasajeFijo = 0.4;
        
        /*
        Generar un proceso que permita iterar los arreglos; el objetivo es 
        crear objetos de tipo Pasaje Menor de edad, Pasaje Normal, Pasaje 
        Universitario y Pasaje Tercera Edad. Los arreglos tienen una 
        característica, las posiciones se corresponden; por ejemplo, todas las 
        posiciones 0, crearán un objeto de cualquiera de los tipos nombrados de
        Pasajes.
        Cada objeto creado será agregado a la lista pasajes.
        
        ¿Cómo saber a que tipo de Pasaje pertenece cada objeto? Usar la edad 
        como discriminatoria.
        
        menor de edad: mayor o igual a 0 y menor o igual a 18
        universitario: mayor a 18 y menor o igual a 25
        normal: mayor a 25 y menor 65
        tercera edad: mayor o igual a 65
        
        */
        // inicio de solución
        for (int i = 0; i < nombres.length; i++) {
            if (edad.length>=0 &&edad.length<=18) {
                PasajeMenorEdad pasajeMenorEdad = new PasajeMenorEdad(pasajeFijo);
                Persona pa= new Persona(nombres[i],apellidos[i],edad[i]);
                pasajeMenorEdad.establecerPersona(pa);
                pasajes.add(pasajeMenorEdad);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
//                estudiantes[contador] = estudianteP;
            }if (edad.length>=18 &&edad.length<=25) {
                PasajeUniversitario pasajeUni = new PasajeUniversitario(pasajeFijo);
                Persona pa= new Persona(nombres[i],apellidos[i],edad[i]);
                pasajeUni.establecerPersona(pa);
                pasajes.add(pasajeUni);
            }if (edad.length>=25 &&edad.length<=65) {
                PasajeNormal pasajeNormal = new PasajeNormal(pasajeFijo);
                Persona pa= new Persona(nombres[i],apellidos[i],edad[i]);
                pasajeNormal.establecerPersona(pa);
                pasajes.add(pasajeNormal);
            }if (edad.length>=65) {
                PasajeTerceraEdad pasajeter = new PasajeTerceraEdad(pasajeFijo);
                Persona pa= new Persona(nombres[i],apellidos[i],edad[i]);
                pasajeter.establecerPersona(pa);
                pasajes.add(pasajeter);
            }
            
        }
        
        // fin  de solución
        
        // no incrementar líneas de código desde aquí
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValorPasaje();
        }
        
        for (int i = 0; i < pasajes.size(); i++) {
            System.out.printf("%s\n",
                    pasajes.get(i));
        }

    }
}
