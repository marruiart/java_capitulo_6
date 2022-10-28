/**
 * Este programa muestra por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio25 {
    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static boolean isPrime(int num) {
        boolean primeNum = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                primeNum = false;
        }
        return primeNum;
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 200;
        int randomNum;

        for (int i = 0; i < 100; i++) {
            randomNum = getRandomInt(min, max);
            if (randomNum % 5 == 0)
                System.out.printf("[%d] ", randomNum);
            else if (isPrime(randomNum))
                System.out.printf("#%d# ", randomNum);
            else
                System.out.printf("%d ", randomNum);
        }
    }
}