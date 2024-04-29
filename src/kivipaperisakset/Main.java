package kivipaperisakset;

/**
 * Main-luokka. Koodi käynnistetään täältä.
*@author Nuutti Turunen
*
 */
public class Main {
    /**
     * Päämetodi pelin aloittamiseksi.
     * @param args komentolinjan argumentit, ei käytössä.
     */
    public static void main(String[] args) {
      Peli peli = new Peli();
      peli.aloitaPeli();
    }
}
