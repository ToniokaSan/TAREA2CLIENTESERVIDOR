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

        int opcion = 0;
        boolean continuar = true;

        while (continuar){
            try {
                System.out.println("ingrese un numero para desplazarse en el menu: ");
                opcion = sc.nextInt();
                continuar = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Error, este campo debe ser un numero entero");
                sc.nextLine();
            }finally{
                
            }
        }
        return opcion;
    }
    public static int pedirCodigo(Scanner sc){

        int opcion = 0;
        boolean continuar = true;

        while (continuar){
            try {
                System.out.println("ingrese un codigo a buscar (3 digitos): ");
                opcion = sc.nextInt();
                continuar = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Error, este campo debe ser un numero entero");
                sc.nextLine();
            }finally{
                
            }
        }
        return opcion;
    }
    public static int pedirIntAgregarLista(Scanner sc, int tamañoLista){

        int opcion = 0;
        boolean continuar = true;

        while (continuar){
            try {
                System.out.println("METODO AGREGAR");
                System.out.println("ingrese el numero del producto (en la lista) a agregar: ");
                opcion = sc.nextInt()-1;
                if (opcion < 0 || opcion > tamañoLista) {
                System.out.println("Error, indice fuera del limite de la lista");
                } else {
                    continuar = false;
                }

                
            } catch (InputMismatchException e) {
                System.out.println("Error, este campo debe ser un numero entero");
                sc.nextLine();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Error, indice fuera del limite de la lista");
            }
        }
        return opcion;
    }

    public static int pedirIntElimLista(Scanner sc, int tamañoLista){

        int opcion = 0;
        boolean continuar = true;

        while (continuar){
            try {
                System.out.println("METODO ELIMINAR");
                System.out.println("ingrese el numero del producto (en el inventario) a eliminar: ");
                opcion = sc.nextInt()-1;
                if (opcion < 0 || opcion >= tamañoLista) {
                System.out.println("Error, indice fuera del limite de la lista");
                } else {
                    continuar = false;
                }

                
            } catch (InputMismatchException e) {
                System.out.println("Error, este campo debe ser un numero entero");
                sc.nextLine();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Error, indice fuera del limite de la lista");
            }
        }
        return opcion;
    }
}
