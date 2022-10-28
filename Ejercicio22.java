
/**
 * Este programa pinta por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio22 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int snakeLength = s.nextInt();
        s.close();

        String snakeHead = "            @";
        int min = 11;
        int max = 13;

        System.out.println(snakeHead);
        for (int i = 1; i < snakeLength; i++) {
            int spacesBeforeBody = getRandomInt(min, max);
            min = spacesBeforeBody - 1;
            max = spacesBeforeBody + 1;
            for (int j = 0; j < spacesBeforeBody; j++)
                System.out.print(" ");
            System.out.println("*");
        }
    }
}