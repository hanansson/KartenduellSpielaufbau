import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Möchtest du ein Spiel starten? (j/n)");
        String s = scan.next();

        if (s.equals("j")) {
            Spiel spiel = new Spiel();
            spiel.decksErstellen();
            spiel.spielen();
        } else {
            System.exit(0);
        }

    }
}
