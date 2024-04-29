
package kivipaperisakset;


import java.util.Random;

/**
 * Pelaaja-olion luominen.
 * @author Ira Dook, muokannut Nuutti Turunen
 */
public class Pelaaja {

    private int voitot;      // Voittojen lukumäärä
    private String valinta;


    /**
     * @param asetettuValinta palauttaa halutun asetettavan liikkeen.
     */
    public void setValinta(String asetettuValinta){
        valinta=asetettuValinta;
    }

    /**
     * Hakee pelaajan valitseman liikkeen.
     *
     * @return Palauttaa tämän liikkeen.
     */
    public String getValinta(){
        return valinta;
    }

    /**
     * Valitsee pelaajan liikkeen sattumanvaraisesti.
     *
     * @return palauttaa valittuun liikkeen.
     */
    public String pelaajanValinta() {
        Random random = new Random();
        int c = random.nextInt(3);  //
        valinta = switch (c) {
            case 0 -> ("kivi");
            case 1 -> ("paperi");
            case 2 -> ("sakset");
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
        return valinta;
    }

    /**
     * Asettaa voittojen määrän pelaajalle.
     *
     * @param voitot voittojen lukumäärä.
     */
    public void setVoitot(int voitot) {
        this.voitot = voitot;
    }

    /**
     * Hakee pelaajan voittojen määrän.
     * @return palauttaa tämän määrän.
     */
    public int getVoitot() {
        return (voitot);
    }
}
