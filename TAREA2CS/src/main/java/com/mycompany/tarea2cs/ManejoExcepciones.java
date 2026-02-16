/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class ManejoExcepciones {
    
    public static int pedirIntMenu(Scanner sc){

        int opcion=0;
        boolean continuar =true;

        while (continuar){
            try {
                System.out.println("ingrese un numero para desplazarse en el menu: ");
                opcion = sc.nextInt();
                continuar = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Error, este campo debe ser un numero");
                sc.nextLine();
            }finally{
                
            }
        }
        return opcion;
    }
}
