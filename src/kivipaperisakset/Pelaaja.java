
package kivipaperisakset;


/**
 *
 * @author Ira Dook, modified by Nuutti Turunen
 */
public class Pelaaja {

    private int voitot;      // Voittojen lukumäärä
    private String valinta;
    /**
     * Valitse randomilla kivi, paperi tai sakset
     */
    public String pelaajanValinta() {
        int c = (int) (Math.random() * 3);   // Arpoo luvun välillä 0 - 3
        valinta = switch (c) {
            case 0 -> ("kivi");
            case 1 -> ("paperi");
            case 2 -> ("sakset");
            default -> valinta;
        };
        return valinta;
    }

    public void setVoitot(int voitot) {
        this.voitot = voitot;
    }

    public int getVoitot() {
        return (voitot);
    }
}
