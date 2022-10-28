
/**
 * Este programa, dado un número introducido por teclado, elige al azar
 * uno de sus dígitos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio24 {

    public static int getNumLength(long num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num;
        int chosenDigit = 0;

        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = s.nextInt();
            if (num < 0)
                System.out.println("El número no puede ser negativo. ");
        } while (num < 0);
        s.close();

        int numLength = getNumLength(num);
        int randomNum = getRandomInt(1, numLength);

        for (int i = 0; i < randomNum; i++) {
            chosenDigit = (int) num % 10;
            num /= 10;
        }

        System.out.printf("%d", chosenDigit);

    }
}