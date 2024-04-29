package kivipaperisakset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
* Peli - luokan testaaminen.
 */
public class PeliTest {
    @Test
    public void aloitePeliTest (){
        Peli peli = new Peli();
        Pelaaja p1 = peli.getP1();
        Pelaaja p2 = peli.getP2();

        // Jos pelaaja1 saa kiven ja pelaaja2 sakset, niin pelaajan1 tulisi voittaa.
        if(p1.pelaajanValinta().equals("kivi") && p2.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 1 voittaa", peli.getTulos(), "Tarkista pelin logiikan toimivuus");
        }

        // Jos pelaaja1 saa paperin ja pelaaja2 sakset, niin pelaajan2 tulisi voittaa.
        if(p1.pelaajanValinta().equals("paperi") && p1.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 2 voittaa", peli.getTulos(), "Tarkista pelin logiikan toimivuus");
        }

        // Jos pelaaja1 saa paperin ja pelaaja2 kiven, niin pelaajan1 tulisi voittaa.
        if(p1.pelaajanValinta().equals("kivi") && p1.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 1 voittaa", peli.getTulos(), "Tarkista pelin logiikan toimivuus");
        }

        // Jos jompikumpi pelaajista on saavuttanut kolme voittoa, niin pelin ei tulisi jatkua.
        if(peli.getP1Voitot() >= 3 || peli.getP2Voitot() >= 3){
            assertFalse(peli.peliJatkuu);
        }

    }
}
