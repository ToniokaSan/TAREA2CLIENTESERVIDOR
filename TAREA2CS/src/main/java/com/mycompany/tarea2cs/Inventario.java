/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 *
 * @author potoy
 */
public class Inventario {
    private List<Producto> productos;
    private Map<Integer, Producto> mapaProductos;

    
    public Inventario() {
        productos = new ArrayList<>();
        mapaProductos = new HashMap<>();
    }

    public Inventario(List<Producto> productos, Map<Integer, Producto> mapaProductos) {
        this.productos = productos;
        this.mapaProductos = mapaProductos;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Map<Integer, Producto> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(Map<Integer, Producto> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }
    
    public void agregarProductos(Producto producto){
        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);
    }
    public void buscarCodigo(int CodigoBuscado){
        Producto busqueda = mapaProductos.get((CodigoBuscado));
        if (busqueda!=null){
            System.out.println(busqueda+"\n");
        }else{
            System.out.println("El codigo ingresado no coincide con ningun producto");
        }
    }
    
    public void mostrarProductos(){
        for (int i= 0; i < productos.size(); i++){
            System.out.println( (i+1) +"- " + productos.get(i).toString()+"\n");
        }
    }
    
    public void agregarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su precio: ");
        double precio = sc.nextDouble();
        System.out.println("Digite su stock");
        int stock = sc.nextInt();
        Producto producto = new Producto( codigo, nombre, precio, stock);
        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);
    }

    public void agregarProductoDescuento (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el descuento del producto: ");
        double descuento = sc.nextDouble();
        System.out.println("Ingrese el codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su precio: ");
        double precio = sc.nextDouble();
        System.out.println("Digite su stock");
        int stock = sc.nextInt();
        ProductoDescuento producto = new ProductoDescuento(descuento,codigo, nombre, precio, stock);
        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);
        
    }
    
}
