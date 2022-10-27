/**
 * Este programa muestra 20 números enteros aleatorios entre 0 y 10 (ambos
 * incluidos) separados por espacios.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio4 {
    public static void main(String args[]) {
        int random;
        for (int i = 0; i < 20; i++) {
            random = (int) (Math.random() * 11);
            if (i == 19)
                System.out.printf("%d", random);
            else
                System.out.printf("%d ", random);
        }
    }
}