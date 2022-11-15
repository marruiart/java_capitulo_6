
/**
 * Este programa llena la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char)
 * para convertir un entero en un carácter.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio12 {
    public static void main(String[] args) throws InterruptedException {
        int line = 0;
        System.out.print("\033[32m");
        for (int i = 0; i < 10000; i++) {
            System.out.print((char) (32 + (Math.random() * ((126 - 32) + 1))));
            if (line++ == 100) {
                line = 0;
                Thread.sleep(40);
                System.out.println();
            }
        }
    }
}