
/**
 * Este programa pinta por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio20 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int volume;
        String emptyCube = "*    *\n";
        String fullCube = "*====*\n";
        String bottomCube = "******\n";

        do {
            System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
            volume = s.nextInt();

            if (volume < 1)
                System.out.println("La capacidad debe ser superior o igual a 1. ");
        } while (volume < 1);
        s.close();

        int waterVolume = getRandomInt(0, volume);

        for (int i = volume; i >= 0; i--) {
            if (i == 0)
                System.out.print(bottomCube);
            else if (i > waterVolume)
                System.out.print(emptyCube);
            else
                System.out.print(fullCube);
        }

        System.out.printf("La cuba tiene una capacidad de %d litro/s y contiene %d litro/s de agua.", volume,
                waterVolume);

    }
}