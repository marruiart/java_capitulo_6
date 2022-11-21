
/**
 * Este programa es capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto
 * en la antepenúltima, etc. Se debe mostrar por pantalla tanto el array
 * original como el array resultado.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio28_Hola {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        /*
         * Ej. para obtener números impares entre 3 y 13 (sacamos números del 0 al 5,
         * multiplicamos por 2 (0 a 10) y sumamos 3 (solo impares))
         * (int) (Math.random() * 5) * 2 + 3;
         */
        int height = (int) (Math.random() * 6) * 2 + 3;
        System.out.print("*    *  ****  *       ****\n");
        for (int i = 1; i < height / 2; i++)
            System.out.print("*    * *    * *      *    *\n");
        System.out.print("****** *    * *      ******\n");
        for (int i = 1; i < height / 2; i++)
            System.out.print("*    * *    * *      *    *\n");
        System.out.print("*    *  ****  ****** *    *\n");
    }
}
