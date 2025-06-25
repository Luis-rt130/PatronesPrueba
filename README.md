# 🛒 TiendaProductos

## 📌 Descripción del sistema

**TiendaProductos** es un sistema de gestión de productos desarrollado en **Java estándar**, que simula el inventario de una tienda. El usuario puede:

- Agregar productos físicos y digitales
- Integrar productos externos mediante adaptación
- Visualizar el catálogo de productos
- Eliminar productos por ID
- Ver IDs reasignados automáticamente tras cada eliminación

El sistema se ejecuta en consola, es interactivo y está diseñado bajo el enfoque de la **programación orientada a objetos** utilizando 4 patrones de diseño con propósito claro.

---

## ❗ Problema a resolver

Una tienda requiere un sistema flexible para gestionar múltiples tipos de productos, incluidos productos físicos, digitales y externos. El sistema debe permitir:

- Extensión sin modificar las clases existentes
- Una sola instancia para controlar los productos
- Posibilidad de mostrar productos con diferentes comportamientos
- Clonado de productos para futuras operaciones (como copias u ofertas)

---

## 🧩 Patrones de diseño aplicados

### 1. Singleton – `Tienda`
- **Propósito**: Asegura que exista **una única instancia** de la tienda que gestione el catálogo.
- **Implementación**: Clase `Tienda` con constructor privado y método `getInstancia()`.
- **Ubicación**: `catalogo/Tienda.java`.

### 2. Prototype – `Producto`
- **Propósito**: Permite **clonar productos** fácilmente, útil para duplicar ítems sin conocer su tipo exacto.
- **Implementación**: Interfaz `Producto` con método `clonar()`.
- **Ubicación**: `producto/Producto.java` y clases concretas.

### 3. Bridge – `VistaProducto`
- **Propósito**: Separa la **lógica del producto** de su **presentación visual**.
- **Implementación**: Las clases `ProductoBase` delegan la visualización a `VistaProducto`.
- **Ubicación**: `producto/ProductoBase.java`, `VistaFisica.java`, `VistaDigital.java`.

### 4. Adapter – `ProductoAdapter`
- **Propósito**: Permite integrar productos externos sin modificar su código.
- **Implementación**: `ProductoAdapter` adapta un `ProductoExterno` para cumplir con la interfaz `Producto`.
- **Ubicación**: `adapter/ProductoAdapter.java`.

---

## ⚙️ Instrucciones de compilación y ejecución

### 1. Requisitos
- Java JDK 8 o superior
- Consola o terminal habilitada

### 2. Estructura del proyecto

- /TiendaProductos
- ├── /img
- ├── /src
- │ ├── Main.java
- │ ├── catalogo/
- │ ├── producto/
- │ └── adapter/
- └── README.md

### 3. Compilación

Desde la carpeta `src`:

```bash
javac Main.java catalogo/*.java producto/*.java adapter/*.java
```
### 5. Justificación técnica por patrón

| Patrón        | ¿Por qué se aplica?                                                                          | ¿Dónde se aplica?                                             | ¿Cómo mejora el diseño?                                           |
| ------------- | -------------------------------------------------------------------------------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------- |
| **Singleton** | Para asegurar una única instancia global de la tienda que gestione el catálogo.              | Clase `Tienda` (package `catalogo`)                           | Control centralizado, acceso global controlado.                   |
| **Prototype** | Para permitir clonar productos (útil para promociones o duplicados sin afectar el original). | Interfaz `Producto` y métodos `clonar()` en clases concretas. | Facilita reutilización de objetos sin acoplamiento.               |
| **Bridge**    | Para desacoplar la lógica de los productos de su forma de visualización.                     | Clases `VistaProducto`, `VistaFisica`, `VistaDigital`.        | Permite modificar la presentación sin cambiar el producto.        |
| **Adapter**   | Para integrar productos externos sin modificar su estructura original.                       | Clase `ProductoAdapter` que adapta `ProductoExterno`.         | Fomenta compatibilidad con APIs de terceros o sistemas heredados. |

### 6. instalacion y ejecucion

- Para ejecutar el projecto tiene que hacer lo siguiente
- usar el:
- git clone https://github.com/Luis-rt130/PruebaPatrones.git
- y en el terminal tiene que ubicarse en la main con:
- cd PruebaPatrones\src\Main
- y por ultimo ejecutarlo 
- java -cp . Main.java
