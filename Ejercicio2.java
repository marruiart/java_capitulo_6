/**
 * Este programa muestra al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n).
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "As" };
        String[] suits = { "picas", "corazones", "diamantes", "tréboles" };

        String randomCard = cards[(int) (Math.random() * 13)];
        String randomSuit = suits[(int) (Math.random() * 4)];

        System.out.printf("%s de %s", randomCard, randomSuit);
    }
}