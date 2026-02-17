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
        
        Scanner sc = new Scanner(System.in);
        
        Inventario miInventario = new Inventario();
        Carrito miCarrito = new Carrito();
        
        Producto prod1 = new Producto (001,"Huevos", 1500,30);
        ProductoDescuento prodes1 = new ProductoDescuento(20,002,"Leche",1800,20);
        miInventario.agregarProductos(prod1);
        miInventario.agregarProductos(prodes1);
        
        
        int opcion = 0 ;
        do{
            System.out.println("Bienvenido al Mini Super Rápido");
            System.out.println(
                      "1- Agregar producto\n"
                    + "2- Mostrar inventario productos\n"
                    + "3- Buscar codigo\n"
                    + "4- Agregar al carrito de comprar\n"
                    + "5- Ver carrito de compras\n"
                    + "6- Pagar productos en carrito de compras\n"
                    + "7- Salir del Mini Super\n"
                    + "-------------");
                    
            opcion = ManejoExcepciones.pedirInt(sc);
            switch (opcion){
                case 1:
                    int opcionAgregar;
                    do {
                        System.out.println("Que tipo de producto desea agregar?");
                        System.out.println(
                                "1- Producto regular (Sin descuento)\n"
                                + "2- Producto con descuento\n"
                                +"3- Volver al menu principal\n"
                                + "-------------");
                        opcionAgregar = ManejoExcepciones.pedirInt(sc);
                        switch (opcionAgregar){
                            case 1:
                                miInventario.agregarProducto();
                                break;
                            case 2:
                                miInventario.agregarProductoDescuento();
                                break;
                            case 3:
                                System.out.println("Regresando al menu principal\n"
                                    + "-------------");
                                break;
                        }
                        
                    }while (opcionAgregar!=3);
                    break;//break case 1 menu principal
                case 2:
                    miInventario.mostrarProductos();
                    break;//break case 2 menu principal
                case 3:
                    System.out.println("Ingrese el codigo del producto a buscar: ");
                    int CodigoBuscado = ManejoExcepciones.pedirInt(sc);;
                    System.out.println("");
                    miInventario.buscarCodigo(CodigoBuscado);
                    break;//break case 3 menu principal
                case 4:
                    miInventario.mostrarProductos();
                    System.out.println("Ingrese el numero de producto a agregar al carrito: ");
                    int agregar = ManejoExcepciones.pedirInt(sc)-1;
                    miCarrito.AgregarAlCarrito(miInventario.getProductos().get(agregar));
                    miInventario.getProductos().get(agregar-1).setStock(miInventario.getProductos().get(agregar).getStock()-1);
                    break;//break case 4 menu principal
                case 5:
                    miCarrito.mostrarCarrito();
                    break;//break case 5 menu principal
                case 6:
                    
                    System.out.println(miCarrito.calcularTotalCompra());
                   break; //break case 6 menu principal
                case 7:
                    System.out.println("Saliendo del Mini Super, hasta luego...");
                    break;//break case 7 menu principal
                
                    
            }
        }while (opcion!= 7);//final del do 
        sc.close();
    }
}
