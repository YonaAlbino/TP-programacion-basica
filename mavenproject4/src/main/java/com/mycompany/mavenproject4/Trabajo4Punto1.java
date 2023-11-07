/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author yonat
 */
public class Trabajo4Punto1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorIngresado = 0;
        int[] cantidadDias = new int[13];
        String[] meses = new String[13];
        
        cargarMeses(meses);
        
        for (int i = 1; i < 13; i++) {
            if (i == 2) {
                cantidadDias[i] = 29;
            } else if (i == 9 || i == 11 || i == 6 || i == 4) {
                cantidadDias[i] = 30;
            } else {
                cantidadDias[i] = 31;
            }
        }

        do {
            System.out.println("Ingrese el mes. Ejemplo: 1 para enero, 2 para febrero. Presione 0 para salir");
            valorIngresado = teclado.nextInt();

            if(valorIngresado >0 && valorIngresado<13)
                System.out.println("La cantidad de días para el mes de " + meses[valorIngresado] + " son de: " + cantidadDias[valorIngresado]);

        } while (valorIngresado != 0);

    }

    public static void cargarMeses(String meses[]) {
        meses[1] = "Enero";
        meses[2] = "Febrero";
        meses[3] = "Marzo";
        meses[4] = "Abril";
        meses[5] = "Mayo";
        meses[6] = "Junio";
        meses[7] = "Julio";
        meses[8] = "Agosto";
        meses[9] = "Septiembre";
        meses[10] = "Octubre";
        meses[11] = "Noviembre";
        meses[12] = "Diciembre";
    }
}
