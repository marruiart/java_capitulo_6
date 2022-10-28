
/**
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Este programa pinta por pantalla la pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias.
 * Por una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el ancho y el alto de la
 * pecera, que como mínimo serán de 4 unidades.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio30 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height;
        int width;
        int fishPositionX;
        int fishPositionY;
        int seahorsePositionX;
        int seahorsePositionY;
        int conchPositionX;
        int conchPositionY;

        do {
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            height = s.nextInt();
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            width = s.nextInt();
            if (height < 4 || width < 4)
                System.out.println("Los valores introducidos son incorrectos. ");
        } while (height < 4 || width < 4);
        s.close();

        fishPositionX = getRandomInt(2, width - 1);
        fishPositionY = getRandomInt(2, height - 1);

        do {
            seahorsePositionX = getRandomInt(2, width - 1);
            seahorsePositionY = getRandomInt(2, height - 1);
        } while (seahorsePositionX == fishPositionX && seahorsePositionY == fishPositionY);

        do {
            conchPositionX = getRandomInt(2, width - 1);
            conchPositionY = getRandomInt(2, height - 1);
        } while ((seahorsePositionX == fishPositionX && seahorsePositionY == fishPositionY)
                || (conchPositionX == seahorsePositionX && conchPositionY == seahorsePositionY));

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*");
                else if (i == fishPositionY && j == fishPositionX)
                    System.out.print("&");
                else if (i == seahorsePositionY && j == seahorsePositionX)
                    System.out.print("$");
                else if (i == conchPositionY && j == conchPositionX)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}