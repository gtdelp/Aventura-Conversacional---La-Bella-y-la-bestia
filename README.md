# 🏰 PROYECTO ETPA: El Corazón Encantado de la Bestia 🌹

![Estado del Proyecto](https://img.shields.io/badge/Estado-Terminado-green)
![Lenguaje](https://img.shields.io/badge/Java-JDK_8%2B-red)
![IDE](https://img.shields.io/badge/IDE-Eclipse-orange)

---

## 🌟 Resumen del Proyecto

Este es un proyecto de fin de trimestre que recrea los populares libro-juegos **"Elige tu propia aventura" (ETPA)**, implementado como un videojuego de consola en **Java**.

La aventura está inspirada en el clásico cuento **"La Bella y la Bestia"** y se ubica dentro de la categoría de Fantasía Medieval. El objetivo es ofrecer una experiencia inmersiva mediante la aplicación sólida de conceptos de programación estructurada en un **código unificado**: condicionales complejos, gestión de estados con variables y lógica de menús interactivos.

---

## 🎯 Características y Mecánicas

El juego cumple rigurosamente con las especificaciones del proyecto en un único fichero ejecutable:

### 1. Sistema de Inicio y Personajes
| Característica | Detalle |
| :--- | :--- |
| **Seguridad** | Sistema de acceso por contraseña (`do-while`). La clave es: **`jugones`**. |
| **Multiperspectiva** | Elección entre **3 protagonistas**: Bella, La Bestia y Gastón. |
| **Narrativa Ramificada** | Cada protagonista cuenta con **5 finales diferentes** según las decisiones tomadas. |
| **Interacción** | Diálogos con NPCs (Lumière, Ding Dong, Maurice, Le Fou). |

### 2. Sistema de Batalla (RPG) ⚔️
Se ha implementado un motor de combate por turnos que incluye:
* **Stats:** Puntos de Vida (PV) y Daño variable.
* **Acciones:** Menú de combate con **3 ataques posibles**.
* **RNG (Aleatoriedad):** El primer turno y los daños se deciden con `Random` y `Math.random()`.
* **Cálculo de Daño:** Sistema lógico que determina si el golpe es:
    * 💥 Daño Total (Impacto directo).
    * 🛡️ Daño Parcial (El enemigo se cubre).
    * 💨 Esquiva (Daño nulo).

### 3. Minijuegos y Lógica 🧩
Para avanzar en la trama, el jugador debe superar diversos desafíos integrados en el flujo principal:
* Piedra, Papel o Tijeras (contra la IA).
* Adivina el Número (Lógica de búsqueda).
* Acertijos de texto (Validación de Strings).
* Validación estricta de menús (control de excepciones `try-catch` y errores de entrada).

---

## 🚀 Guía de Instalación y Ejecución

### Requisitos Técnicos
* **Lenguaje:** Java (JDK 8 o superior).
* **Entorno:** Eclipse IDE (Recomendado) o cualquier editor de texto compatible con Java.

### Cómo jugar
1.  Descarga el archivo `bellaBestia2.java` o el `.zip` completo del repositorio.
2.  Abre **Eclipse** y crea un nuevo proyecto Java.
3.  Arrastra el archivo `bellaBestia2.java` dentro de la carpeta `src` de tu proyecto (asegúrate de que el paquete sea el correcto o `default`).
4.  Haz clic derecho sobre el archivo y selecciona `Run As > Java Application`.
5.  Introduce la clave **`jugones`** en la consola para comenzar.

---

## 📂 Estructura del Proyecto

El proyecto sigue una estructura monolítica para facilitar la compilación y corrección, conteniendo toda la lógica (Menús, Historias de los 3 personajes y Batallas) en una única clase principal:

```text
📦 PROYECTO_ETPA
 ┣ 📂 src
 ┃ ┗ 📜 bellaBestia2.java   // CÓDIGO COMPLETO (Main + Lógica de los 3 caminos)
 ┗ 📜 README.md

