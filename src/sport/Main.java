package sport;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sport> sportPaul = new ArrayList<>(Arrays.asList(new Fussball(), new Hindernislauf()));
        Benutzer paul = new Benutzer("Paul", "Tarta", sportPaul);
        System.out.println(paul.kalkuliereDurchschnittszeit());
        System.out.println(paul.kalkuliereZeit());

        List<Sport> sportMihai = new ArrayList<>(Arrays.asList(new Fussball(), new Hochsprung(), new Basketball()));
        Benutzer mihai = new Benutzer("Mihai", "Pop", sportMihai);
        System.out.println(mihai.kalkuliereDurchschnittszeit());
        System.out.println(mihai.kalkuliereZeit());



    }
}
