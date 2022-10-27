/**
 * Este programa muestra tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas). La probabilidad de que
 * salga un 1 es de 1/2, la probabilidad de que salga x es de 1/3 y la
 * probabilidad de que salga 2 es de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] posibilities = { "1    ", "1    ", "1    ", "  X  ", "  X  ", "    2" };
        String[] plenoAl15 = { " 0   ", "  1  ", "   2 ", "    M" };
        String column;
        int randomPosibility;
        int goals;
        String local;
        String visitor;

        System.out.printf("%11s%s\n", " ", "           P R O N Ó S T I C O S");
        System.out.printf("%s\n", "---------------------------------------------");
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%16s%2d. |", " ", i);
            for (int j = 0; j < 3; j++) {
                randomPosibility = (int) (Math.random() * 6);
                column = posibilities[randomPosibility];
                System.out.printf(" %s |", column);
            }
            System.out.println();
        }
        System.out.printf("%s\n", "---------------------------------------------");

        goals = (int) (Math.random() * 4);
        local = plenoAl15[goals];
        goals = (int) (Math.random() * 4);
        visitor = plenoAl15[goals];
        System.out.printf("PLENO AL 15: local...%s  visitante...%s", local, visitor);
    }
}
