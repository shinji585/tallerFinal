package com.example;

import com.example.Model.Producto;
import com.example.Util.GsonUtil;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Laptop", 1200.50, "Electronica"));
        productos.add(new Producto(2, "Mouse", 25.99, "Electronica"));
        productos.add(new Producto(3, "Teclado", 45.75, "Electronica"));
        productos.add(new Producto(4, "Silla Gamer", 350.00, "Muebles"));
        productos.add(new Producto(5, "Escritorio", 299.99, "Muebles"));
        GsonUtil.guardarProductos(productos, "productos.json");
        List<Producto> productosLeidos = GsonUtil.cargarProductos("productos.json");
        System.out.println("\n=== TODOS LOS PRODUCTOS ===");
        for (Producto p : productosLeidos) {
            System.out.println(p);
        }
        Producto masCostoso = productosLeidos.get(0);
        for (Producto p : productosLeidos) {
            if (p.getPrecio() > masCostoso.getPrecio()) {
                masCostoso = p;
            }
        }
        System.out.println("\n=== PRODUCTO MAS COSTOSO ===");
        System.out.println(masCostoso);
        double suma = 0;
        for (Producto p : productosLeidos) {
            suma += p.getPrecio();
        }
        double promedio = suma / productosLeidos.size();
        System.out.println("\n=== PROMEDIO DE PRECIOS ===");
        System.out.println("Promedio: " + promedio);
        String categoriaFiltro = "Electronica";
        System.out.println("\n=== PRODUCTOS DE CATEGORIA: " + categoriaFiltro + " ===");
        for (Producto p : productosLeidos) {
            if (p.getCategoria().equals(categoriaFiltro)) {
                System.out.println(p);
            }
        }
    }
}