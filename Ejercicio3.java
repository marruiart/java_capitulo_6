/**
 * Este programa muestra al azar el nombre de una carta de la baraja
 * española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey y as. Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n).
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] cards = { "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey", "As" };
        String[] suits = { "oros", "espadas", "copas", "bastos" };

        String randomCard = cards[(int) (Math.random() * 10)];
        String randomSuit = suits[(int) (Math.random() * 4)];

        System.out.printf("%s de %s", randomCard, randomSuit);
    }
}