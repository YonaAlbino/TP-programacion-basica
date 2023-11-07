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
public class Trabajo4Punto2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un valor para el primer vector");
            vector1[i] = teclado.nextInt();

            System.out.println("Ingrese un valor para el segundo vector");
            vector2[i] = teclado.nextInt();
            
            vector3[i] = vector1[i] + vector2[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Vector 1: " + vector1[i]);
            System.out.println("Vector 2: " + vector2[i]);
            System.out.println("Vector 3: " + vector3[i]);
        }

    }

}
