
/**
 * Este programa pinta una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El
 * bocado se da alrededor del turrón, obviamente no se puede dar un bocado por
 * en medio de la tableta.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio26 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.print("Introduzca la altura de la tableta: ");
            height = s.nextInt();
            System.out.print("Introduzca la anchura de la tableta: ");
            width = s.nextInt();
            if (height < 1 || width < 1)
                System.out.println("Los valores introducidos son incorrectos. ");
        } while (height < 1 || width < 1);
        s.close();

        int bitePositionX;
        int bitePositionY = getRandomInt(1, height);
        if (bitePositionY == 1 || bitePositionY == height)
            bitePositionX = getRandomInt(1, width);
        else
            bitePositionX = getRandomInt(1, 2) == 1 ? 1 : width;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == bitePositionY && j == bitePositionX)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}