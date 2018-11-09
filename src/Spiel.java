import java.util.ArrayList;
import java.util.Scanner;

public class Spiel {

    /**
     * Die ArrayList sollen hier Elemente des Typ Karte enthalten.
     */

    ArrayList<Integer> deck1 = new ArrayList<>();
    ArrayList<Integer> deck2 = new ArrayList<>();

    int i;


    /**
     * Die beiden Kartendecks sollen später aus einer beliebigen Anzahl aus Karten bestehen.
     * Die Anzahl soll im Menüpunkt Einstellung verändert werden können.
     */

    public void decksErstellen() {

        for (i = 0; i <= 10; i++) {
            deck1.add(i);
            deck2.add(i);
        }
    }

    public void spielen() {

        i = 1;
        String s = "j";

        /**
         * Die Schleife soll auch unterbrochen werden, wenn es keine Karten mehr gibt.
         */

        while (s.equals("j")) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Karten ausspielen (j/n)");
            s = scan.next();

            if (s.equals("j")) {
                System.out.println(i + ".Runde");
                i++;

                /**
                 * Für den Spieler wird die Karte durch die Bilderfassung bestimmt.
                 * Die Wahrscheinlichkeit für das zufällige Listenelement muss, auf die größe der Liste angepasst werden.
                 */

                int karte1 = (int)(Math.random()*10);
                int karte2 = (int)(Math.random()*10);


                /**
                 * Nachdem Ausspielen der Karten sollen die Elemente gelöscht werden.
                 * Hier sollen zusätzlich die erspielten Punkte festgehalten werden.
                 * Karten Wert und Farbe sollen hier verglichen werden.
                 */

                if (deck1.get(karte1) > deck2.get(karte2)) {
                    System.out.println(karte1 + ">" + karte2);
                    System.out.println("Spieler1 gewinnt diese Runde!");

                }if (deck1.get(karte1)  < deck2.get(karte2)) {
                    System.out.println(karte1 + "<" + karte2);
                    System.out.println("Spieler2 gewinnt diese Runde!");

                } if (deck1.get(karte1) == deck2.get(karte2)){
                    System.out.println(karte1 + "=" + karte2);
                    System.out.println("unentschieden");
                }

            } else {
                System.exit(0);
            }
        }
    }
}
