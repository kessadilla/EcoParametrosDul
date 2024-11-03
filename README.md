# Aplicación Spring Boot - Formulario MVC

Esta es una aplicación básica en Spring Boot que implementa el patrón Modelo-Vista-Controlador (MVC). Su propósito es mostrar un formulario, recibir los datos enviados por el usuario y mostrarlos nuevamente en una nueva vista.

## Características

- **Framework**: Spring Boot
- **Arquitectura**: Modelo-Vista-Controlador (MVC)
- **Funcionalidad principal**: Mostrar un formulario, recibir los valores ingresados y repintarlos en un nuevo formulario al ser enviados.

## Estructura de la aplicación

1. **Controlador**: Gestiona las rutas y el flujo de la aplicación.
2. **Modelo**: Define los datos que se manejan en el formulario.
3. **Vista**: Muestra el formulario y los valores ingresados.

## Cómo ejecutar la aplicación

1. Clona el repositorio.
2. Asegúrate de tener [Java 17](https://jdk.java.net/17/) o superior instalado.
3. Ejecuta el siguiente comando en la raíz del proyecto:

   ```bash
   ./mvnw spring-boot:run
4. Abre tu navegador y visita http://localhost:8082/formulario/devuelve-formulario
