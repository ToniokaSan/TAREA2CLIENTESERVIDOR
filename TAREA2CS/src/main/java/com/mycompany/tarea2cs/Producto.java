/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

/**
 *
 * @author potoy
 */
public class Producto extends ProductoBase {

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, double stock) {
        super(codigo, nombre, precio, stock);
    }

    @Override
    public double calcularTotalCompra(int cantidadComprada) {
        return cantidadComprada * getPrecio();
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    

}
