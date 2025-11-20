package com.example.Util;

import com.example.Model.Producto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GsonUtil {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void guardarProductos(List<Producto> productos, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(productos, writer);
            System.out.println("Productos guardados en " + archivo);
        } catch (IOException e) {
            System.err.println("Error al guardar productos: " + e.getMessage());
        }
    }
    public static List<Producto> cargarProductos(String archivo) {
        try (FileReader reader = new FileReader(archivo)) {
            Type listType = new TypeToken<ArrayList<Producto>>(){}.getType();
            List<Producto> productos = gson.fromJson(reader, listType);
            System.out.println("Productos cargados desde " + archivo);
            return productos;
        } catch (IOException e) {
            System.err.println("Error al cargar productos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}