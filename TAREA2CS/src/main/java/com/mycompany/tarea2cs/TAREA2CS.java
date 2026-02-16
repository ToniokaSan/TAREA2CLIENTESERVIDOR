/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2cs;
import java.util.*;
/**
 *
 * @author potoy
 */
public class TAREA2CS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        
        Inventario miInventario = new Inventario();
        
        Producto prod1 = new Producto (001,"Huevos", 1500,30);
        ProductoDescuento prodes1 = new ProductoDescuento(20,002,"Leche",1800,20);
        miInventario.agregarProductos(prod1);
        miInventario.agregarProductos(prodes1);
        
        
        int opcion;
        do{
            System.out.println("Bienvenido al Mini Super Pali");
            System.out.println(
                      "1- Agregar producto\n"
                    + "2- Mostrar inventario productos\n"
                    + "3- Buscar codigo\n"
                    + "4- Agregar al carrito de comprar\n"
                    + "5- Ver carrito de compras\n"
                    + "6- Pagar productos en carrito de compras\n"
                    + "7- Salir del Mini Super");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    int opcionAgregar;
                    do {
                        System.out.println("Que tipo de producto desea agregar?");
                        System.out.println(
                                "1- Producto regular (Sin descuento)\n"
                                + "2- Producto con descuento");
                        opcionAgregar = sc.nextInt();
                        switch (opcionAgregar){
                            case 1:
                                
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("Regresando al menu principal");
                                break;
                        }
                        
                    }while (opcionAgregar!=3);
                    break;//break case 1 menu principal
                case 2:
                    miInventario.mostrarProductos();
                    break;//break case 2 menu principal
                case 3:
                    break;//break case 3 menu principal
                case 4:
                    break;//break case 4 menu principal
                case 5:
                    break;//break case 5 menu principal
                case 6:
                   break; //break case 6 menu principal
                case 7:
                    System.out.println("Saliendo del Mini Super, hasta luego...");
                    break;//break case 7 menu principal
            }
        }while (opcion!= 7);//final del do 
        
    }
}
