package kivipaperisakset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testiluokka Peli-luokalle.
 * @author Nuutti Turunen
 */
public class PeliTest {

    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private Peli peli;


    @BeforeEach
    public void setup() {
        pelaaja1 = new Pelaaja();
        pelaaja2 = new Pelaaja();
        peli = new Peli();
    }

    @Test
    public void testPelaaja1Wins() {
        pelaaja1.setValinta("kivi");
        pelaaja2.setValinta("sakset");

        // Simulate game outcome
        peli.tarkastaTulos(pelaaja1.getValinta(), pelaaja2.getValinta());
        assertEquals("Pelaaja 1 voittaa", peli.getTulos());
    }

    @Test
    public void testPelaaja2Wins() {

        pelaaja1.setValinta("kivi");
        pelaaja2.setValinta("paperi");


        // Simulate game outcome
        peli.tarkastaTulos(pelaaja1.getValinta(), pelaaja2.getValinta());
        assertEquals("Pelaaja 2 voittaa", peli.getTulos());
    }

    @Test
    public void testTasapeli() {
        pelaaja1.setValinta("kivi");
        pelaaja2.setValinta("kivi");

        // Simulate game outcome
        peli.tarkastaTulos(pelaaja1.getValinta(), pelaaja2.getValinta());
        assertEquals("Tasapeli", peli.getTulos());
    }

    @Test
    public void testGameEnds() {
        pelaaja1.setVoitot(4);
        pelaaja2.setVoitot(4);
        peli.aloitaPeli();
        peli.jatketaankoPelia(pelaaja1.getVoitot(), pelaaja2.getVoitot());
        assertFalse(peli.getPeliJatkuu());
    }

    @Test
    public void testPeliJatkuu() {
        pelaaja1.setVoitot(1);
        pelaaja1.setVoitot(2);
        peli.jatketaankoPelia(pelaaja1.getVoitot(), pelaaja2.getVoitot());
        assertTrue(peli.getPeliJatkuu());
    }
}


