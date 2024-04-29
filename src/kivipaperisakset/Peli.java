package kivipaperisakset;

/**
 *
 * @author Ira Dook
 */
public class Peli {
    int pelatutPelit = 0;           // Pelattujen pelien lkm
    int p1Voitot = 0;       // Pelaaja 1:n voittojen lkm
    int p2Voitot = 0;       // Pelaaja 2:n voittojen lkm
    int tasapelit = 0;              // Tasapelien lkm

    int maxVoitot = 3;     // maksimivoittojen lukumäärä

    String p1Valinta;
    String p2Valinta;
    String tulos;
    Pelaaja p1 = new Pelaaja();    // Pelaajaoliot
    Pelaaja p2 = new Pelaaja();
    boolean peliJatkuu = true;
    public Peli() {



    }

        public void aloitaPeli(){
        // Aloittaa pelin. Peli jatkuu niin kauan, kunnes jompikumpi pelaajista on saanut kolme voittoa.
            while((p1.getVoitot() < maxVoitot)&&(p2.getVoitot() < maxVoitot)) {

                System.out.println("Erä: "
                        + (pelatutPelit + 1) + " =====================\n");
                System.out.println("Tasapelien lukumäärä: "
                        + tasapelit + "\n");
                p1Valinta = p1.pelaajanValinta();
                System.out.println("Pelaaja 1: " + p1Valinta
                        + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");
                p2Valinta = p2.pelaajanValinta();
                System.out.println("Pelaaja 2: " + p2Valinta
                        + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");


                // Allaolevassa pätkässä on yritetty eri tapoja saada
                // lukumäärän laskeminen toimimaan oikein.
                // Ei tää kyllä vieläkään skulaa - KORJAA!

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
                pelatutPelit++;
            }
            System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            peliJatkuu=false;
        }
    }
