/**
 * Controller-Klasse, die den Ablauf des Worttrainers steuert.
 * Verbindet die Benutzeroberfläche (GUI) mit der Logik des Worttrainers.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortTrainerController {

	private Worttrainer worttrainer;
	private WortTrainerGUI gui;

	public WortTrainerController(Worttrainer worttrainer, WortTrainerGUI gui) {
		this.worttrainer = worttrainer;
		this.gui = gui;
	}

	public void startTrainer() {
		while (true) {
			// 1. Zufälliges Paar auswählen
			worttrainer.waehleZufaelligesPaar();

			// 2. Zeige das Bild und frage nach der Eingabe
			String bildURL = worttrainer.getAktuellesPaar().getBildURL();
			gui.zeigeBild(bildURL);

			String eingabe = gui.zeigeEingabeDialog();

			// 3. Überprüfe die Eingabe
			if (eingabe == null || eingabe.isEmpty()) {
				// Beenden, wenn die Eingabe leer ist
				break;
			}

			boolean korrekt = worttrainer.ueberpruefeEingabe(eingabe);

			if (korrekt) {
				gui.zeigeStatistik(worttrainer.getStatistik());
			}
		}
	}
}
