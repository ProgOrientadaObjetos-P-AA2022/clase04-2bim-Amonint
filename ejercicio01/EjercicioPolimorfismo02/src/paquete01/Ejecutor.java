/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;

import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombrespropiet, placa;
        int edadEst;
        double nummaxli, costoli,nomP,descuentol;
        int numeroCreds;
        int numeroAsigs;
        int tipoAutom;
        String continuar;
        int contador = 0;
        ArrayList<Automovil> automovils = new ArrayList<>();
        boolean bandera = true;

        // inicio de solución
        while (bandera) {

            System.out.println("Tipo de automoviles a ingresar\n"
                    + "Ingrese (1) para Automovil Gasolina\n"
                    + "Ingrese (2) Automovil Diesel\n");
            tipoAutom = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres del propietario");
            nombrespropiet = entrada.nextLine();
            System.out.println("Ingrese la placa");
            placa = entrada.nextLine();

            if (tipoAutom == 1) {
                AutomovilGasolina gasolina = new AutomovilGasolina();
                System.out.println("Ingrese el numero de galones: ");
                gasolina.establecerNumGalones(entrada.nextDouble());
                System.out.println("Ingrese el costo de galones: ");
                gasolina.establecerCostoGalones(entrada.nextDouble());
                gasolina.establecerNomPro(nombrespropiet);
                gasolina.establecerIva();
                gasolina.establecerPlaca(placa);

                automovils.add(gasolina);

            } else {

                AutomovilDiesel diesel = new AutomovilDiesel();

                System.out.println("Ingrese el número de litros maximos del tanque");
                nummaxli = entrada.nextDouble();
                System.out.println("Ingrese el costo de cada litro");
                costoli = entrada.nextDouble();
                System.out.println("Ingrese el descuento");
                descuentol = entrada.nextDouble();
                diesel.establecerNomPro(nombrespropiet);
                diesel.establecernumeroLimax(nummaxli);
                diesel.establecercostolitro(costoli);
                diesel.establecerPlaca(placa);
                diesel.establecerdescuentol(descuentol);
                automovils.add(diesel);

            }
            entrada.nextLine();
            System.out.println("¿Desea ingresar otro estudiante?");
            String a = entrada.nextLine();
            if ("si".equals(a) || "Si".equals(a)) {
                bandera = true;
            } else {
                bandera = false;
            }
        }

        for (int i = 0; i < automovils.size(); i++) {
            // 1.
            automovils.get(i).calcularValorCancelar();

            System.out.printf("Datos propietario\n"
                    + "%s\n",
                    automovils.get(i));

        }
        
    }
}
