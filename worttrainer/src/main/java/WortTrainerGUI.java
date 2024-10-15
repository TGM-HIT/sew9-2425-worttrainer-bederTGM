import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * GUI-Klasse zur Anzeige von Bildern, Eingabefeldern und Statistiken.
 * Verwaltet die Benutzeroberfläche des Worttrainers.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortTrainerGUI {

	public void zeigeBild(String bildURL) {
		try {
			// Lade das Bild von der URL
			URL url = new URL(bildURL);
			Image image = ImageIO.read(url);

			ImageIcon imageIcon = new ImageIcon(image);

			// Zeige das Bild in einem Dialog
			JOptionPane.showMessageDialog(null, imageIcon, "Worttrainer", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			// Fehlerbehandlung, falls das Bild nicht geladen werden kann
			JOptionPane.showMessageDialog(null, "Bild konnte nicht geladen werden: " + e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
		}
	}


	public String zeigeEingabeDialog() {
		// Zeigt ein Eingabefeld für das Wort an
		return JOptionPane.showInputDialog(null, "Gib das Wort ein:", "Worttrainer", JOptionPane.QUESTION_MESSAGE);
	}

	public void zeigeStatistik(Statistik statistik) {
		// Zeigt die aktuelle Statistik an
		JOptionPane.showMessageDialog(null, "Statistik:\n" +
				"Insgesamt: " + statistik.getInsgesamt() + "\n" +
				"Richtig: " + statistik.getRichtig() + "\n" +
				"Falsch: " + statistik.getFalsch() + "\n" +
				"Erfolgsrate: " + statistik.berechneErfolgsrate() + "%", "Statistik", JOptionPane.INFORMATION_MESSAGE);
	}
}
