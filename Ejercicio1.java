/**
 * Este programa muestra la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio1 {
    public static void main(String[] args) {
        int randomNum;
        int sum = 0;
        int min = 1;
        int max = 6;

        for (int dice = 1; dice <= 3; dice++) {
            randomNum = min + (int) (Math.random() * ((max - min) + 1));
            sum += randomNum;
            System.out.printf("Dado %d: %d\n", dice, randomNum);
        }
        System.out.printf("La suma de los tres dados es %d", sum);
    }
}