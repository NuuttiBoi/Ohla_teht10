package kivipaperisakset;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
* Testaa Pelaaja - luokan toimivuutta.
 */

public class PelaajaTest {
    // Pelaajan valinnan tulee olla yksi kolmesta arvosta.
    @Test
    public void testAdd() {
        Pelaaja pelaaja = new Pelaaja();
        String valinta = pelaaja.pelaajanValinta();
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }
}
