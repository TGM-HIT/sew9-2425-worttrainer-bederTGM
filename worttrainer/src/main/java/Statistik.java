import java.io.Serializable;

/**
 * Repräsentiert die Statistik der Worttrainer-Sitzung.
 * Zählt, wie oft richtig, falsch und insgesamt geraten wurde, und berechnet die Erfolgsrate.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class Statistik implements Serializable {

	private int insgesamt = 0;
	private int richtig = 0;
	private int falsch = 0;
	private double erfolgsRate;

	/**
	 * Erhöt den Zähler für richtig geratene Wörter und aktualisiert die Erfolgsrate.
	 */
	public void erhoeheRichtig() {
		richtig++;
		insgesamt++;
	}

	/**
	 * Erhöt den Zähler für falsch geratene Wörter und aktualisiert die Erfolgsrate.
	 */
	public void erhoeheFalsch() {
		falsch++;
		insgesamt++;
	}

	/**
	 * Berechnet die Erfolgsrate anhand der Anzahl der richtigen und insgesamt geratenen Wörter.
	 * @return Die Erfolgsrate in Prozent.
	 */
	public double berechneErfolgsrate() {
		if (insgesamt == 0) {
			erfolgsRate = 0;
		} else {
			erfolgsRate = (double) richtig / insgesamt * 100;
		}
		return erfolgsRate;
	}

	/**
	 * Gibt die Anzahl der insgesamt geratenen Wörter zurück.
	 * @return Die Anzahl der insgesamt geratenen Wörter.
	 */
	public int getInsgesamt() {
		return insgesamt;
	}

	/**
	 * Gibt die Anzahl der richtig geratenen Wörter zurück.
	 * @return Die Anzahl der richtig geratenen Wörter.
	 */
	public int getRichtig() {
		return richtig;
	}

	/**
	 * Gibt die Anzahl der falsch geratenen Wörter zurück.
	 * @return Die Anzahl der falsch geratenen Wörter.
	 */
	public int getFalsch() {
		return falsch;
	}
}

