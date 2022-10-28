/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
 * 8. Este programa programa genera de forma aleatoria la tirada de cinco dados.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio23 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }
    public static void main(String[] args) {
        String[] diceFaces = { "As", "K", "Q", "J", "7", "8" };

        String dice;

        for (int i = 1; i <= 5; i++) {
            dice = diceFaces[getRandomInt(0, 5)];
            System.out.printf("------\n");
            System.out.printf("| %2s |\n", dice);
            System.out.printf("------\n\n");
        }

    }
}