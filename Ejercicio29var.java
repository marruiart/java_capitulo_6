
/**
 * Este programa muestra la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. Obviamente, la temperatura mínima deberá
 * ser menor o igual que la temperatura máxima.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio29var {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int season;
        int tmin = 0;
        int tmax = 0;
        String seasonStr = "";
        String sunnyOrCloudy;

        do {
            System.out.print("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno\nSeleccione la estación del año (1-4): ");
            season = s.nextInt();
            if (season < 1 || season > 4)
                System.out.print("Estación incorrecta. ");
        } while (season < 1 || season > 4);
        s.close();

        seasonStr = switch (season) {
            case 1 -> "Primavera";
            case 2 -> "Verano";
            case 3 -> "Otoño";
            default -> "Invierno";
        };

        double r = Math.random();
        switch (season) {
            case 1:
                tmin = (int) (Math.random() * 16) + 15;
                tmax = (int) (Math.random() * 16) + 15;
                sunnyOrCloudy = (r <= 0.6) ? "Soleado" : "Nublado";
                break;
            case 2:
                tmin = (int) (Math.random() * 26) + 20;
                tmax = (int) (Math.random() * 26) + 20;
                sunnyOrCloudy = (r <= 0.8) ? "Soleado" : "Nublado";
                break;
            case 3:
                tmin = (int) (Math.random() * 11) + 20;
                tmax = (int) (Math.random() * 11) + 20;
                sunnyOrCloudy = (r <= 0.4) ? "Soleado" : "Nublado";
                break;
            default:
                tmin = (int) (Math.random() * 11) + 20;
                tmax = (int) (Math.random() * 11) + 20;
                sunnyOrCloudy = (r <= 0.2) ? "Soleado" : "Nublado";
        }

        if (tmin > tmax) {
            int tmp = tmin;
            tmin = tmax;
            tmax = tmp;
        }

        System.out.printf("\n%s - Previsión del tiempo para mañana\n", seasonStr);
        System.out.println("---------------------------------");
        System.out.printf("Temperatura mínima: %dºC\n", tmin);
        System.out.printf("Temperatura máxima: %dºC\n", tmax);
        System.out.printf("%s", sunnyOrCloudy);
    }
}