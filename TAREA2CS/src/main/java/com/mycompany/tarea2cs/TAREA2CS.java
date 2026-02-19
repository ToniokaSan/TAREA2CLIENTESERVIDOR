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
        ProductoDescuento prodes1 = new ProductoDescuento(20,002,"Leche",1800,2);
        miInventario.agregarProductoLista(prod1);
        miInventario.agregarProductoLista(prodes1);
        
        
        int opcion = 0 ;
        do{
            System.out.println("Bienvenido al Mini Super Rápido");
            System.out.println(
                      "1- Agregar producto\n"
                    + "2- Mostrar inventario productos\n"
                    + "3- Buscar codigo\n"
                    + "4- Agregar al carrito de compras\n"
                    + "5- Eliminar producto del inventario\n"
                    + "6- Editar producto del inventario\n"
                    + "7- Eliminar del carrito\n"
                    + "8- Ver carrito de compras\n"
                    + "9- Pagar productos en carrito de compras\n"
                    + "10- Salir del Mini Super\n"
                    + "-------------");
                    
            opcion = ManejoExcepciones.pedirIntMenu(sc);
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
                        opcionAgregar = ManejoExcepciones.pedirIntMenu(sc);
                        switch (opcionAgregar){
                            case 1:
                            
                                
                                System.out.println("Ingrese el codigo: ");
                                int codigo = sc.nextInt();
                                 sc.nextLine();
                                System.out.println("Ingrese el nombre: ");
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese su precio, agregue.0 al final: ");
                                double precio = sc.nextDouble();
                                System.out.println("Digite su stock");
                                int stock = sc.nextInt();
                                miInventario.agregarProducto(codigo,nombre,precio,stock);
                                break;
                            case 2:
                                System.out.println("Ingrese el descuento del producto: ");
                                double descuento = sc.nextDouble();
                                System.out.println("Ingrese el codigo: ");
                                codigo = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Ingrese el nombre: ");
                                nombre = sc.nextLine();
                                System.out.println("Ingrese su precio: ");
                                precio = sc.nextDouble();
                                System.out.println("Digite su stock");
                                stock = sc.nextInt();
                                miInventario.agregarProductoDescuento(descuento,codigo,nombre,precio,stock);
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
                    int codigoBuscado = ManejoExcepciones.pedirCodigo(sc);
                    System.out.println("");
                    miInventario.buscarCodigo(codigoBuscado);
                    break;//break case 3 menu principal
                case 4:
                    miInventario.mostrarProductos();
                    
                    int agregar = ManejoExcepciones.pedirIntAgregarLista(sc, miInventario.getProductos().size());
                    Producto productoAgregar = miInventario.getProductos().get(agregar);
                    if (productoAgregar.getStock() > 0){// provisional, no se como ponerle try catch a esto
                        miCarrito.AgregarAlCarrito(productoAgregar);
                        productoAgregar.setStock(productoAgregar.getStock()-1);
                    }else{
                        System.out.println("no hay suficiente stock");
                    }
                    break;//break case 4 menu principal

                case 5:
                    miInventario.mostrarProductos();

                    int eliminar = ManejoExcepciones.pedirIntElimLista(sc, miInventario.getProductos().size());
                    miInventario.eliminarProducto(miInventario.getProductos().get(eliminar));
                    break;// eliminar del inventario
                case 6: 
                    miInventario.mostrarProductos();
                    
                    
                    int editar = ManejoExcepciones.pedirIntAgregarLista(sc,miInventario.getProductos().size())-1;
                    break;//editar producto
                case 7:
                    miCarrito.mostrarCarrito();
                    
                    
                    int eliminarCarrito = ManejoExcepciones.pedirIntElimLista(sc,miCarrito.getCarrito().size());
                    Producto productoeliminar = miCarrito.getCarrito().get(eliminarCarrito);
                    miCarrito.elimCarrito(productoeliminar);
                    productoeliminar.setStock(productoeliminar.getStock() + 1);
                    
                    break;//break case 7 menu principal
                case 8:
                    miCarrito.mostrarCarrito();
                   break; //break case 8 menu principal
                case 9:
                    miCarrito.mostrarCarrito();
                    System.out.println(miCarrito.calcularTotalCompra());
                    break;//break case 9 menu principal
                case 10:
                    System.out.println("Saliendo del Mini Super, hasta luego...");
                    break;
            }
        }while (opcion!= 9);//final del do 
        sc.close();
    }
}
