/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author yonat
 */
public class Trabajo4Punto3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadAlumnos = 0;
        String nombre = "";
        int contador = -1;

        System.out.println("Ingrese la cantidad de alumnos que desea registrar");

        cantidadAlumnos = teclado.nextInt();

        int[] edades = new int[cantidadAlumnos];
        String[] nombres = new String[cantidadAlumnos];

        for (int i = 0; i <= cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno");

            nombre = teclado.next();

            if (nombre.equals("*")) {
                i = cantidadAlumnos;
            } else {
                contador++;
                nombres[i] = nombre;

                System.out.println("Ingrese la edad del alumno");
                edades[i] = teclado.nextInt();
            }

        }

        System.out.println("Los alumnos mayores de edad son: ");
        for (int i = 0; i <= contador; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " con " + edades[i] + " años");
            }
        }
    }
}
