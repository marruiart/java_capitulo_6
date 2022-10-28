
/**
 * Este programa simula la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio13 {
    public static void main(String[] args) {
        int firstDice = 0;
        int secondDice = 0;
        int roll = 1;

        do {
            firstDice = 1 + (int) (Math.random() * ((6 - 1) + 1));
            secondDice = 1 + (int) (Math.random() * ((6 - 1) + 1));
            System.out.printf("ROLL %d: \n", roll);
            System.out.printf("-----   -----\n");
            System.out.printf("| %d |   | %d |\n", firstDice, secondDice);
            System.out.printf("-----   -----\n\n");
            roll++;
        } while (firstDice != secondDice);
    }
}