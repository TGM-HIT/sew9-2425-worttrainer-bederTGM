// Schnittstelle für das Speichermanagement.
// Ermöglicht das flexible Austauschen der Speicherstrategie (z.B. Dateisystem, Datenbank, etc.).
public interface SpeicherManager {

	// Speichert den Zustand des Worttrainers.
	public abstract void speichern(Worttrainer trainer);

	// Lädt den gespeicherten Zustand des Worttrainers.
	public abstract Worttrainer laden();

};
