
/**
 * Este programa pinta un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos
 * caracteres del borde más cuatro caracteres en medio, en total 6 caracteres
 * (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar
 * un carácter a la izquierda o girar un carácter a la derecha, por supuesto de
 * forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del
 * obstáculo es aleatoria dentro de la línea. En caso de existir un obstáculo en
 * un metro de sendero (en una línea), puede ser una planta (carácter *) o una
 * piedra (carácter O), la probabilidad de que salga uno u otro es la misma.
 * Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno
 * o ninguno.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio32 {
    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int pathLength = s.nextInt();
        s.close();

        int min = 11;
        int max = 13;
        int spacesBeforePath = 6;

        for (int i = 1; i <= pathLength; i++) {
            min = spacesBeforePath - 1;
            max = spacesBeforePath + 1;
            for (int j = 0; j < spacesBeforePath; j++)
                System.out.print(" ");
            System.out.print("|");
            int thereIsAnObstacle = getRandomInt(0, 1);
            int obstaclePosition = getRandomInt(0, 3);
            int obstaclesLeft = 1;
            for (int j = 0; j < 4; j++) {
                if (thereIsAnObstacle == 1 && obstaclesLeft == 1 && j == obstaclePosition) {
                    String plantOrRock = getRandomInt(0, 1) == 1 ? "*" : "O";
                    System.out.print(plantOrRock);
                    obstaclesLeft = 0;
                } else
                    System.out.print(" ");
            }
            System.out.println("|");
            spacesBeforePath = getRandomInt(min, max);
        }
    }
}