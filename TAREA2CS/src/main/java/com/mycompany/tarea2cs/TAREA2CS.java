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
            System.out.println("Bienvenido al Mini Super Rapido!");
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
                            
                            case 1:{
                            int codigo = 0;
                            double precio = 0;
                            int stock = 0;
                            boolean correcto = false;
                            while (!correcto){ //try catch de codigo
                                try {
                                    System.out.println("Ingrese el codigo: ");
                                    codigo = sc.nextInt();
                                    sc.nextLine();
                                    correcto = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, ingrese un numero entero: ");
                                    sc.nextLine();
                                }
                            }
                            
                                System.out.println("Ingrese el nombre: ");
                                String nombre = sc.nextLine();
                                
                                correcto = false;
                                while (!correcto){ // try del precio
                                    try {
                                        System.out.println("Ingrese su precio: ");
                                        precio = sc.nextDouble();
                                        sc.nextLine();
                                        if (precio > 0){
                                            correcto = true;
                                        }else{
                                            System.out.println("El precio debe ser mayor a 0");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero de tipo double: ");
                                        sc.nextLine();
                                    }
                                }
                                correcto = false;
                                while (!correcto) { // try del stock
                                    try {
                                        System.out.println("Digite su stock: ");
                                        stock = sc.nextInt();
                                        sc.nextLine();
                                        if (stock > 0){
                                        correcto = true;
                                        }else{
                                            System.out.println("El stock debe ser mayor a 0, intente de nuevo");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero de tipo entero: ");
                                        sc.nextLine();
                                    }
                                }
                                
                                miInventario.agregarProducto(codigo,nombre,precio,stock);
                                break;
                            }
                            case 2:{
                                boolean correcto;
                                double descuento = 0;
                                int codigo = 0;
                                String nombre;
                                double precio = 0;
                                int stock = 0;
                                
                                correcto = false;
                                while (!correcto){
                                    try{
                                        System.out.println("Ingrese el descuento del producto: ");
                                        descuento = sc.nextDouble();
                                        sc.nextLine();
                                        if (descuento > 0  && descuento <= 100){
                                            correcto = true;
                                        }else{
                                            System.out.println("El descuento debe ser mayor a 0, intente de nuevo ");
                                        }
                                    }catch(InputMismatchException e){
                                        System.out.println("Error, ingrese un numero de tipo double: ");
                                        sc.nextLine();
                                    }
                                }
                                
                                correcto = false;
                                while (!correcto) { //try catch de codigo
                                    try {
                                        System.out.println("Ingrese el codigo: ");
                                        codigo = sc.nextInt();
                                        sc.nextLine();
                                        correcto = true;
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero entero: ");
                                        sc.nextLine();
                                    }
                                }
                                System.out.println("Ingrese el nombre: ");
                                nombre = sc.nextLine();
                                
                                correcto = false;
                                while (!correcto) { // try del precio
                                    try {
                                        System.out.println("Ingrese su precio: ");
                                        precio = sc.nextDouble();
                                        sc.nextLine();
                                        if (precio > 0) {
                                            correcto = true;
                                        } else {
                                            System.out.println("El precio debe ser mayor a 0");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero de tipo double: ");
                                        sc.nextLine();
                                    }
                                }
                                correcto = false;
                                while (!correcto) { // try del stock
                                    try {
                                        System.out.println("Digite su stock: ");
                                        stock = sc.nextInt();
                                        sc.nextLine();
                                        if (stock > 0) {
                                            correcto = true;
                                        } else {
                                            System.out.println("El stock debe ser mayor a 0, intente de nuevo");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero de tipo entero: ");
                                        sc.nextLine();
                                    }
                                }
                                miInventario.agregarProductoDescuento(descuento,codigo,nombre,precio,stock);
                                break;
                            }
                            case 3:
                                System.out.println("Regresando al menu principal...\n"
                                    + "-------------");
                                break;
                        }
                        
                    }while (opcionAgregar!=3);
                    break;//break case 1 menu principal
                case 2:
                    miInventario.mostrarProductos();
                    break;//break case 2 menu principal
                case 3:
                    System.out.println("Ingrese el código del producto a buscar: ");
                    int codigoBuscado = ManejoExcepciones.pedirCodigo(sc);
                    System.out.println("");
                    miInventario.buscarCodigo(codigoBuscado);
                    break;//break case 3 menu principal
                case 4:
                    miInventario.mostrarProductos();
                    try{
                        int agregar = ManejoExcepciones.pedirIntAgregarLista(sc, miInventario.getProductos().size());
                        Producto productoAgregar = miInventario.getProductos().get(agregar);
                        if (productoAgregar.getStock() > 0){
                            miCarrito.AgregarAlCarrito(productoAgregar);
                            productoAgregar.setStock(productoAgregar.getStock()-1);
                       }else{
                        System.out.println("Error, no hay suficiente stock para agregar el producto seleccionado\n");
                       }
                    }catch(Exception e){
                        System.out.println("Error, no hay suficiente stock para agregar el producto seleccionado\n");
                    }
                    
                    break;//break case 4 menu principal

                case 5:
                    miInventario.mostrarProductos();

                    int eliminar = ManejoExcepciones.pedirIntElimLista(sc, miInventario.getProductos().size());
                    miInventario.eliminarProducto(miInventario.getProductos().get(eliminar));
                    break;// eliminar del inventario
                case 6: 
                    miInventario.mostrarProductos();
                    
                    int editar = ManejoExcepciones.pedirIntAgregarLista(sc,miInventario.getProductos().size());
                    Producto productoEditar = miInventario.getProductos().get(editar);

                    double newPrecio = 0;
                    boolean precioCorrecto = false;
                    while (!precioCorrecto) {
                        try {
                            System.out.println("Ingrese el nuevo precio (0 para no cambiar): ");
                            newPrecio = sc.nextDouble();
                            sc.nextLine();
                            precioCorrecto = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Error, ingrese un numero valido:");
                            sc.nextLine();
                        }
                    }

                    int newStock = 0;
                    boolean stockCorrecto = false;
                    while (!stockCorrecto) {
                        try {
                            System.out.println("Ingrese el nuevo stock (0 para no cambiar): ");
                            newStock = sc.nextInt();
                            sc.nextLine();
                            stockCorrecto = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Error, ingrese un numero entero: ");
                            sc.nextLine();
                        }
                    }

                    miInventario.editarProducto(productoEditar, newPrecio, newStock);
                    break; //Editar
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
                    System.out.println("Su total a pagar es de: " + miCarrito.calcularTotalCompra()+"\n");
                    break;//break case 9 menu principal
                case 10:
                    System.out.println("Saliendo del Mini Super, hasta pronto...");
                    break;
            }
        }while (opcion!= 10);//final del do 
        sc.close();
    }
}
