/**
 * Este programa es un simulador de máquina tragaperras simplificada que cumpla
 * los siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje
 * “Bien, ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio16 {

    public static int getRandomInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    public static void main(String[] args) {
        String[] figures = { "corazón", "diamante", "herradura", "campana", "limón" };
        int figure1 = getRandomInt(0, 4);
        int figure2 = getRandomInt(0, 4);
        int figure3 = getRandomInt(0, 4);

        System.out.printf("| %10s | %10s | %10s |\n", figures[figure1], figures[figure2], figures[figure3]);

        if (figure1 == figure2 && figure1 == figure3)
            System.out.print("Enhorabuena, ha ganado 10 monedas");
        else if (figure1 != figure2 && figure2 != figure3 && figure1 != figure3)
            System.out.print("Lo siento, ha perdido");
        else
            System.out.print("Bien, ha recuperado su moneda");
    }
}