/**
 * Controller-Klasse, die den Ablauf des Worttrainers steuert.
 * Verbindet die Benutzeroberfläche (GUI) mit der Logik des Worttrainers.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortTrainerController {

	private Worttrainer worttrainer;
	private WortTrainerGUI gui;
	private SpeicherManager speicher;

	/**
	 * Erstellt einen neuen WortTrainerController.
	 * @param worttrainer Der Worttrainer, der die Logik des Trainings enthält.
	 * @param gui Die Benutzeroberfläche des Worttrainers.
	 * @param speicher Der SpeicherManager, der das Laden und Speichern des Worttrainers übernimmt.
	 */
	public WortTrainerController(Worttrainer worttrainer, WortTrainerGUI gui, SpeicherManager speicher) {
		this.worttrainer = worttrainer;
		this.gui = gui;
		this.speicher = speicher;
	}

	/**
	 * Startet den Worttrainer und führt das Training durch.
	 */
	public void startTrainer() {
		// Laden des vorherigen Zustands
		Worttrainer geladenerTrainer = speicher.laden();
		if (geladenerTrainer != null) {
			worttrainer = geladenerTrainer;
		}

		while (true) {
			// Zufälliges Paar auswählen
			worttrainer.waehleZufaelligesPaar();

			// Zeige das Bild und frage nach der Eingabe
			String bildURL = worttrainer.getAktuellesPaar().getBildURL();
			gui.zeigeBild(bildURL);

			String eingabe = gui.zeigeEingabeDialog();

			// Überprüfe die Eingabe
			if (eingabe == null || eingabe.isEmpty()) {
				// Beenden, wenn die Eingabe leer ist
				break;
			}

			boolean korrekt = worttrainer.ueberpruefeEingabe(eingabe);

			if (korrekt) {
				gui.zeigeStatistik(worttrainer.getStatistik());
			}
			speicher.speichern(worttrainer);
		}
	}
}
