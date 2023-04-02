package testParcMetre;
import parcMetre.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class VoitureTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidPlaque() {
        Voiture v = new Voiture("1X-123-YY");
    }

    @Test
    public void testConstructorWithValidPlaque() {
        Voiture v = new Voiture("AB-123-CD");
        assertEquals("AB-123-CD", v.getPlaqueImmatriculation());
    }
}