/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.time.Year;

/**
 *
 * @author yonat
 */
public class FuncionPuntoCinco {

    public static void main(String[] args) {
        System.out.println(calcularEdad(1996));
    }

    public static int calcularEdad(int fechaNacimiento) {
        Year anioActual = Year.now();
        int anioComoInt = anioActual.getValue();
        
        return anioComoInt - fechaNacimiento;
    }
}
