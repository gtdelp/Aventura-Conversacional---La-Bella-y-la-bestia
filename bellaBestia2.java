//********************************************************************************************
//                              Hecho por: Luis, Guillermo y Jorge
//
//               Programa en JAVA: Aventura Conversacional basada en
//                           "La Bella y la Bestia"
//
//        Proyecto Final del Primer Trimestre — DAM 1º Año (2025-2026)
//********************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class bellaBestia2 {
    public static void main(String[] args) {

        // DEFINICIÓN DE COLORES (CÓDIGOS ANSI) 
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String BOLD = "\u001B[1m";

        // SEMILLAS DECLARADAS EN EL CÓDIGO
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        
        //TÍTULO CON ARTE ASCII Y COLOR 
        System.out.println(YELLOW + "---------------------------------------------------" + RESET);
        System.out.println(RED + "      . . . : : : LA ROSA ENCANTADA : : : . . .      " + RESET);
        System.out.println(YELLOW + "---------------------------------------------------" + RESET);
        System.out.println(RED + "                    (@)  "+ RESET);
        System.out.println(GREEN + "                     |   "+ RESET);
        System.out.println(GREEN + "                    \\|/  ");
        System.out.println(GREEN + "                     |   " + RESET);
        System.out.println("        BIENVENIDO A LA BELLA Y LA BESTIA");
        System.out.println(CYAN + "          Aventura Conversacional DAM" + RESET);
        System.out.println(YELLOW + "---------------------------------------------------\n" + RESET);


        //---CLAVE PARA EMPEZAR EL PROGRAMA---
        String clave;
        do{ 
            System.out.print(BOLD + "Introduce la clave para comenzar: " + RESET);
            clave = sc.nextLine();
            if(!clave.equals("jugones")){
                System.out.println(RED + "Clave incorrecta, prueba de nuevo." + RESET);
            }
        } while (!clave.equals("jugones"));

        //---SELECCIÓN DE PERSONAJES---
        int personaje = 0; 

        do { 
            System.out.println("\n" + PURPLE + "--Elige el personaje para tu aventura--" + RESET);
            // 1. BELLA (EN AMARILLO)
            System.out.println(YELLOW + "  ____  _____ _      _         _    " + RESET);
            System.out.println(YELLOW + " | __ )| ____| |    | |       / \\   " + RESET);
            System.out.println(YELLOW + " |  _ \\|  _| | |    | |      / _ \\  " + RESET);
            System.out.println(YELLOW + " | |_) | |___| |___ | |___  / ___ \\ " + RESET);
            System.out.println(YELLOW + " |____/|_____|_____||_____|/_/   \\_\\" + RESET);
            System.out.println("            (1) La Inteligente"); 
            
            System.out.println(""); 

            // 2. BESTIA (EN AZUL)
            System.out.println(BLUE + "  ____  _____ ____  _____ ___    _    " + RESET);
            System.out.println(BLUE + " | __ )| ____/ ___||_   _|_ _|  / \\   " + RESET);
            System.out.println(BLUE + " |  _ \\|  _| \\___ \\  | |  | |  / _ \\  " + RESET);
            System.out.println(BLUE + " | |_) | |___ ___) | | |  | | / ___ \\ " + RESET);
            System.out.println(BLUE + " |____/|_____|____/  |_| |___/_/   \\_\\" + RESET);
            System.out.println("            (2) El Maldito");

            System.out.println(""); 

            // 3. Y GASTON (EN ROJO)
            System.out.println(RED + " __   __   ____    _    ____ _____ ___  _   _ " + RESET);
            System.out.println(RED + " \\ \\ / /  / ___|  / \\  / ___|_   _/ _ \\| \\ | |" + RESET);
            System.out.println(RED + "  \\ V /  | |  _  / _ \\ \\___ \\ | || | | |  \\| |" + RESET);
            System.out.println(RED + "   | |   | |_| |/ ___ \\ ___) || || |_| | |\\  |" + RESET);
            System.out.println(RED + "   |_|    \\____/_/   \\_\\____/ |_| \\___/|_| \\_|" + RESET);
            System.out.println("            (3) El Cazador");

            System.out.print(BOLD + "[+] Escoge con quien quieres jugar: " + RESET);

            if(sc.hasNextInt()){
                personaje = sc.nextInt();
                sc.nextLine(); // Limpieza de buffer
            }else{
                sc.next(); //Limpieza de buffer de entrada
                personaje = 0;
            }

            if(personaje < 1 || personaje > 3){
                System.out.println(RED + "Entrada no valida por pantalla, intentalo otra vez." + RESET);
            }
            
        } while (personaje < 1 || personaje > 3);

        //---Lista de variables generales---
        int vidaJugador = 0;
        int vidaEnemigo = 0;
        boolean terminar = false;

        // Variables adicionales para el progreso
        int petalosRestantes = 5; 
        boolean tieneEspejo = false; // Objeto clave
        int bondad = 0; // Puntos para determinar el final

        //---Cargar datos del jugador---

        switch(personaje) {
            case 1:
                System.out.println("\n" + YELLOW + "[+] Has elegido a Bella." + RESET);
                System.out.println("[+] Tu fuerza reside en tu mente y tu corazón.");
                vidaJugador = 70;
                break;
            case 2:
                System.out.println("\n" + RED + "[+] Has elegido a Bestia." + RESET);
                vidaJugador = 120;
                break;
            case 3:
                System.out.println("\n" + CYAN + "[+] Has elegido a Gastón" + RESET);
                vidaJugador = 100;
                break;
        }

        //*************************************************************************
        //                          CAMINO DE BELLA
        //*************************************************************************
        if(personaje == 1){
            System.out.println("\n" + YELLOW + "===============================================================" + RESET);
            System.out.println(BOLD + "             CAPÍTULO 1: LA PRISIONERA" + RESET);
            System.out.println(YELLOW + "===============================================================" + RESET);
            System.out.println("Te encuentras encerrada en una habitación lujosa pero fría.");
            System.out.println("Tienes hambre y estás asustada. Escuchas un ruido en la puerta.");
            System.out.println(YELLOW + "===============================================================\n" + RESET);

            // PUZZLE 1: EL ACERTIJO DE DING DONG (PersonajeNoPrincipal 1)
            
            // Dibujo ASCII Ding Dong
            System.out.println(CYAN + "      .--. ");
            System.out.println("     ( 12 )");
            System.out.println("     |  / |   <- [DING DONG]");
            System.out.println("      '--' " + RESET);

            System.out.println("Un reloj parlante 'Ding Dong' te impide el paso.");
            System.out.println(CYAN + "Ding Dong:" + RESET + " 'Señorita, no puede salir... a menos que demuestre intelecto.'");
            System.out.println(CYAN + "Ding Dong:" + RESET + " 'Responde: Tengo agujas pero no coso, tengo números pero no cuento. ¿Qué soy?'");
            
            System.out.print(BOLD + "[+] Tu respuesta: " + RESET);
            String respuestaEnigma = sc.nextLine().toLowerCase();

            if(respuestaEnigma.contains("reloj")){
                System.out.println(GREEN + "\n'Ding Dong': Correcto! Veo que es usted muy inteligente." + RESET);
                System.out.println(GREEN + "(Ganas 10 puntos de Bondad)" + RESET);
                bondad += 10;
            } else {
                System.out.println(RED + "\n[Ding Dong]: Incorrecto. Pero me da pena... le dejaré pasar." + RESET);
                System.out.println(RED + "(Pierdes tiempo, la rosa pierde un pétalo)" + RESET);
                petalosRestantes--;
            }

            // PUZZLE 2: ADIVINAR NUMERO CON CHIP (PersonajeNoPrincipal 2)
            System.out.println("\nLlegas a la cocina.");
            
            // Dibujo ASCII Chip
            System.out.println(PURPLE + "    _  ");
            System.out.println("   ( ) ");
            System.out.println("  _| |_   <- [CHIP]");
            System.out.println(" |_____| " + RESET);
             
            System.out.println("Una pequeña taza 'Chip' se acerca saltando.");
            System.out.println(PURPLE + "Chip:" + RESET + " '¡Mamá! ¡Hay una chica! ¡Juguemos a adivinar!'");
            System.out.println("Sra. Potts: 'Si ganas a Chip, te daré una sopa caliente para recuperar fuerzas.'");

            int numeroSecreto = rand.nextInt(10) + 1; // Número entre 1 y 10
            int intentosChip = 3;
            boolean ganadoChip = false;
            
            System.out.println(BOLD + "\n[MINIJUEGO]: Adivina el número de Chip (1-10). Tienes 3 intentos." + RESET);
            
            //BUCLE MINIJUEGO, juego sencillo hecho en clase sobre adivinar un numero
            while(intentosChip > 0 && !ganadoChip){
                System.out.print(">> Introduce un número: ");
                if(sc.hasNextInt()){
                    int intento = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    if(intento == numeroSecreto){
                        System.out.println(PURPLE + "Chip: ¡SÍ! ¡Ese es!" + RESET);
                        ganadoChip = true;
                        vidaJugador += 30; // PREMIO DE CURACIÓN para el jugador
                        System.out.println(GREEN + "(Tomas la sopa. Tu vida sube a " + vidaJugador + " PV)" + RESET);
                    } else if (intento < numeroSecreto){
                        System.out.println("Chip: ¡No! Es más alto.");
                    } else {
                        System.out.println("Chip: ¡Te pasaste! Es más bajo.");
                    }
                } else {
                    sc.next();
                    System.out.println("¡Eso no es un número!");
                }
                intentosChip--;
            }

            if(!ganadoChip){
                System.out.println("Sra. Potts: 'Oh, vaya. Bueno, toma un té al menos.'");
                // Premio menor de consolacion para el jugador
                vidaJugador += 5; 
            }

            // --- BIFURCACIÓN EN EL CAMINO PARA BELLA ---
            System.out.println("\nSales de la cocina. Tienes dos caminos:");
            System.out.println("1. Ir al " + RED + "Ala Oeste" + RESET + " (Prohibida y oscura)");
            System.out.println("2. Ir a la " + BLUE + "Biblioteca" + RESET + " (Luz y conocimiento)");
            
            int camino = 0;
            while(camino != 1 && camino != 2){
                System.out.print(BOLD + "[+] Elige (1 o 2): " + RESET);
                if(sc.hasNextInt()) camino = sc.nextInt();
                else sc.next();
            }
            sc.nextLine();

            if(camino == 2){
                // PUZZLE 3: PIEDRA PAPEL TIJERAS CON LUMIERE (PersonajeNoPrincipal 3) 
                System.out.println("\nEn la biblioteca encuentras a Lumiere (el candelabro).");
                
                // Dibujo ASCII Lumiere
                System.out.println(YELLOW + "    |    ");
                System.out.println("   -O-   ");
                System.out.println("    |    <- [LUMIÈRE]" + RESET);

                System.out.println(YELLOW + "Lumiere:" + RESET + " 'Mon ami! Si me ganas a Piedra, Papel o Tijera, te daré un objeto especial.'");
                
                // Lógica simple de PPT (1 ronda)
                System.out.println("1. Piedra | 2. Papel | 3. Tijera");
                int manoJugador = 0;
                if(sc.hasNextInt()) manoJugador = sc.nextInt();
                int manoLumiere = rand.nextInt(3) + 1;
                sc.nextLine();

                if(manoJugador == manoLumiere){
                    System.out.println("¡Empate! Lumiere se ríe.");
                } else if((manoJugador == 1 && manoLumiere == 3) || (manoJugador == 2 && manoLumiere == 1) || (manoJugador == 3 && manoLumiere == 2)){
                    System.out.println(GREEN + "¡Ganaste! Lumiere te da el ESPEJO MÁGICO." + RESET);
                    tieneEspejo = true;
                    bondad += 10;
                } else {
                    System.out.println(RED + "Perdiste. Lumiere apaga sus velas." + RESET);
                }
            } else {
                System.out.println("\nVas al Ala Oeste. Es un lugar terrible. Encuentras la Rosa Flotando.");
                System.out.println("La curiosidad te hace tocarla... " + RED + "¡Cae un pétalo!" + RESET);
                petalosRestantes--;
                vidaJugador -= 10; // Daño por trampa/miedo
                System.out.println(RED + "(Pierdes 10 PV por el susto. Vida: " + vidaJugador + ")" + RESET);
            }

            //BATALLA COMPLETA (REQUISITO PRINCIPAL) 
            System.out.println(RED + "\n===============================================================");
            System.out.println("            CLÍMAX: EL ENCUENTRO CON LA BESTIA");
            System.out.println("===============================================================" + RESET);
            
            // Dibujo ASCII Bestia
            System.out.println(RED + "      (o  o) ");
            System.out.println("      ( -- )  <- [LA BESTIA]");
            System.out.println("     /|    |\\ " + RESET);

            System.out.println("    La Bestia aparece, furiosa porque estás fuera de tu cuarto.");
            System.out.println(RED + "                Bestia: '¡¿QUÉ HACES AQUÍ?!'" + RESET);
            System.out.println("          No puedes escapar. ¡Debes calmarlo o luchar!\n");

            // Configuración Enemigo (PersonajeNoPrincipal 4)
            vidaEnemigo = 100; // Vida de la Bestia
            int turnoBatalla = rand.nextInt(2); // 0 Jugador, 1 Bestia
            boolean batallaActiva = true;

            //BUCLE PRINICPAL DE LA BATALLA
            while(vidaJugador > 0 && vidaEnemigo > 0 && batallaActiva){
                
                System.out.println(YELLOW + "\n--- ESTADO ---" + RESET);
                System.out.println("Bella: " + GREEN + vidaJugador + " PV" + RESET);
                System.out.println("Bestia: " + RED + vidaEnemigo + " de 'Furia'" + RESET + " (Tienes que bajarla a 0 para ganar)");
                
                if(turnoBatalla % 2 == 0){
                    //TURNO DEL JUGADOR
                    System.out.println("\n[+] TU TURNO. Elige una acción:");
                    System.out.println("1. Argumentar con Lógica (Ataque Intelectual)");
                    System.out.println("2. Lanzar un Libro (Ataque Físico)");
                    System.out.println("3. Mirada Compasiva (Ataque Emocional - Alto Riesgo)");
                    
                    int ataque = 0;
                    if(sc.hasNextInt()) ataque = sc.nextInt();
                    sc.nextLine();

                    int danio = 0;
                    String mensajeAtaque = "";

                    // Definir daño base según el ataque escogido
                    if(ataque == 1){
                        danio = 15; 
                        mensajeAtaque = "Argumentas con razón."; 
                    }
                    else if(ataque == 2){
                        danio = 10; 
                        mensajeAtaque = "Le tiras una enciclopedia."; 
                    }
                    else if(ataque == 3){
                        danio = 25; 
                        mensajeAtaque = "Le miras a los ojos."; 
                    }
                    else{
                        danio = 0; 
                        mensajeAtaque = "Te quedas paralizada."; 
                    }

                    // CÁLCULO DEl IMPACTO (REQUISITOS PARA CUMPLIRSE: Total, Parcial, Esquiva)
                    int azarImpacto = rand.nextInt(100); // De 0 a 99
                    
                    if(azarImpacto < 15){
                        // 15% probabilidad de ESQUIVA (Fallo)
                        System.out.println(RED + "RESULTADO: ¡La Bestia ignora tu acción! (Esquiva/Fallo)" + RESET);
                        danio = 0;
                    } else if (azarImpacto < 40){
                        // 25% probabilidad de PARCIAL (Mitad de daño)
                        System.out.println(YELLOW + "RESULTADO: La Bestia se cubre, pero le afecta un poco. (Daño Parcial)" + RESET);
                        danio = danio / 2;
                    } else {
                        // 60% probabilidad de TOTAL
                        System.out.println(GREEN + "RESULTADO: ¡Impacto directo! " + mensajeAtaque + RESET);
                    }

                    vidaEnemigo -= danio;

                } else {
                    // TURNO DE BESTIA
                    System.out.println(RED + "\n[+] TURNO DE LA BESTIA" + RESET);
                    int tipoAtaqueBestia = rand.nextInt(3);
                    int danioBestia = 0;

                    if(tipoAtaqueBestia == 0) { 
                        System.out.println("La Bestia ha rugido fuertemente."); 
                        danioBestia = 15; 
                    } else if (tipoAtaqueBestia == 1) { 
                        System.out.println("La Bestia golpeó la pared haciendo caer escombros."); 
                        danioBestia = 10; 
                    } else { 
                        System.out.println("La Bestia te amenaza con sus garras."); 
                        danioBestia = 20; 
                    }

                    // Bella intenta esquivar (misma lógica que antes)
                    int azarDefensa = rand.nextInt(100);
                    if(azarDefensa < 20){
                        System.out.println(GREEN + "¡Lograste esquivar el ataque!" + RESET);
                        danioBestia = 0;
                    } else if(azarDefensa < 50){
                        System.out.println(YELLOW + "Te cubres, pero te haces daño." + RESET);
                        danioBestia = danioBestia / 2;
                    } else {
                        System.out.println(RED + "¡Te ha dado de lleno!" + RESET);
                    }

                    vidaJugador -= danioBestia;
                }

                turnoBatalla++; // Cambiar turno

            } // Fin While Batalla

            //RESOLUCIÓN DE LOS 5 FINALES 
            System.out.println(PURPLE + "\n===============================================================");
            System.out.println("                    FIN DE LA AVENTURA DE BELLA");
            System.out.println("===============================================================\n" + RESET);

            if(vidaJugador <= 0){
                // FINAL 1: DERROTA
                System.out.println(RED + " La Bestia no pudo controlarse." + RESET);
                System.out.println("Caíste herida en el castillo y nadie supo de ti.");

            } else if (vidaEnemigo <= 0){
                System.out.println("La Bestia cae de rodillas, calmada y avergonzada.");
                
                // DECISIÓN FINAL (PUZZLE 5)
                System.out.println(RED + "Bestia:" + RESET + " 'Vete... déjame morir aquí.'");
                System.out.println("¿Qué haces?");
                System.out.println("1. Irte para siempre (Escapar)");
                System.out.println("2. Quedarte y curarlo (Amor)");
                System.out.println("3. Usar el espejo (si lo tienes) para llamar ayuda");

                int decisionFinal = 0;
                if(sc.hasNextInt()) decisionFinal = sc.nextInt();

                if(decisionFinal == 1){
                    // FINAL 2: ESCAPE
                    System.out.println(BLUE + "Huyes al pueblo." + RESET);
                    System.out.println("Estás a salvo, pero siempre te preguntarás qué pasó con él.");
                
                } else if (decisionFinal == 2){
                    if(bondad >= 10){
                         // FINAL 3: FINAL FELIZ (Requiere puntos de bondad previos)
                        System.out.println(YELLOW + "Tus lágrimas rompen el hechizo." + RESET);
                        System.out.println("La Bestia se convierte en Príncipe. ¡Viven felices para siempre!");
                    } else {
                        // FINAL 4: STOCKHOLM / REGULAR
                        System.out.println(PURPLE + "Te quedas, pero la maldición no se rompe." + RESET);
                        System.out.println("Vives en el castillo como su amiga para siempre.");
                    }

                } else if (decisionFinal == 3 && tieneEspejo){
                    // FINAL 5 Y MAGICO: SECRETO (Solo si ganaste a Lumiere)
                    System.out.println(CYAN + "🔮 El espejo trae a tu padre." + RESET);
                    System.out.println("Juntos convencen al pueblo de que la Bestia es buena.");
                } else {
                    System.out.println("Intentas usar un espejo que no tienes... y huyes confundida.");
                    System.out.println("FINAL: Escape confuso.");
                }
            }

        } // FIN DEL BLOQUE DE BELLA

        //*************************************************************************
        //                          CAMINO DE GASTÓN
        //*************************************************************************
        if(personaje == 3){
            System.out.println(RED + "\n===============================================================" + RESET);
            System.out.println(BOLD + "             CAPÍTULO 1: EL EGO DEL CAZADOR" + RESET);
            System.out.println(RED + "===============================================================" + RESET);
            System.out.println("Despiertas sintiéndote genial. Nadie en el pueblo es tan fuerte como tú.");
            System.out.println("Tu objetivo: Encontrar a Bella y demostrar que eres el mejor.");
            System.out.println(RED + "===============================================================\n" + RESET);

            // VARIABLES GASTON
            int dinero = 5;
            boolean mapaParte1 = false;
            boolean mapaParte2 = false;
            boolean pocion = false;
            boolean leFouAmigo = false;
            boolean tienePuntaSigilosa = false;
            
            // Inventario Caza
            int pielLobo = 0, carneJabali = 0, cuernoCiervo = 0, carneConejo = 0;
            
            // Estado Juego Gastón
            int tiempoDia = 0; // Máximo 8 horas
            boolean finDia = false;
            int apoyoPueblo = 0;

            // BUCLE ACTO 1 (Día en el pueblo)
            while (tiempoDia < 8 && vidaJugador > 0 && !finDia) {
                System.out.println(BOLD + "\n[HORA]: " + (tiempoDia + 8) + ":00" + RESET);
                System.out.println("Dinero: " + YELLOW + dinero + " monedas" + RESET + " | Vida: " + GREEN + vidaJugador + RESET);
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Ir a la Biblioteca (Buscar a Bella)");
                System.out.println("2. Ir al Mercado (Comprar/Vender)");
                System.out.println("3. Ir a la Taberna (Lefou y Pueblo)");
                System.out.println("4. Ir al Bosque (Cazar animales)");
                System.out.println("5. Finalizar el día (Ir al rescate)");

                System.out.print(BOLD + "[+] Elige: " + RESET);
                int accion = 0;
                if(sc.hasNextInt()) accion = sc.nextInt();
                else sc.next(); // Limpiar basura
                
                tiempoDia++;

                if (accion == 1) { 
                    // BIBLIOTECA
                    System.out.println(CYAN + "Vas a la biblioteca..." + RESET);
                    if (!mapaParte1 && !mapaParte2) {
                        System.out.println("Bella no está. Qué raro. Normalmente siempre está aquí leyendo.");
                    } else {
                        System.out.println("Sigues sin encontrarla. Los rumores dicen que una Bestia la tiene.");
                    }

                } else if (accion == 2) { 
                    // MERCADO
                    System.out.println(YELLOW + "--- MERCADO ---" + RESET);
                    System.out.println("1. Vender Caza | 2. Tienda Misteriosa | 3. Salir");
                    int opMercado = 0;
                    if(sc.hasNextInt()) opMercado = sc.nextInt();
                    
                    if (opMercado == 1) {
                        int ganancia = (carneJabali * 15) + (cuernoCiervo * 12) + (carneConejo * 3) + (pielLobo * 20);
                        if (ganancia > 0) {
                            System.out.println("Has vendido todo por " + YELLOW + ganancia + " monedas." + RESET);
                            dinero += ganancia;
                            carneJabali = 0; cuernoCiervo = 0; carneConejo = 0; pielLobo = 0;
                        } else {
                            System.out.println("No tienes nada que vender.");
                        }
                    } else if (opMercado == 2) {
                        System.out.println("Vendedora: 'Tengo objetos raros...'");
                        System.out.println("1. Punta Sigilosa (5 monedas) - Ayuda a cazar");
                        System.out.println("2. Poción Sospechosa (10 monedas) - Fuerza oscura");
                        System.out.println("3. Mapa Raro (Intercambio por 1 Piel de Lobo)");
                        
                        int opTienda = 0;
                        if(sc.hasNextInt()) opTienda = sc.nextInt();

                        if (opTienda == 1 && dinero >= 5) {
                            dinero -= 5; tienePuntaSigilosa = true; System.out.println(GREEN + "Comprada Punta Sigilosa." + RESET);
                        } else if (opTienda == 2 && dinero >= 10 && !pocion) {
                            dinero -= 10; pocion = true; System.out.println(GREEN + "Comprada Poción." + RESET);
                        } else if (opTienda == 3 && pielLobo > 0 && !mapaParte1) {
                            pielLobo--; mapaParte1 = true; System.out.println(PURPLE + "¡Has conseguido la MITAD DEL MAPA!" + RESET);
                        } else {
                            System.out.println("No tienes dinero suficiente o materiales.");
                        }
                    }

                } else if (accion == 3) { 
                    // TABERNA
                    System.out.println(YELLOW + "--- TABERNA ---" + RESET);
                    System.out.println("1. Invitar a todos (10 monedas) | 2. Hablar con Lefou");
                    int opTaberna = 0;
                    if(sc.hasNextInt()) opTaberna = sc.nextInt();

                    if (opTaberna == 1) {
                        if (dinero >= 10) {
                            dinero -= 10;
                            apoyoPueblo++;
                            System.out.println(GREEN + "¡El pueblo te aclama! Gaston, Gaston, Gaston!" + RESET);
                        } else {
                            System.out.println("No tienes dinero para invitar.");
                        }
                    } else {
                        // Minijuego PPT simplificado
                        if (!leFouAmigo) {
                            System.out.println("Lefou: 'Gáname a Piedra Papel Tijeras y te daré información'.");
                            int vic = 0; 
                            int derr = 0;
                            while(vic < 2 && derr < 2){
                                System.out.println("1.Piedra 2.Papel 3.Tijera");
                                int j = sc.nextInt();
                                int l = rand.nextInt(3)+1;
                                if(j==l) System.out.println("Empate");
                                else if((j==1 && l==3)||(j==2 && l==1)||(j==3 && l==2)) { System.out.println(GREEN+"Punto"+RESET); vic++; }
                                else { System.out.println(RED+"Fallo"+RESET); derr++; }
                            }
                            if (vic == 2) {
                                leFouAmigo = true;
                                System.out.println("Lefou: 'Bien jugado. Escuché que la otra mitad del mapa está en el Santuario del Bosque'.");
                            }
                        } else {
                            System.out.println("Lefou ya te ha contado todo lo que sabe.");
                        }
                    }

                } else if (accion == 4) { 
                    // BOSQUE (Caza y Combate)
                    System.out.println(GREEN + "Te adentras en el bosque..." + RESET);
                    
                    if (leFouAmigo && !mapaParte2) {
                        // JEFE LOBO (Boss de zona)
                        System.out.println(RED + "¡Un LOBO ALFA protege el Santuario!" + RESET);
                        int vidaLobo = 80;
                        while(vidaJugador > 0 && vidaLobo > 0){
                            System.out.println("Tu vida: " + vidaJugador + " | Lobo: " + vidaLobo);
                            System.out.println("1. Atacar | 2. Poción");
                            int act = sc.nextInt();
                            if(act==1) { vidaLobo -= 20; System.out.println("Golpeas al lobo."); }
                            else if (act==2 && pocion) { vidaLobo -= 50; System.out.println(PURPLE + "¡Usas poder oscuro!" + RESET); pocion=false; }
                            
                            if(vidaLobo>0) {
                                vidaJugador -= 15;
                                System.out.println(RED + "El lobo te muerde (-15 PV)" + RESET);
                            }
                        }
                        if(vidaJugador > 0){
                            mapaParte2 = true;
                            System.out.println(PURPLE + "¡Has encontrado la OTRA MITAD DEL MAPA en el santuario!" + RESET);
                        }

                    } else {
                        // Caza normal
                        int animal = rand.nextInt(3); // 0 conejo, 1 ciervo, 2 jabali
                        if (animal == 0) {
                            System.out.println("Un conejo. Fácil.");
                            carneConejo++;
                        } else if (animal == 1) {
                            System.out.println("Un Ciervo. Adivina el número (1-5) para cazarlo.");
                            int numCiervo = rand.nextInt(5)+1;
                            int intentos = tienePuntaSigilosa ? 2 : 1;
                            boolean cazado = false;
                            while(intentos > 0 && !cazado){
                                System.out.print("Numero: ");
                                int miNum = sc.nextInt();
                                if(miNum == numCiervo) { System.out.println("¡Cazado!"); cuernoCiervo++; cazado=true;}
                                else System.out.println("Fallaste.");
                                intentos--;
                            }
                        } else {
                            System.out.println(RED + "¡Un JABALÍ salvaje!" + RESET);
                            int vidaJabali = 40;
                            while(vidaJugador > 0 && vidaJabali > 0){
                                System.out.println("1. Atacar");
                                sc.nextInt(); // Solo hay ataque básico para simplificar
                                vidaJabali -= 15;
                                if(vidaJabali > 0) {
                                    System.out.println("El jabalí embiste.");
                                    vidaJugador -= 10;
                                }
                            }
                            if(vidaJugador > 0) { System.out.println("Jabalí muerto."); carneJabali++; }
                        }
                    }

                } else if (accion == 5) {
                    finDia = true;
                }
            } // FIN DEL BUCLE DIA

            if (vidaJugador <= 0) {
                System.out.println(RED + "Has muerto en el bosque." + RESET);
                System.out.println("FINAL: El cazador cazado.");
            } else {
                // ACTO 2: EL RESCATE
                System.out.println(RED + "\n--- CLÍMAX: EL ASALTO AL CASTILLO ---" + RESET);
                
                if (mapaParte1 && mapaParte2) {
                    System.out.println("Tienes el mapa completo. Sabes dónde está la Bestia.");
                    System.out.println("El padre de Bella pide ayuda. Intentas animar al pueblo.");
                    
                    // Minijuego convencer pueblo (RNG simple)
                    int suerte = rand.nextInt(6) + apoyoPueblo; 
                    if (suerte >= 4) {
                        System.out.println(GREEN + "¡El pueblo te sigue! '¡Maten a la Bestia!'" + RESET);
                        
                        // JEFE FINAL BESTIA (Versión Gastón)
                        System.out.println(RED + "Llegas al castillo. La Bestia te espera." + RESET);
                        vidaEnemigo = 120;
                        
                        while(vidaJugador > 0 && vidaEnemigo > 0){
                            System.out.println("Gastón: " + vidaJugador + " | Bestia: " + vidaEnemigo);
                            System.out.println("1. Flechazo | 2. Espadazo | 3. Poción");
                            int comb = 0; 
                            if(sc.hasNextInt()) comb = sc.nextInt();

                            if(comb == 1) { vidaEnemigo -= 15; System.out.println("Disparas flecha."); }
                            else if (comb == 2) { vidaEnemigo -= 25; System.out.println("Usas la espada."); }
                            else if (comb == 3 && pocion) { 
                                vidaEnemigo -= 60; 
                                System.out.println(PURPLE + "¡La poción quema a la bestia!" + RESET); 
                                pocion = false; // Se gasta, pero marca el final malo
                                // Truco: usamos bondad como flag de 'usó poción' en este contexto para ahorrar variables
                                bondad = 666; 
                            }

                            if(vidaEnemigo > 0){
                                vidaJugador -= rand.nextInt(20) + 10;
                                System.out.println(RED + "La Bestia te golpea." + RESET);
                            }
                        }

                        if(vidaJugador > 0){
                            if(bondad == 666){
                                System.out.println(RED + "FINAL MALO: Ganaste, pero la poción te convirtió en una nueva Bestia." + RESET);
                            } else {
                                System.out.println(YELLOW + "FINAL FALSO: Mataste a la Bestia. Bella te odia por asesinar a su amor." + RESET);
                            }
                        } else {
                            System.out.println(RED + "FINAL: La Bestia te ha derrotado." + RESET);
                        }

                    } else {
                        System.out.println("El pueblo no confía en ti. Vas solo.");
                        System.out.println(RED + "FINAL: Los lobos te emboscan en el camino. El Abandonado." + RESET);
                    }

                } else {
                    System.out.println("Sin el mapa, te pierdes en el bosque buscando el castillo.");
                    System.out.println(RED + "FINAL: Perdido en la oscuridad." + RESET);
                }
            }

        } // FIN DEL BLOQUE DE GASTON

        //*************************************************************************
        //                          CAMINO DE BESTIA
        //*************************************************************************
        if (personaje == 2) {
            // Texto de introducción del camino de Bestia
            System.out.println(BLUE + "\n===============================================================" + RESET);
            System.out.println(BOLD + "             CAPÍTULO 1: LA MALDICIÓN DEL PRÍNCIPE" + RESET);
            System.out.println(BLUE + "===============================================================" + RESET);
            System.out.println("Despiertas en tu forma de Bestia, solo en el gran salón del castillo.");
            System.out.println("La rosa encantada pierde lentamente sus pétalos. Debes decidir cómo actuar para romper la maldición.\n");

            // Variables exclusivas del camino de Bestia
            boolean ritualRealizado = false; // Para no ofrecer el ritual muchas veces
            String finalBestia = "";         // Para guardar el nombre del final alcanzado
            int eleccion = 0;
            int acciones = 0;
            
            // Variables de estado para Bestia (inicializadas)
            int pistasConseguidas = 0;
            boolean lumiereAmigo = false;
            boolean brujaHostil = true;
            int turno = 0;

            // Bucle principal de acciones de Bestia
            while (!terminar) {

                // --- MENÚ PRINCIPAL DE LA BESTIA ---
                System.out.println(BLUE + "\n================ MENÚ DE LA BESTIA ================" + RESET);
                System.out.println("1. Reunirte con los sirvientes (Lumière y Ding Dong)");
                System.out.println("2. Salir a patrullar el bosque");
                System.out.println("3. Buscar a la Bruja en el claro");
                System.out.println("4. Prepararte para la llegada de Gastón");
                System.out.println("5. Ver tu estado actual");
                System.out.println("6. Abandonar el castillo (final alternativo)");
                System.out.println(BLUE + "===================================================" + RESET);
                System.out.print(BOLD + "[+] Elige una opción: " + RESET);

                // Lectura segura de la opción de menú
                if (sc.hasNextInt()) {
                    eleccion = sc.nextInt();
                } else {
                    sc.next(); // limpiamos entrada no numérica
                    eleccion = 0;
                }

                // Comprobación de opción válida
                if (eleccion < 1 || eleccion > 6) {
                    System.out.println(RED + "Opción no válida. Intenta de nuevo." + RESET);
                    continue; // volvemos al principio del while sin contar acción
                }

                // Cada opción válida cuenta como una acción
                acciones++;

                // --- EVENTO PARA EVITAR BUCLE INFINITO (≥ 12 acciones) ---
                if (acciones >= 12) {
                    System.out.println(RED + "\n*** Sientes que el tiempo se agota para romper la maldición... ***" + RESET);
                    if (pistasConseguidas >= 2) {
                        System.out.println("Has acumulado algunas pistas. Debes decidir tu destino:");
                        System.out.println("1. Intentar el ritual final");
                        System.out.println("2. Aceptar tu destino como Guardián del castillo");
                        System.out.print("[+] Elige: ");

                        int opcionFinal = 0;
                        if (sc.hasNextInt()) {
                            opcionFinal = sc.nextInt();
                        } else {
                            sc.next();
                            opcionFinal = 2; // por defecto, aceptar destino
                        }

                        if (opcionFinal == 1) {
                            int aciertosRitual = realizarRitual(sc);
                            if (aciertosRitual >= 2) {
                                System.out.println(GREEN + "\nFINAL: HUMANO POR AMOR" + RESET);
                                finalBestia = "Humano por Amor";
                            } else {
                                System.out.println(RED + "\nFINAL: TIRANO MÁGICO" + RESET);
                                finalBestia = "Tirano Mágico";
                            }
                        } else {
                            System.out.println(BLUE + "\nFINAL: EL GUARDIÁN" + RESET);
                            System.out.println("Aceptas tu destino como Guardián eterno del castillo.");
                            finalBestia = "El Guardián";
                        }

                    } else {
                        System.out.println("No tienes pistas suficientes para cambiar tu destino.");
                        System.out.println(PURPLE + "\nFINAL: AISLADO — La Bestia abandona el castillo y se pierde en el bosque." + RESET);
                        finalBestia = "Aislado";
                    }

                    terminar = true;
                    break; // salimos del while principal
                }

                // --- EVENTO ESPECIAL: RITUAL PARA ROMPER LA MALDICIÓN (≥ 3 pistas) ---
                if (pistasConseguidas >= 3 && !ritualRealizado) {
                    System.out.println(YELLOW + "\nLa rosa brilla intensamente. Sientes que puedes intentar un ritual para romper la maldición." + RESET);
                    System.out.println("¿Quieres intentar el ritual final ahora?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.print("[+] Elige: ");

                    int opcionRitual = 0;
                    if (sc.hasNextInt()) {
                        opcionRitual = sc.nextInt();
                    } else {
                        sc.next();
                        opcionRitual = 2;
                    }

                    if (opcionRitual == 1) {
                        int aciertosRitual = realizarRitual(sc);

                        if (aciertosRitual >= 2) {
                            System.out.println(GREEN + "\nFINAL: HUMANO POR AMOR" + RESET);
                            finalBestia = "Humano por Amor";
                        } else {
                            System.out.println(RED + "\nFINAL: TIRANO MÁGICO" + RESET);
                            finalBestia = "Tirano Mágico";
                        }

                        ritualRealizado = true;
                        terminar = true;
                        break; // salimos del while principal tras el final
                    } else {
                        System.out.println("Decides esperar un poco más antes de intentar el ritual...");
                        ritualRealizado = true; // no lo volvemos a ofrecer automáticamente
                    }
                }

                // --- EJECUCIÓN DE LA OPCIÓN DEL MENÚ ---
                switch (eleccion) {

                    // OPCIÓN 1 — Reunirse con los sirvientes (Cara o Cruz)
                    case 1:
                        System.out.println("\nTe reúnes con Lumière y Ding Dong en el salón principal.");
                        System.out.println("Lumière te propone un juego de CARA o CRUZ para desvelar una pista sobre la rosa encantada.");
                        System.out.println("Elige tu apuesta:");
                        System.out.println("1. Cara");
                        System.out.println("2. Cruz");
                        System.out.print("[+] Escoge: ");

                        int apuesta = 0;
                        if (sc.hasNextInt()) {
                            apuesta = sc.nextInt();
                        } else {
                            sc.next();
                            apuesta = 0;
                        }

                        if (apuesta != 1 && apuesta != 2) {
                            System.out.println("Lumière se ríe: Eso no es una opción válida, mon ami.");
                            break;
                        }

                        int moneda = rand.nextInt(2) + 1; // 1 o 2
                        if (apuesta == moneda) {
                            System.out.println(GREEN + "La moneda cae a tu favor. ¡Has ganado! (+1 pista)" + RESET);
                            pistasConseguidas++;
                            lumiereAmigo = true;
                        } else {
                            System.out.println(RED + "La moneda te da la espalda. Has perdido, vuelve luego..." + RESET);
                        }
                        break;

                    // OPCIÓN 2 — Patrullar el bosque
                    case 2:
                        System.out.println("\nSales a patrullar el bosque que rodea el castillo.");
                        if (brujaHostil) {
                            System.out.println("Te encuentras con la Bruja, que aún se muestra hostil.");
                            System.out.println("Te ofrece una poción peligrosa: Ganarás poder, pero podrías perder humanidad.");
                            System.out.println("¿Aceptas la poción?");
                            System.out.println("1. Sí");
                            System.out.println("2. No");
                            System.out.print("[+] Elige: ");

                            int respuestaPocion = 0;
                            if (sc.hasNextInt()) {
                                respuestaPocion = sc.nextInt();
                            } else {
                                sc.next();
                                respuestaPocion = 2;
                            }

                            if (respuestaPocion == 1) {
                                System.out.println(PURPLE + "Bebes la poción. Sientes un gran poder recorrer tu cuerpo, pero algo de tu humanidad se apaga..." + RESET);
                                brujaHostil = false;
                                pistasConseguidas++;
                                vidaJugador += 10; // gana algo de vida como 'poder'
                                System.out.println("Tu vida aumenta gracias al poder oscuro. Vida actual: " + vidaJugador);
                            } else if (respuestaPocion == 2) {
                                System.out.println("Rechazas la oferta. La Bruja te observa en silencio y desaparece entre los árboles.");
                                System.out.println("No ocurre nada más por ahora.");
                            } else {
                                System.out.println("La Bruja se enfada por tu indecisión y se marcha sin decir nada.");
                            }
                        } else {
                            System.out.println("La Bruja ya no es hostil. Murmura que podría ayudarte si demuestras ser digno.");
                        }
                        break;

                    // OPCIÓN 3 — Buscar a la Bruja en el claro (Enigma matemático)
                    case 3:
                        System.out.println("\nTe diriges al claro donde vive la Bruja.");
                        System.out.println("Para ayudarte, la Bruja te plantea un enigma matemático:");
                        System.out.println(YELLOW + "¿Cuánto es 7 * 6 - 10?" + RESET);
                        System.out.print("[+] Respuesta numérica: ");

                        int respuestaEnigma;
                        if (sc.hasNextInt()) {
                            respuestaEnigma = sc.nextInt();
                        } else {
                            sc.next();
                            respuestaEnigma = -1;
                        }

                        if (respuestaEnigma == 32) {
                            System.out.println(GREEN + "La Bruja asiente satisfecha: Parece que no solo eres fuerza bruta." + RESET);
                            System.out.println("Te entrega una pista sobre la rosa encantada.");
                            pistasConseguidas++;
                            brujaHostil = false;
                        } else {
                            System.out.println(RED + "La Bruja se burla de ti: Ni siquiera puedes con un problema tan simple." + RESET);
                            System.out.println("Ella desaparece en una nube de humo.");
                        }
                        break;

                    // OPCIÓN 4 — Prepararse para la llegada de Gastón (Batalla)
                    case 4:
                        System.out.println("\nFortificas las puertas del castillo y vigilas desde las almenas.");
                        int probAtaque = rand.nextInt(100);
                        if (probAtaque < 40) {
                            System.out.println(RED + "¡Gastón y los aldeanos atacan el castillo!" + RESET);
                            System.out.println("Debes enfrentarte a Gastón en una batalla decisiva.\n");

                            vidaEnemigo = 100;           // Vida inicial de Gastón
                            turno = rand.nextInt(2);     // 0 = Bestia, 1 = Gastón

                            // BUCLE DE BATALLA COMPLETA
                            while (vidaJugador > 0 && vidaEnemigo > 0) {

                                if (turno == 0) {
                                    // --- TURNO DE LA BESTIA ---
                                    System.out.println(BLUE + "\n--- TURNO DE LA BESTIA ---" + RESET);
                                    System.out.println("Vida Bestia: " + GREEN + vidaJugador + RESET + " | Vida Gastón: " + RED + vidaEnemigo + RESET);
                                    System.out.println("Elige tu ataque:");
                                    System.out.println("1. Zarpazo Brutal (daño base 35)");
                                    System.out.println("2. Tajo Rápido (daño base 20)");
                                    System.out.println("3. Rugido (daño 0 pero efecto narrativo)");
                                    System.out.print("[+] Ataque: ");

                                    int ataqueBestia = 0;
                                    if (sc.hasNextInt()) {
                                        ataqueBestia = sc.nextInt();
                                    } else {
                                        sc.next();
                                        ataqueBestia = 3; // por defecto Rugido
                                    }

                                    int danoBase = 0;
                                    String nombreAtaque = "";

                                    switch (ataqueBestia) {
                                        case 1:
                                            danoBase = 35;
                                            nombreAtaque = "Zarpazo Brutal";
                                            break;
                                        case 2:
                                            danoBase = 20;
                                            nombreAtaque = "Tajo Rápido";
                                            break;
                                        case 3:
                                        default:
                                            danoBase = 0;
                                            nombreAtaque = "Rugido";
                                            System.out.println("Lanzas un rugido que hace temblar las paredes, pero no inflige daño directo.");
                                            break;
                                    }

                                    int resultadoAtaque = rand.nextInt(100);
                                    int danoReal = 0;

                                    if (danoBase == 0) {
                                        // Rugido: solo efecto narrativo
                                        System.out.println("Gastón se estremece ante tu rugido. Puede que dude en su próximo movimiento...");
                                    } else if (resultadoAtaque < 50) {
                                        danoReal = danoBase;
                                        System.out.println(GREEN + "Tu " + nombreAtaque + " impacta completamente. Gastón pierde " + danoReal + " puntos de vida." + RESET);
                                    } else if (resultadoAtaque < 80) {
                                        danoReal = danoBase / 2;
                                        System.out.println(YELLOW + "Gastón logra cubrirse parcialmente. Solo recibe " + danoReal + " puntos de daño." + RESET);
                                    } else {
                                        System.out.println(RED + "Gastón esquiva ágilmente tu " + nombreAtaque + ". No recibe daño." + RESET);
                                    }

                                    vidaEnemigo -= danoReal;
                                    if (vidaEnemigo < 0) {
                                        vidaEnemigo = 0;
                                    }

                                    // Si Gastón muere, terminamos la batalla
                                    if (vidaEnemigo <= 0) {
                                        break;
                                    }

                                    turno = 1; // siguiente turno para Gastón

                                } else {
                                    // --- TURNO DE GASTÓN ---
                                    System.out.println(RED + "\n--- TURNO DE GASTÓN ---" + RESET);
                                    System.out.println("Vida Bestia: " + GREEN + vidaJugador + RESET + " | Vida Gastón: " + RED + vidaEnemigo + RESET);

                                    int ataqueGaston = rand.nextInt(3) + 1;
                                    String nombreAtaqueG = "";
                                    int danoBaseG = 0;

                                    switch (ataqueGaston) {
                                        case 1:
                                            nombreAtaqueG = "Disparo de Ballesta";
                                            danoBaseG = 30;
                                            break;
                                        case 2:
                                            nombreAtaqueG = "Estocada de Lanza";
                                            danoBaseG = 25;
                                            break;
                                        case 3:
                                        default:
                                            nombreAtaqueG = "Golpe de Maza";
                                            danoBaseG = 20;
                                            break;
                                    }

                                    System.out.println("Gastón usa " + nombreAtaqueG + ".");

                                    int resultadoAtaqueG = rand.nextInt(100);
                                    int danoRealG = 0;

                                    if (resultadoAtaqueG < 50) {
                                        danoRealG = danoBaseG;
                                        System.out.println(RED + "El ataque impacta completamente. Pierdes " + danoRealG + " puntos de vida." + RESET);
                                    } else if (resultadoAtaqueG < 80) {
                                        danoRealG = danoBaseG / 2;
                                        System.out.println(YELLOW + "Consigues cubrirte a tiempo. Solo recibes " + danoRealG + " puntos de daño." + RESET);
                                    } else {
                                        System.out.println(GREEN + "Esquivas el ataque de Gastón. No recibes daño." + RESET);
                                    }

                                    vidaJugador -= danoRealG;
                                    if (vidaJugador < 0) {
                                        vidaJugador = 0;
                                    }

                                    // Si la Bestia muere, terminamos la batalla
                                    if (vidaJugador <= 0) {
                                        break;
                                    }

                                    turno = 0; // siguiente turno para Bestia
                                }
                            } // fin while batalla

                            // Resultado de la batalla
                            if (vidaJugador <= 0) {
                                System.out.println(RED + "\nHas caído en lo alto de la torre del castillo." + RESET);
                                System.out.println("FINAL: MUERTE EN LA TORRE");
                                finalBestia = "Muerte en la Torre";
                            } else if (vidaEnemigo <= 0) {
                                System.out.println(GREEN + "\nGastón es derrotado y el pueblo se retira." + RESET);
                                System.out.println("Has protegido el castillo y a quienes viven en él.");
                                System.out.println("FINAL: EL GUARDIÁN");
                                finalBestia = "El Guardián";
                            }

                            terminar = true; // tras la batalla, el juego termina

                        } else {
                            System.out.println("No hay ataques inmediatos. Aprovechas para reorganizarte y reforzar el castillo.");
                        }
                        break;

                    // OPCIÓN 5 — Ver estado actual
                    case 5:
                        System.out.println("\n--- ESTADO ACTUAL DE LA BESTIA ---");
                        System.out.println("Vida actual: " + vidaJugador);
                        System.out.println("Pistas conseguidas sobre la rosa: " + pistasConseguidas);
                        System.out.println("Bruja hostil: " + (brujaHostil ? "SÍ, aún desconfía de ti." : "NO, está dispuesta a ayudarte."));
                        System.out.println("Lumière es tu amigo: " + (lumiereAmigo ? "SÍ, confía en ti." : "NO del todo, todavía tiene miedo."));
                        break;

                    // OPCIÓN 6 — Abandonar el castillo (Final Aislado)
                    case 6:
                        System.out.println(PURPLE + "\nDecides abandonar el castillo, alejándote de todos y de la maldición." + RESET);
                        System.out.println("FINAL: AISLADO — La Bestia abandona el castillo y vive sola, lejos del mundo.");
                        finalBestia = "Aislado";
                        terminar = true;
                        break;

                    default:
                        System.out.println("Algo raro ha pasado con el menú de Bestia...");
                        break;
                } // fin switch de opciones

            } // fin while principal de Bestia

            // Mensaje final opcional de resumen del final alcanzado
            if (!finalBestia.equals("")) {
                System.out.println(BOLD + "\n>> Final alcanzado para Bestia: " + finalBestia + RESET);
            }
        } 

        System.out.println(PURPLE + "\n--- FIN DEL JUEGO ---" + RESET);
        sc.close();
    }

    // Método auxiliar para el EVENTO ESPECIAL: Ritual para romper la maldición
    // Devuelve el número de respuestas correctas (aciertos) de las 3 preguntas.
    public static int realizarRitual(Scanner sc) {

        int aciertos = 0;
        int respuesta;

        System.out.println("\n--- RITUAL PARA ROMPER LA MALDICIÓN ---");
        System.out.println("La rosa se ilumina y escuchas una voz que susurra preguntas a tu corazón.");
        System.out.println("Necesitas al menos 2 respuestas correctas para recuperar tu humanidad.\n");

        // Pregunta 1
        do {
            System.out.println("1) ¿Qué valor importa más para recuperar la humanidad?");
            System.out.println("1. Poder");
            System.out.println("2. Amor");
            System.out.println("3. Orgullo");
            System.out.print("[+] Elige (1-3): ");

            if (sc.hasNextInt()) {
                respuesta = sc.nextInt();
            } else {
                sc.next();
                respuesta = 0;
            }

            if (respuesta < 1 || respuesta > 3) {
                System.out.println("Respuesta no válida, intenta de nuevo.\n");
            }

        } while (respuesta < 1 || respuesta > 3);

        if (respuesta == 2) { // Amor es la respuesta correcta
            aciertos++;
        }

        // Pregunta 2
        do {
            System.out.println("\n2) ¿A quién perdonarías primero?");
            System.out.println("1. A ti mismo por tus errores.");
            System.out.println("2. A quienes se burlaron de ti.");
            System.out.println("3. A nadie, nadie merece perdón.");
            System.out.print("[+] Elige (1-3): ");

            if (sc.hasNextInt()) {
                respuesta = sc.nextInt();
            } else {
                sc.next();
                respuesta = 0;
            }

            if (respuesta < 1 || respuesta > 3) {
                System.out.println("Respuesta no válida, intenta de nuevo.\n");
            }

        } while (respuesta < 1 || respuesta > 3);

        if (respuesta == 1) { // Perdonarse a uno mismo
            aciertos++;
        }

        // Pregunta 3
        do {
            System.out.println("\n3) ¿Aceptarías sacrificios por los que quieres?");
            System.out.println("1. Sí, incluso si pongo en riesgo mi vida.");
            System.out.println("2. Solo si no pierdo nada importante.");
            System.out.println("3. No, primero estoy yo.");
            System.out.print("[+] Elige (1-3): ");

            if (sc.hasNextInt()) {
                respuesta = sc.nextInt();
            } else {
                sc.next();
                respuesta = 0;
            }

            if (respuesta < 1 || respuesta > 3) {
                System.out.println("Respuesta no válida, intenta de nuevo.\n");
            }

        } while (respuesta < 1 || respuesta > 3);

        if (respuesta == 1) { // Aceptar sacrificios es la respuesta correcta
            aciertos++;
        }

        System.out.println("\nHas terminado el ritual. Aciertos: " + aciertos + " de 3.");
        return aciertos;
    }
}