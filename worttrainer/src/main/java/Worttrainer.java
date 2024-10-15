import java.io.Serializable;
import java.util.List;
import java.util.Random;

/**
 * Hauptklasse des Worttrainers. Verwalten der Liste von Wort-Bild-Paaren und der aktuellen Trainingssitzung. Zufälliger Auswahl und Überprüfung der Eingaben.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class Worttrainer {

	private List<WortBildPaar> wortBildPaare;
	private WortBildPaar aktuellesPaar;
	private Statistik statistik;

	public Worttrainer(List<WortBildPaar> wortBildPaare) {
		this.wortBildPaare = wortBildPaare;
		this.statistik = new Statistik();
	}

	// Wählt ein bestimmtes Wort-Bild-Paar basierend auf dem Index aus.
	public void waehlePaar(int index) {
		if (index >= 0 && index < wortBildPaare.size()) {
			aktuellesPaar = wortBildPaare.get(index);
		}
	}

	// Wählt ein zufälliges Wort-Bild-Paar aus der Liste.
	public void waehleZufaelligesPaar() {
		Random rand = new Random();
		aktuellesPaar = wortBildPaare.get(rand.nextInt(wortBildPaare.size()));
	}

	// Überprüft, ob die Benutzereingabe mit dem Wort des aktuellen Paars übereinstimmt.
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

	public Statistik getStatistik() {
		return statistik;
	}

	public WortBildPaar getAktuellesPaar() {
		return aktuellesPaar;
	}
}

