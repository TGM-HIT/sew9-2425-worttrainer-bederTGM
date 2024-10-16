import java.io.*;
/**
 * Verwaltet das Speichern und Laden von Worttrainer-Daten.
 * Implementiert die SpeicherManager-Schnittstelle, um die Speicherstrategie austauschbar zu halten.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

// Verwaltet das Speichern und Laden von Worttrainer-Daten.
public class DateiManager implements SpeicherManager {

    // Pfad zur Datei, in der die Daten gespeichert werden.
    private static final String DATEIPFAD = "worttrainer.obj";

    // Speichert den aktuellen Zustand des Worttrainers in einer Datei.
    public void speichern(Worttrainer trainer) {
        // Speichern-Logik hier implementieren.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATEIPFAD))) {
            oos.writeObject(trainer);
            System.out.println("Worttrainer erfolgreich gespeichert.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Fehler beim Speichern: " + e.getMessage());
        }
    }

    // Lädt einen zuvor gespeicherten Worttrainer-Zustand aus der Datei.
    public Worttrainer laden() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATEIPFAD))) {
            return (Worttrainer) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Keine gespeicherten Daten gefunden. Neuer Trainer wird erstellt.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        }
        return null;
    }
}