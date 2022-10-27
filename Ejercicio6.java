
/**
 * Este programa piensa un número al azar entre 0 y 100. El usuario debe
 * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio6 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 0;
        int randomNum = getRandomInt(min, max);
        int oportunities = 5;
        int num;
        String prompt = "Introduce un número";
        do {
            System.out.printf("Oportunidades restantes: %d\n", oportunities);
            System.out.printf("%s entre %d y %d: ", prompt, min, max);
            num = sc.nextInt();
            System.out.println();

            if (num < randomNum && num >= 0) {
                prompt = "El número es mayor. Introduce un número";
                min = num;
            } else if (num > 0) {
                prompt = "El número es menor. Introduce un número";
                max = num;
            }

            if (num >= 0)
                oportunities--;
            else
                System.out.println("No se puede introducir un número negativo. ");
        } while (randomNum != num && oportunities > 0 || num < 0);
        sc.close();
        if (randomNum != num)
            System.out.printf("¡Ooooh! El número correcto era %d\n", randomNum);
        else
            System.out.printf("¡HAS ACERTADO! El número es %d\n", randomNum);
    }
}