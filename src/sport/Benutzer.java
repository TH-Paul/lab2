package sport;

import java.util.List;


public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     *
     * @return die totale Zeit fur die Sportarten aus der Liste des Benutzers
     */
    public double kalkuliereZeit(){
        double gesamteZeit = 0;
        for(Sport s : sport){
            gesamteZeit += s.kalkuliereZeit();
        }

        return gesamteZeit;
    }

    /**
     *
     * @param s - die Sportart
     * @return die Zeit fur die gegebene Sportart
     */
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }

    /**
     *
     * @return die Durchschnittszeit fur die Sportarten aus der Liste des Benutzers
     */
    public double kalkuliereDurchschnittszeit(){
        return this.kalkuliereZeit()/sport.size();
    }
}
