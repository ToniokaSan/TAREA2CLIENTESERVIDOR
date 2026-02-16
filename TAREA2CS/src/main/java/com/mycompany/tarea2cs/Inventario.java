/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2cs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author potoy
 */
public class Inventario {
    private List<ProductoBase> productos;
    private Map<Integer, ProductoBase> mapaProductos;

    
    public Inventario() {
        productos = new ArrayList<>();
        mapaProductos = new HashMap<>();
    }

    public Inventario(List<ProductoBase> productos, Map mapaProductos) {
        this.productos = productos;
        this.mapaProductos = mapaProductos;
    }
    
    public List<ProductoBase> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoBase> productos) {
        this.productos = productos;
    }

    public Map<Integer, ProductoBase> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(Map<Integer, ProductoBase> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }
    
    public void agregarProductos(ProductoBase producto){
        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);

    }
    
    public void mostrarProductos(){
        for (int i= 0; i < productos.size(); i++){
            System.out.println( (i+1) +"- " + productos.get(i).toString());
        }
    }


    
    
}
