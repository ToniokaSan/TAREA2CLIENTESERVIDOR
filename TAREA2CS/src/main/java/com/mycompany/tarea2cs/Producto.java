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
    private final int codigo;
    private final String nombre;
    private double precio;
    private int stock;
    
    
    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) 
            this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0)
            this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto " + "codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio + ", stock: " + stock + '}';
    }
    
    public double calcularTotalCompra(){
        return precio + (precio * 0.13);
    }
    
    

}
