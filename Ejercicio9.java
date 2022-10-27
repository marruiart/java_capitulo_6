
/**
 * Este programa va generando números aleatorios pares entre 0
 * y 100 y no termina de generar números hasta que no saque el 24. El
 * programa dirá al final cuántos números se han generado.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio9 {
    public static void main(String[] args) {
        int count = 0;
        int randomEvenNum = 0;

        while (randomEvenNum != 24) {
            randomEvenNum = (int) (Math.random() * 101);
            if (randomEvenNum % 2 == 0) {
                System.out.printf("%d  ", randomEvenNum);
                count++;
            }
        }
        System.out.printf("\nSe han generado %d números pares aleatorios hasta que ha salido el número 24.\n", count);
    }
}