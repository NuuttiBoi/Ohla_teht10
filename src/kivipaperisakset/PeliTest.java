package kivipaperisakset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PeliTest {
    @Test
    public void aloitePeliTest (){
        Pelaaja pelaaja1 = new Pelaaja();
        Pelaaja pelaaja2 = new Pelaaja();

        Peli peli = new Peli();

        // Jos pelaaja1 saa kiven ja pelaaja2 sakset, niin pelaajan1 tulisi voittaa.
        if(pelaaja1.pelaajanValinta().equals("kivi") && pelaaja2.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 1 voittaa", peli.tulos, "Tarkista pelin logiikan toimivuus");
        }

        // Jos pelaaja1 saa paperin ja pelaaja2 sakset, niin pelaajan2 tulisi voittaa.
        if(pelaaja1.pelaajanValinta().equals("paperi") && pelaaja2.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 2 voittaa", peli.tulos, "Tarkista pelin logiikan toimivuus");
        }

        // Jos pelaaja1 saa paperin ja pelaaja2 kiven, niin pelaajan1 tulisi voittaa.
        if(pelaaja1.pelaajanValinta().equals("kivi") && pelaaja2.pelaajanValinta().equals("sakset")){
            assertEquals("Pelaaja 1 voittaa", peli.tulos, "Tarkista pelin logiikan toimivuus");
        }

        // Jos jompikumpi pelaajista on saavuttanut kolme voittoa, niin pelin ei tulisi jatkua.
        if(pelaaja1.getVoitot() >= 3 || pelaaja2.getVoitot() >= 3){
            assertFalse(peli.peliJatkuu);
        }

    }
}
