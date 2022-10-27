
/**
 * Este programa intenta adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio14 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 0;
        int randomNum;
        int oportunities = 5;
        String answer = "no";

        System.out.print("Piensa en un número entre el 0 y el 100.\n");
        do {
            randomNum = getRandomInt(min, max);
            System.out.printf("\nOportunidades restantes: %d\n", oportunities);
            System.out.printf("Entre el %d y el %d ¿El número es el %d? \nContesta si, mayor o menor: ", min, max,
                    randomNum);
            answer = sc.next();

            switch (answer) {
                case "si":
                    System.out.printf("\n¡GANA LA MÁQUINA!\n", randomNum);
                    oportunities = -1;
                    break;
                case "mayor":
                    min = randomNum;
                    oportunities--;
                    break;
                case "menor":
                    max = randomNum;
                    oportunities--;
                    break;
                default:
                    System.out.print("\nLa respuesta no es correcta. ");
            }
        } while (oportunities > 0 && answer != "si");
        sc.close();

        if (oportunities == 0)
            System.out.printf("\n¡HAS GANADO!\n", randomNum);
    }
}