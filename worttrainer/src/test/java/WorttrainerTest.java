import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit Tests des Worttrainers
 * @version 16.10.2024
 * @author Benjamin Eder
 */

public class WorttrainerTest {
    @Test
    void testStatistik() {
        Statistik statistik = new Statistik();
        assertEquals(0, statistik.getInsgesamt());
        assertEquals(0, statistik.getRichtig());
        assertEquals(0, statistik.getFalsch());
        assertEquals(0, statistik.berechneErfolgsrate(), 0.01);

        statistik.erhoeheRichtig();
        assertEquals(1, statistik.getInsgesamt());
        assertEquals(1, statistik.getRichtig());
        assertEquals(0, statistik.getFalsch());
        assertEquals(100, statistik.berechneErfolgsrate(), 0.01);

        statistik.erhoeheFalsch();
        assertEquals(2, statistik.getInsgesamt());
        assertEquals(1, statistik.getRichtig());
        assertEquals(1, statistik.getFalsch());
        assertEquals(50, statistik.berechneErfolgsrate(), 0.01);
    }
    @Test
    void testWortBildPaar() {
        WortBildPaar paar = new WortBildPaar("Hund", "https://example.com/hund.jpg");
        assertEquals("Hund", paar.getWort());
        assertEquals("https://example.com/hund.jpg", paar.getBildURL());
    }
    @Test
    void testWortBildPaarValidator() {
        WortBildPaarValidator validator = new WortBildPaarValidator();
        assertEquals(true, validator.validateURL("https://example.com/hund.jpg"));
        assertEquals(true, validator.validateURL("https://example.com/hund.png"));
        assertEquals(false, validator.validateURL("https://example.com/hund.gif"));
        assertEquals(false, validator.validateURL("https://example.com/hund"));
        assertEquals(false, validator.validateURL("https://example.com/hund.txt"));
    }
}
