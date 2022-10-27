/**
 * Este programa muestra 50 números enteros aleatorios entre 100 y 199 (ambos
 * incluidos) separados por espacios. Muestra también el máximo, el mínimo y la
 * media de esos números.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio5 {

    public static int getRandomInt(int max, int min) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String args[]) {
        int max = 199;
        int min = 100;
        int maxRandom = 100;
        int minRandom = 199;

        for (int i = 0; i < 50; i++) {
            int randomNum = getRandomInt(max, min);
            if (i == 49)
                System.out.printf("%d", randomNum);
            else
                System.out.printf("%d ", randomNum);
            if (randomNum > maxRandom)
                maxRandom = randomNum;
            if (randomNum < minRandom)
                minRandom = randomNum;
        }

        float average = (float) (maxRandom + minRandom) / 2;
        System.out.printf("\nMáximo: %d", maxRandom);
        System.out.printf("\nMínimo: %d", minRandom);
        System.out.printf("\nMedia: %.2f", average);
    }
}