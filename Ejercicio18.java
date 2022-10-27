/**
 * Este programa que genera de forma aleatoria una secuencia de tres colores
 * aleatorios de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio18 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        String[] colours = { "rojo", "azul", "verde", "amarillo", "violeta", "naranja" };
        int room1 = 0;
        int room2 = 0;
        int room3 = 0;

        do {
            room1 = getRandomInt(0, 5);
            room2 = getRandomInt(0, 5);
            room3 = getRandomInt(0, 5);
        } while (room1 == room2 || room1 == room3 || room2 == room3);

        System.out.printf("El dormitorio 1 se pintará de %s, el dormitorio 2 de %s y el dormitorio 3 de %s.",
                colours[room1], colours[room2], colours[room3]);
    }
}