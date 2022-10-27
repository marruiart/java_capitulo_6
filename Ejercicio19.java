
/**
 * Este programa muestra 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio19 {
    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        int min = -100;
        int max = 200;
        int maxEven = -100;
        int minOdd = 199;
        float average;
        int sum = 0;
        int randomNum;

        for (int i = 0; i < 50; i++) {
            randomNum = getRandomInt(min, max);
            if (randomNum % 2 == 0 && randomNum > maxEven)
                maxEven = randomNum;
            else if (randomNum % 2 != 0 && randomNum < minOdd)
                minOdd = randomNum;
            System.out.printf("%d ", randomNum);
            sum += randomNum;
        }
        average = (float) sum / 50;
        System.out.printf(
                "\nLa media de los 50 números es %.2f\nEl número par máximo es %d\nEl número impar mínimo es %d",
                average, maxEven, minOdd);
    }
}