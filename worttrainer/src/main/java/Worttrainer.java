import java.util.List;

// Hauptklasse des Worttrainers.
// Verwalten der Liste von Wort-Bild-Paaren und der aktuellen Trainingssitzung.
public class Worttrainer {

	// Liste aller verfügbaren Wort-Bild-Paare.
	private List<WortBildPaar> wortBildPaare;

	// Das aktuell ausgewählte Wort-Bild-Paar.
	private WortBildPaar aktuellesPaar;

	// Die Statistik des aktuellen Spiels.
	private Statistik statistik;

	// SpeicherManager, der das Laden und Speichern von Daten ermöglicht.
	private SpeicherManager speicherManager;

	// Aktuelles Wort-Bild-Paar.
	private WortBildPaar wortBildPaar;

	// Wählt ein bestimmtes Wort-Bild-Paar basierend auf dem Index aus.
	public void waehlePaar(int index) {
		// Logik zum Auswählen des Paars nach Index implementieren.
	}

	// Wählt ein zufälliges Wort-Bild-Paar aus der Liste.
	public void waehleZufaelligesPaar() {
		// Logik zur zufälligen Auswahl eines Paars implementieren.
	}

	// Überprüft, ob die Benutzereingabe mit dem Wort des aktuellen Paars übereinstimmt.
	public boolean ueberpruefeEingabe(String eingabe) {
		return false; // Implementiere die Überprüfung.
	}

	// Gibt die aktuelle Statistik zurück.
	public Statistik getStatistik() {
		return null; // Implementiere Rückgabe der Statistik.
	}
}
