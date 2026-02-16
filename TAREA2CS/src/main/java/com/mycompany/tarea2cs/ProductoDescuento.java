/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

/**
 *
 * @author potoy
 */
public class ProductoDescuento extends ProductoBase{
    private double porcentajeDescuento;

    public ProductoDescuento() {
    }

    public ProductoDescuento(double porcentajeDescuento, int codigo, String nombre, double precio, double stock) {
        super(codigo, nombre, precio, stock);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularTotalCompra(int cantidadComprada) {
        double total = getPrecio() * cantidadComprada;
        double descuento = total * (porcentajeDescuento / 100);
        return total - descuento;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
