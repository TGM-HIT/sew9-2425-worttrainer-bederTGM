
/**
 * Verwaltet das Speichern und Laden von Worttrainer-Daten.
 * Implementiert die SpeicherManager-Schnittstelle, um die Speicherstrategie austauschbar zu halten.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class DateiManager implements SpeicherManager {

	// Speichert den aktuellen Zustand des Worttrainers.
	// TODO: Implementiere Logik, um den Worttrainer zu serialisieren und z.B. in einer Datei oder als JSON zu speichern.
	public void speichern(Worttrainer trainer) {
		// Speichern-Logik hier implementieren.
	}

	// Lädt einen zuvor gespeicherten Worttrainer-Zustand.
	// TODO: Implementiere Logik, um den Worttrainer aus einer Datei oder einem JSON-Format zu laden.
	public Worttrainer laden() {
		return null; // Muss durch Lade-Logik ersetzt werden.
	}

};
