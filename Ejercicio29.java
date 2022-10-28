
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

public class Ejercicio29 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int season;
        do {
            System.out.print("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno\nSeleccione la estación del año (1-4): ");
            season = s.nextInt();
            if (season < 1 || season > 4)
                System.out.print("Estación incorrecta. ");
        } while (season < 1 || season > 4);
        s.close();

        String[] seasons = { "Primavera", "Verano", "Otoño", "Invierno" };
        int[] maxLastDecade = { 30, 45, 30, 25 };
        int[] minLastDecade = { 15, 25, 20, 0 };
        int[] sunnyProbLastDecade = { 60, 80, 40, 20 };
        season--;

        int max = getRandomInt(minLastDecade[season], maxLastDecade[season]);
        int min = getRandomInt(minLastDecade[season], max);
        String sunnyOrCloudy = getRandomInt(0, 100) >= sunnyProbLastDecade[season] ? "Nublado" : "Soleado";

        System.out.printf("\n%s - Previsión del tiempo para mañana\n", seasons[season]);
        System.out.println("---------------------------------");
        System.out.printf("Temperatura mínima: %dºC\n", min);
        System.out.printf("Temperatura máxima: %dºC\n", max);
        System.out.printf("%s", sunnyOrCloudy);
    }
}