# 🏰 PROYECTO ETPA: El Corazón Encantado de la Bestia 🌹

![Estado del Proyecto](https://img.shields.io/badge/Estado-Terminado-green)
![Lenguaje](https://img.shields.io/badge/Java-JDK_8%2B-red)
![IDE](https://img.shields.io/badge/IDE-Eclipse-orange)

---

## 🌟 Resumen del Proyecto

Este es un proyecto de fin de trimestre que recrea los populares libro-juegos **"Elige tu propia aventura" (ETPA)**, implementado como un videojuego de consola en **Java**.

La aventura está inspirada en el clásico cuento **"La Bella y la Bestia"** y se ubica dentro de la categoría de Fantasía Medieval. El objetivo es ofrecer una experiencia inmersiva mediante la aplicación sólida de conceptos de programación estructurada: condicionales complejos, bucles de juego, modularización mediante métodos y gestión de arrays.

---

## 🎯 Características y Mecánicas

El juego cumple rigurosamente con las especificaciones del proyecto, ofreciendo una experiencia rejugable y dinámica.

### 1. Sistema de Inicio y Personajes
| Característica | Detalle |
| :--- | :--- |
| **Seguridad** | Sistema de acceso por contraseña (`do-while`). La clave es: **`jugones`**. |
| **Multiperspectiva** | Elección entre **3 protagonistas**: Bella, La Bestia y Gastón. |
| **Narrativa Ramificada** | Cada protagonista cuenta con **5 finales diferentes** según las decisiones tomadas. |
| **Interacción** | Diálogos con **4 NPCs** (Lumière, Ding Dong, Maurice, Le Fou). |

### 2. Sistema de Batalla (RPG) ⚔️
Se ha implementado un motor de combate por turnos que incluye:
* **Stats:** Puntos de Vida (PV) y Daño variable.
* **Acciones:** Menú de combate con **3 ataques posibles**.
* **RNG (Aleatoriedad):** El primer turno se decide al azar usando `Math.random()`.
* **Cálculo de Daño:** Sistema lógico que determina si el golpe es:
    * 💥 Daño Total (Impacto directo).
    * 🛡️ Daño Parcial (El enemigo se cubre).
    * 💨 Esquiva (Daño nulo).

### 3. Minijuegos y Lógica 🧩
Para avanzar en la trama, el jugador debe superar al menos **5 desafíos** de lógica integrados en la historia:
* Piedra, Papel o Tijeras (contra la IA).
* Adivina el Número (Lógica de búsqueda).
* Acertijos de texto (Validación de Strings).
* Validación estricta de menús (control de excepciones y errores de entrada).

---

## 🚀 Guía de Instalación y Ejecución

### Requisitos Técnicos
* **Lenguaje:** Java (JDK 8 o superior).
* **Entorno:** Eclipse IDE (Recomendado para importar la estructura del proyecto).

### Cómo jugar
1.  Clona este repositorio o descarga el `.zip`.
2.  Abre **Eclipse** y selecciona `File > Import > Existing Projects into Workspace`.
3.  Selecciona la carpeta raíz del proyecto descargado.
4.  Busca la clase principal (usualmente `Main.java` o `Juego.java`) en la carpeta `src`.
5.  Haz clic derecho y selecciona `Run As > Java Application`.
6.  Introduce la clave **`jugones`** en la consola para comenzar.

---

## 📂 Estructura del Proyecto

La arquitectura del código se organiza de la siguiente manera:

```text
📦 PROYECTO_ETPA
 ┣ 📂 src
 ┃ ┣ 📜 Main.java           // Clase principal (Entry Point)
 ┃ ┣ 📜 Batalla.java        // Lógica de combate y stats
 ┃ ┣ 📜 Utilidades.java     // Métodos auxiliares (leer teclado, limpiar pantalla)
 ┃ ┣ 📜 HistoriaBella.java
 ┃ ┣ 📜 HistoriaBestia.java
 ┃ ┗ 📜 HistoriaGaston.java
 ┣ 📂 doc                   // Javadoc generado (opcional)
 ┗ 📜 README.md
