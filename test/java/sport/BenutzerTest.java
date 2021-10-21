package sport;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void tests(){
        List<Sport> sportPaul = new ArrayList<>(Arrays.asList(new Fussball(), new Hindernislauf()));
        Benutzer paul = new Benutzer("Paul", "Tarta", sportPaul);
        assertEquals(paul.kalkuliereDurchschnittszeit(), 47.5);
        assertEquals(paul.kalkuliereZeit(), 95);

        List<Sport> sportMihai = new ArrayList<>(Arrays.asList(new Fussball(), new Hochsprung(), new Basketball()));
        Benutzer mihai = new Benutzer("Paul", "Tarta", sportMihai);
        assertEquals(mihai.kalkuliereDurchschnittszeit(), 46.666666666666664);
        assertEquals(mihai.kalkuliereZeit(), 140);
    }
}