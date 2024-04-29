package kivipaperisakset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
* Testaa Pelaaja - luokan toimivuutta.
 */

public class PelaajaTest {
    // Pelaajan valinnan tulee olla yksi kolmesta arvosta.

    private String valinta;
    @BeforeEach
    public void setup(){
        Pelaaja pelaaja = new Pelaaja();
        valinta = pelaaja.pelaajanValinta();
    }
    @Test
    public void testAdd() {
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }
}
