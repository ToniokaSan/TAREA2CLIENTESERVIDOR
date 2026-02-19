/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author brand
 */
public class Carrito extends ProductoBase {

    private List<Producto> carrito;
    

    public Carrito() {
        carrito = new ArrayList<>();
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void AgregarAlCarrito(Producto producto){
        carrito.add(producto);
        System.out.println("Producto agregado al carrito");
    }
    public void elimCarrito(Producto producto){
        carrito.remove(producto);
        System.out.println("Producto eliminado al carrito");
    }

    public void mostrarCarrito(){
        System.out.println( "----- Carrito -----");
        if(carrito.isEmpty()){
            System.out.println("Carrito vacio");
            return;
        }
        for (int i= 0; i < carrito.size(); i++){
            System.out.println( (i+1)+"-" + carrito.get(i).toString()+"\n");
        }
    }
    
    public void AgregarCantidadCarrito (int cantidad,double stock){
        if (cantidad > stock){
            
        }
    }

    @Override
    public double calcularTotalCompra() {
        double total = 0;
        for (int i= 0; i < carrito.size(); i++)
            total += carrito.get(i).calcularTotalCompra();
        return total;
    }

    
}
