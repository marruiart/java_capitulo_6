/**
 * Este programa pinta por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 * uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio10 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        String[] characters = { "*", "-", "=", ".", "|", "@" };
        String randomChar;
        int randomLength;

        for (int i = 0; i < 10; i++) {
            randomChar = characters[getRandomInt(0, 5)];
            randomLength = getRandomInt(1, 40);
            for (int j = 0; j < randomLength; j++)
                System.out.print(randomChar);
            System.out.println();
        }
    }
}