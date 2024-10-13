/**
 * Speichermanager Interface
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public interface SpeicherManager {

	// Speichert den Zustand des Worttrainers.
	public abstract void speichern(Worttrainer trainer);

	// Lädt den gespeicherten Zustand des Worttrainers.
	public abstract Worttrainer laden();

}
