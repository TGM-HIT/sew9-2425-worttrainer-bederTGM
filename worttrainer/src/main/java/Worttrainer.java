import javax.swing.*;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

/**
 * Hauptklasse des Worttrainers. Verwalten der Liste von Wort-Bild-Paaren und der aktuellen Trainingssitzung. Zufälliger Auswahl und Überprüfung der Eingaben.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class Worttrainer implements Serializable {

	private List<WortBildPaar> wortBildPaare;
	private WortBildPaar aktuellesPaar;
	private Statistik statistik;
	private WortBildPaarValidator word;

	/**
	 * Erstellt einen neuen Worttrainer mit einer Liste von Wort-Bild-Paaren.
	 */
	public Worttrainer(List<WortBildPaar> wortBildPaare) {
		this.wortBildPaare = wortBildPaare;
		this.statistik = new Statistik();
	}

	/**
	 * Erstellt einen neuen Worttrainer mit einer Liste von Wort-Bild-Paaren.
	 */
	public void waehleZufaelligesPaar() {
		Random rand = new Random();
		aktuellesPaar = wortBildPaare.get(rand.nextInt(wortBildPaare.size()));
	}

	/**
	 * Überprüft die Eingabe des Benutzers auf Korrektheit.
	 * @param eingabe Die Eingabe des Benutzers.
	 * @return true, wenn die Eingabe korrekt ist, sonst false.
	 */
	public boolean ueberpruefeEingabe(String eingabe) {
		if (aktuellesPaar == null) {
			return false;
		}
		if (aktuellesPaar.getWort().equalsIgnoreCase(eingabe)) {
			statistik.erhoeheRichtig();
			aktuellesPaar = null; // Das Paar wird nicht mehr ausgewählt.
			return true;
		} else {
			statistik.erhoeheFalsch();
			return false;
		}
    }

	/**
	 * Gibt die Statistik der aktuellen Trainingssitzung zurück.
	 * @return Die Statistik der aktuellen Trainingssitzung.
	 */
	public Statistik getStatistik() {
		return statistik;
	}

	/**
	 * Gibt das aktuelle Wort-Bild-Paar zurück.
	 * @return Das aktuelle Wort-Bild-Paar.
	 */
	public WortBildPaar getAktuellesPaar() {
		return aktuellesPaar;
	}
}

