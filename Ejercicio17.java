
/**
 * Este programa realiza un programa que pinte por pantalla una pecera con un
 * pececito dentro.
 * Se pide al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio17 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            height = s.nextInt();
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            width = s.nextInt();
            if (height < 4 || width < 4)
                System.out.println("Los valores introducidos son incorrectos. ");
        } while (height < 4 || width < 4);
        s.close();

        int fishPositionX = getRandomInt(2, width - 1);
        int fishPositionY = getRandomInt(2, height - 1);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*");
                else if (i == fishPositionY && j == fishPositionX)
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}