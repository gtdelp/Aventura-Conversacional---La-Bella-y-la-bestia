//********************************************************************************************
//                               Hecho por: Luis, Guillermo y Jorge
//
//              Programa en JAVA: Aventura Conversacional basada en
//                           "La Bella y la Bestia"
//
//        Proyecto Final del Primer Trimestre — DAM 1º Año (2025-2026)
//********************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class bellaBestia2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("---------------------------------------------------");
        System.out.println("        BIENVENIDO A LA BELLA Y LA BESTIA");
        System.out.println("          Aventura Conversacional DAM");
        System.out.println("---------------------------------------------------\n");

        //---CLAVE PARA EMPEZAR EL PROGRAMA---

        String clave;

        do{ 
            System.out.print("Introduce la clave para comenzar: ");
            clave = sc.nextLine();
            if(!clave.equals("jugones")){
                System.out.println("Clave incorrecta, prueba de nuevo.");
            }
        } while (!clave.equals("jugones"));

        //---SELECCIÓN DE PERSONAJES---

        int personaje = 0; 

        do { 
            System.out.println("--Elige el personaje para tu aventura--");
            System.out.println("1. Bella");
            System.out.println("2. Bestia");
            System.out.println("3. Gastón");
            System.out.print("[+] Escoge tu opción: ");

            if(sc.hasNextInt()){
                personaje = sc.nextInt();
            }else{
                sc.next(); //Limpieza de buffer de entrada
                personaje = 0;
            }

            if(personaje < 1 || personaje > 3){
                System.out.println("Entrada no valida por pantalla, intentalo otra vez.");
            }
            
        } while (personaje < 1 || personaje > 3);

        //---Lista de variables generales---

        int vidaJugador = 0;
        int vidaEnemigo = 0;
        int eleccion = 0;
        int turno = 0;
        int finalesContador = 0;
        boolean terminar = false;

        //---Cargar datos del jugador---

        switch (personaje) {
            case 1:
                System.out.println("Has elegido a Bella.");
                vidaJugador = 70;
                break;
            case 2:
                System.out.println("Has elegido a Bestia.");
                vidaJugador = 120;
                break;
            case 3:
                System.out.println("Has elegido a Gastón");
                vidaJugador = 100;
                break;
            default:
                System.out.println("Algo salió mal en el switch del personaje...");
                break;
        }

        //---Historia según el personaje elegido---

        switch (personaje){
            aaaaa
        }
    }
}
