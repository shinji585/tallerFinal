# Taller Final de Investigación - JSON con Java

## Descripción del Proyecto

Este proyecto implementa un sistema de gestión de productos utilizando Java y la librería Gson para el manejo de datos en formato JSON. El sistema permite crear, almacenar, leer y analizar información de productos mediante archivos JSON.

## Características Principales

- Creación de objetos Producto con atributos: id, nombre, precio y categoría
- Serialización de lista de productos a archivo JSON
- Deserialización de archivo JSON a objetos Java
- Análisis de datos: producto más costoso, promedio de precios y filtrado por categoría

## Estructura del Proyecto

```
gson-productos/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   ├── modelo/
│                   │   └── Producto.java
│                   ├── util/
│                   │   └── GsonUtil.java
│                   └── Main.java
└── productos.json
```

## Componentes

### Producto.java
Clase modelo que representa un producto con los siguientes atributos:
- `id`: Identificador único del producto
- `nombre`: Nombre del producto
- `precio`: Precio del producto
- `categoria`: Categoría a la que pertenece

### GsonUtil.java
Clase utilitaria que proporciona métodos para:
- `guardarProductos()`: Convierte una lista de productos a formato JSON y la guarda en archivo
- `cargarProductos()`: Lee un archivo JSON y lo convierte en una lista de objetos Producto

### Main.java
Clase principal que ejecuta el programa:
1. Crea una lista de 5 productos de ejemplo
2. Guarda la lista en `productos.json`
3. Lee el archivo JSON
4. Muestra todos los productos
5. Identifica el producto más costoso
6. Calcula el promedio de precios
7. Filtra productos por categoría

## Requisitos

- Java 8 o superior
- Maven
- Librería Gson

## Dependencia Maven

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```

## Ejecución

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## Salida Esperada

El programa mostrará:
- Lista completa de productos
- Producto con el precio más alto
- Promedio de precios de todos los productos
- Productos filtrados por la categoría "Electronica"

## Ejemplo de Archivo JSON Generado

```json
[
  {
    "id": 1,
    "nombre": "Laptop",
    "precio": 1200.5,
    "categoria": "Electronica"
  },
  {
    "id": 2,
    "nombre": "Mouse",
    "precio": 25.99,
    "categoria": "Electronica"
  }
]
```

## Tecnologías Utilizadas

- Java
- Gson (Google JSON)
- Maven

## Documentación y Diagramas

Para ver la documentación completa y los diagramas del proyecto, visita:

[![Ask DeepWiki](https://deepwiki.com/badge.svg)](https://deepwiki.com/shinji585/tallerFinal)

## Autor

**Samuel Javier Vargas Cárdenas**

---

*Proyecto desarrollado como parte del Taller Final de Investigación sobre manejo de JSON en Java*