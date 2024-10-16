/**
 * Interface für die Speicherung und das Laden von Worttrainern.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public interface SpeicherManager {
    /**
     * Speichert den aktuellen Zustand des Worttrainers.
     * @param trainer Der zu speichernde Worttrainer.
     */
    public void speichern(Worttrainer trainer);

    /**
     * Lädt einen zuvor gespeicherten Worttrainer-Zustand.
     * @return Der geladene Worttrainer oder null, falls kein Trainer gefunden wurde.
     */
    public Worttrainer laden();

}
