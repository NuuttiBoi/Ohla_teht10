package kivipaperisakset;

/**
 *
 * @author Ira Dook, modified by Nuutti Turunen
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

    boolean peliJatkuu = true;
    /*
    * Peli-luokan konstruktori.
     */
    public Peli() {
        p1 = new Pelaaja();    // Pelaajaoliot
        p2 = new Pelaaja();
    }

    public Pelaaja getP1(){
        return p1;
    }
    public Pelaaja getP2(){
        return p2;
    }
    public String getTulos(){
        return tulos;
    }

    public int getP1Voitot(){
        return p1Voitot;
    }

    public int getP2Voitot(){
        return p2Voitot;
    }


    /*
    * Pelin käynnistys.
     */
    public void aloitaPeli(){
        // Aloittaa pelin. Peli jatkuu niin kauan, kunnes jompikumpi pelaajista on saanut kolme voittoa.
            while(peliJatkuu) {

                System.out.println("Erä: "
                        + (pelatutPelit++) + " =====================\n");
                System.out.println("Tasapelien lukumäärä: "
                        + tasapelit + "\n");
                p1Valinta = p1.pelaajanValinta();
                System.out.println("Pelaaja 1: " + p1Valinta
                        + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");
                p2Valinta = p2.pelaajanValinta();
                System.out.println("Pelaaja 2: " + p2Valinta
                        + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");


                if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("paperi"))) {
                    tulos=("Pelaaja 2 voittaa");
                    System.out.println(tulos);
                    p2Voitot++;  // Kokeile eri tapoja saada lukumäärän laskenta kuntoon
                    p2.setVoitot(p2Voitot);


                } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("kivi"))) {
                    p1Voitot++;
                    p1.setVoitot(p1Voitot);
                    tulos=("Pelaaja 1 voittaa");
                    System.out.println(tulos);


                } else if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("sakset"))) {
                    p1Voitot++;
                    p1.setVoitot(p1Voitot);
                    tulos=("Pelaaja 1 voittaa");
                    System.out.println(tulos);

                } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("kivi"))) {
                    p2Voitot++;
                    p2.setVoitot(p2Voitot);
                    tulos=("Pelaaja 2 voittaa");
                    System.out.println(tulos);

                } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("paperi"))) {
                    p1Voitot++;
                    p1.setVoitot(p1Voitot);
                    tulos=("Pelaaja 1 voittaa");
                    System.out.println(tulos);

                } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("sakset"))) {
                    p2Voitot++;
                    p2.setVoitot(p2Voitot);
                    tulos=("Pelaaja 2 voittaa");
                    System.out.println(tulos);

                }
                if (p1Valinta.equals(p2Valinta)) {
                    tasapelit++;
                    System.out.println("\n\t\t\t Tasapeli \n");
                }
                // Tarkastetaan, jatketaanko peliä.
                if(p1.getVoitot() >= maxVoitot || p2.getVoitot() >= maxVoitot){
                    peliJatkuu=false;

                }
                pelatutPelit++;
            }
            System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            if(p1.getVoitot()>p2.getVoitot()){
                System.out.println("Voittaja : Pelaaja 1");
            } else
                System.out.println("Voittaja : Pelaaja 2");
        }
    }
