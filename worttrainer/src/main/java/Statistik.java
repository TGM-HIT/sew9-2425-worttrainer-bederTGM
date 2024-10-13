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

	// Erhöht den Zähler für richtig geratene Wörter und aktualisiert die Erfolgsrate.
	public void erhoeheRichtig() {
		richtig++;
		insgesamt++;
	}

	// Erhöht den Zähler für falsch geratene Wörter und aktualisiert die Erfolgsrate.
	public void erhoeheFalsch() {
		falsch++;
		insgesamt++;
	}

	// Berechnet die Erfolgsrate als Prozentzahl.
	public double berechneErfolgsrate() {
		if (insgesamt == 0) {
			return 0; // Vermeidet Division durch 0.
		}
		erfolgsRate = (double) richtig / insgesamt * 100;
		return erfolgsRate;
	}

	// Gibt die Anzahl der insgesamt durchgeführten Versuche zurück.
	public int getInsgesamt() {
		return insgesamt;
	}

	// Gibt die Anzahl der richtig geratenen Wörter zurück.
	public int getRichtig() {
		return richtig;
	}

	// Gibt die Anzahl der falsch geratenen Wörter zurück.
	public int getFalsch() {
		return falsch;
	}

	public String getErfolgsRate() {
		return String.valueOf(erfolgsRate);
	}
}

