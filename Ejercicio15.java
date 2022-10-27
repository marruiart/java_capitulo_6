/**
 * Este programa es un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se
 * marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * 
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio15 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        String[] musicalNotes = { "do", "re", "mi", "fa", "sol", "la", "si" };
        String randomMusicalNote;
        String lastMusicalNote = "";
        int melodyNotes = 0;
        int minMelody = 4;
        int maxMelody = 28;
        int minMusicalNote = 0;
        int maxMusicalNote = musicalNotes.length - 1;
        int compass = 0;

        do {
            melodyNotes = getRandomInt(minMelody, maxMelody);
        } while (melodyNotes % 4 != 0);

        for (int i = 0; i < melodyNotes - 1; i++) {
            if (compass == 4) {
                System.out.print("| ");
                compass = 0;
            }
            randomMusicalNote = musicalNotes[getRandomInt(minMusicalNote, maxMusicalNote)];
            if (i == 0)
                lastMusicalNote = randomMusicalNote;
            System.out.print(randomMusicalNote + " ");
            compass++;
        }
        System.out.print(lastMusicalNote + " ||");

    }
}