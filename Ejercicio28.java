
/**
 * Este programa es capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto
 * en la antepenúltima, etc. Se debe mostrar por pantalla tanto el array
 * original como el array resultado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio28 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.print("Introduzca el tamaño del array: ");
            arrayLength = s.nextInt();
            if (arrayLength < 3)
                System.out.println("Tamaño incorrecto.");
        } while (arrayLength < 3);
        s.close();

        int[] randomArray = new int[arrayLength];
        int[] orderedRandomArray = new int[arrayLength];
        int j = 0;

        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = getRandomInt(0, 200);
            if (i % 2 != 0) {
                orderedRandomArray[arrayLength - 1 - j] = randomArray[i];
                j++;
            } else
                orderedRandomArray[j] = randomArray[i];
        }

        for (int i = 0; i <= 6; i++) {
            switch (i) {
                case 0:
                    System.out.print("\n\nArray original:\n");
                    break;
                case 4:
                    System.out.print("Array resultado:\n");
                    break;
                case 1:
                case 5:
                    System.out.printf("%s   ", "Índice");
                    for (j = 0; j < arrayLength; j++)
                        System.out.printf("%5d", j);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Valor    ");
                    for (j = 0; j < arrayLength; j++)
                        System.out.printf("%5d", randomArray[j]);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Valor    ");
                    for (j = 0; j < arrayLength; j++)
                        System.out.printf("%5d", orderedRandomArray[j]);
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
    }
}
