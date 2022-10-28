
/**
 * Este programa realiza el juego del “Craps”. Las reglas son las siguientes: Al
 * comenzar la partida, el jugador introduce la cantidad de dinero que quiere
 * apostar. Se muestra la tirada aleatoria de dos dados. Si entre los dos dados
 * suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la
 * partida. Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si
 * entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y
 * termina la partida. Si no se da ninguno de los casos anteriores, es decir si
 * sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa,
 * el jugador buscará volver a obtener ese número en los dados. Si consigue
 * repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, tiene
 * que seguir tirando.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio31 {

    public static void printRollDices(int firstDice, int secondDice) {
        System.out.printf("-----   -----\n");
        System.out.printf("| %d |   | %d |\n", firstDice, secondDice);
        System.out.printf("-----   -----\n");
    }

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int betAmount;
        do {
            System.out.print("Introduzca la cantidad de dinero que quiere apostar (euros): ");
            betAmount = s.nextInt();
            if (betAmount < 0)
                System.out.print("Apuesta incorrecta");
        } while (betAmount < 1);
        s.close();

        int firstDice = getRandomInt(1, 6);
        int secondDice = getRandomInt(1, 6);
        int sumDices = firstDice + secondDice;
        printRollDices(firstDice, secondDice);
        int playCount = 1;
        System.out.printf("Partida nº %d - suma de los dados: %d\n\n", playCount, sumDices);

        switch (sumDices) {
            case 7:
            case 11:
                System.out.printf("¡ENHORABUENA! Ha ganado %d euros.", betAmount * 2);
                break;
            case 2:
            case 3:
            case 12:
                System.out.printf("Lo siento, ha perdido la partida y pierde los %d euros.", betAmount);
                break;
            default:
                int tmp = sumDices;
                System.out.println("\nSEGUNDA ETAPA...\n");
                do {
                    firstDice = getRandomInt(1, 6);
                    secondDice = getRandomInt(1, 6);
                    sumDices = firstDice + secondDice;
                    printRollDices(firstDice, secondDice);
                    playCount++;
                    System.out.printf("Partida nº %d - suma de los dados: %d\n\n", playCount, sumDices);
                } while (sumDices != 7 && sumDices != tmp);
                if (sumDices == 7)
                    System.out.printf("Lo siento, ha perdido la partida y pierde los %d euros.", betAmount);
                else {
                    System.out.printf("¡ENHORABUENA! Ha ganado %d euros.", betAmount * 2);
                }
        }

    }
}