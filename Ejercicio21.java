
/**
 * Este programa genera una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio21 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        String[] coins = { "1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos",
                "1 euro", "2 euros" };
        String[] positions = { "cara", "cruz" };
        String randomCoin;
        String randomPosition;

        for (int i = 0; i < 5; i++) {
            randomCoin = coins[getRandomInt(0, 5)];
            randomPosition = positions[getRandomInt(0, 1)];
            System.out.printf("%s - %s\n", randomCoin, randomPosition);
        }
    }
}