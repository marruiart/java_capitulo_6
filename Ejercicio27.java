
/**
 * Este programa implementa el juego piedra, papel y tijera. Primero, el usuario
 * introduce su jugada y luego el ordenador genera al azar una de las opciones.
 * Si el usuario introduce una opción incorrecta, el programa deberá mostrar un
 * mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio27 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userPlay;
        String[] playOptions = { "piedra", "papel", "tijera" };
        String machinePlay = "";

        do {
            System.out.println("Introduzca piedra, papel o tijeras: ");
            System.out.print("Jugador: ");
            userPlay = s.next();

            if ((userPlay.equals("piedra") || userPlay.equals("papel") || userPlay.equals("tijeras"))) {
                machinePlay = playOptions[getRandomInt(0, 2)];
                System.out.printf("Ordenador: %s\n", machinePlay);
            } else
                System.out.println("Jugada incorrecta.");
        } while (!(userPlay.equals("piedra") || userPlay.equals("papel") || userPlay.equals("tijeras")));
        s.close();

        if (userPlay.equals(machinePlay))
            System.out.print("Empate");
        else {
            switch (userPlay) {
                case "piedra":
                    if (machinePlay.equals("papel"))
                        System.out.print("Gana el ordenador");
                    else
                        System.out.print("Gana el jugador");
                    break;
                case "papel":
                    if (machinePlay.equals("tijeras"))
                        System.out.print("Gana el ordenador");
                    else
                        System.out.print("Gana el jugador");
                    break;
                default:
                    if (machinePlay.equals("piedra"))
                        System.out.print("Gana el ordenador");
                    else
                        System.out.print("Gana el jugador");
            }
        }

    }
}