import java.util.ArrayList;
import java.util.Scanner;

public class Spiel {

    ArrayList<Karte> deck1 = new ArrayList<>();
    ArrayList<Karte> deck2 = new ArrayList<>();

    int punkte1 = 0;
    int punkte2 = 0;

    int i;
    int j;


    public void decksErstellen() {

        for (j = 0; j <= 4; j++) {
            for (i = 2; i <= 13; i++) {

                Karte karte = new Karte();
                karte.farbe = j;
                karte.wert = i;
                deck1.add(karte);
                deck2.add(karte);
            }
        }
    }

    public void spielen() {

        i = 1;
        int k = deck1.size();
        String s = "j";

        while (s.equals("j") && deck1.size() != 0) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Karten ausspielen (j/n)");
            s = scan.next();

            if (s.equals("j")) {
                System.out.println(i + ".Runde");
                i++;

                int karte1 = (int)(Math.random()*k);
                int karte2 = (int)(Math.random()*k);


                if (deck1.get(karte1).wert > deck2.get(karte2).wert) {
                    System.out.println(deck1.get(karte1).wert + ">" + deck2.get(karte2).wert);
                    System.out.println("Spieler1 gewinnt diese Runde!");

                    punkte1 ++;

                }if (deck1.get(karte1).wert < deck2.get(karte2).wert) {
                    System.out.println(deck1.get(karte1) + "<" + deck2.get(karte2));
                    System.out.println("Spieler2 gewinnt diese Runde!");

                    punkte2 ++;

                } if (deck1.get(karte1).wert == deck2.get(karte2).wert){
                    System.out.println(deck1.get(karte1) + "=" + deck2.get(karte2));
                    System.out.println("unentschieden");
                }

                k --;

                deck1.remove(karte1);
                deck2.remove(karte2);

            } else {

                System.exit(0);
            }
        }

        if(punkte1 > punkte2){
            System.out.println("Spieler1 hat mit " + punkte1 + "Pärchen gewonnen.");
        }if (punkte1 < punkte2){
            System.out.println("Spieler2 hat mit" + punkte2 + "Pärchen gewonnen.");
        }if(punkte1 == punkte2 && punkte1 != 0 && punkte2 != 0){
            System.out.println("Das Spiel ist mit Punktegleichstand beendet worden.");
        }else {

        }
    }
}
