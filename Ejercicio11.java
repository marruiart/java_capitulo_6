
/**
 * Este programa muestra 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio11 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        String[] grades = { "Suspenso", "Suficiente", "Bien", "Notable", "Sobresaliente" };
        String randomGrade;

        for (int i = 1; i <= 20; i++) {
            randomGrade = grades[getRandomInt(0, 4)];
            System.out.printf("%d. %s\n", i, randomGrade);
            switch (randomGrade) {
                case "Suspenso":
                    suspenso++;
                    break;
                case "Suficiente":
                    suficiente++;
                    break;
                case "Bien":
                    bien++;
                    break;
                case "Notable":
                    notable++;
                    break;
                default:
                    sobresaliente++;
                    break;
            }
        }
        System.out.printf("\nSuspensos: %d\nSuficiente: %d\nBien: %d\nNotable: %d\nSobresaliente: %d\n", suspenso,
                suficiente, bien, notable, sobresaliente);
    }
}