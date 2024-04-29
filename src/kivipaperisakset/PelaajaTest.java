package kivipaperisakset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testaa Pelaaja - luokan toimivuutta.
 * @author Nuutti Turunen
*
 */

public class PelaajaTest {

    private String valinta;
    @BeforeEach
    public void setup(){
        Pelaaja pelaaja = new Pelaaja();
        valinta = pelaaja.pelaajanValinta();
    }
    /**
     * Testaa, toimiiko pelaajan liikkeen valinta.
     */
    @Test
    public void testPelaajanValinta() {
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }
}
