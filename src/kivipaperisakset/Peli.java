package kivipaperisakset;

/**
 * Pelin luominen tapahtuu tässä luokassa.
 * @author Ira Dook, muokannut Nuutti Turunen
 */
public class Peli {
    private int pelatutPelit = 0;           // Pelattujen pelien lkm
    private int p1Voitot = 0;       // Pelaaja 1:n voittojen lkm
    private int p2Voitot = 0;       // Pelaaja 2:n voittojen lkm
    private int tasapelit = 0;              // Tasapelien lkm
    private final int maxVoitot = 3;     // maksimivoittojen lukumäärä


    private String p1Valinta;
    private String p2Valinta;
    private String tulos;
    private final Pelaaja p1;
    private final Pelaaja p2;

    private boolean peliJatkuu = true;
    /**
     * Alustaa pelin kahdella pelaajalla.
     */
    public Peli() {
        p1 = new Pelaaja();    // Pelaajaoliot
        p2 = new Pelaaja();
    }

    /**
     * Pelin tilanne.
     *
     * @return palauttaa nykyisen erän tuloksen.
     */
    public String getTulos(){
        return tulos;
    }

    /**
     * Tarkastaa onko peli vielä käynnissä.
     *
     * @return palauttaa kyllä jos on, ei jos peli on loppunut.
     */
    public boolean getPeliJatkuu(){
        return peliJatkuu;
    }


    /**
     * Määrittää nykyisen kierroksen voittajan pelaajien valintojen perusteella.
     *
     * @param valinta1 pelaajan 1 valinta.
     * @param valinta2 pelaajan 2 valinta.
     * @return palauttaa erän tuloksen.
     */
    public String tarkastaTulos (String valinta1, String valinta2){
        if ((valinta1.equals("kivi") && valinta2.equals("paperi")) ||
                (valinta1.equals("paperi") && valinta2.equals("sakset")) ||
                (valinta1.equals("sakset") && valinta2.equals("kivi"))) {
            p2Voitot++;
            p2.setVoitot(p2Voitot);
            tulos = "Pelaaja 2 voittaa";
        } else if ((valinta1.equals("kivi") && valinta2.equals("sakset")) ||
                (valinta1.equals("paperi") && valinta2.equals("kivi")) ||
                (valinta1.equals("sakset") && valinta2.equals("paperi"))) {
            p1Voitot++;
            p1.setVoitot(p1Voitot);
            tulos = "Pelaaja 1 voittaa";
        } else {
            tasapelit++;
            tulos = "Tasapeli";
        }
        return tulos;
    }

    /**
     * Tarkastaa tuleeko pelin jatkua.
     *
     * @param voitot1 pelaajan 1 voitot.
     * @param voitot2 pelaajan 2 voitot.
     * @return Palauttaa true, jos pelin tulee jatkua. Muuten false.
     */
    public boolean jatketaankoPelia(int voitot1, int voitot2){
        peliJatkuu = voitot1 < maxVoitot && voitot2 < maxVoitot;
        return peliJatkuu;
    }


    /**
     * Aloittaa pelin ja jatkaa sitä, kunnes jompikumpi pelaajista saavuttaa kolme voittoa.
     */
    public void aloitaPeli(){
        // Aloittaa pelin. Peli jatkuu niin kauan, kunnes jompikumpi pelaajista on saanut kolme voittoa.
        while (peliJatkuu) {
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

            p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");

            p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");

            // Tarkastetaan, pitääkö jatkaa
            tarkastaTulos(p1Valinta, p2Valinta);
            System.out.println(tulos);

            pelatutPelit++;

            // Tarkastetaan, jatketaanko peliä.
            jatketaankoPelia(p1Voitot, p2Voitot);
            System.out.println(peliJatkuu);
        }
            System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            if(p1.getVoitot()>p2.getVoitot()){
                System.out.println("Voittaja : Pelaaja 1");
            } else
                System.out.println("Voittaja : Pelaaja 2");
        }
    }
