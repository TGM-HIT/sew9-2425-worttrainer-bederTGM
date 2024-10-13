import java.io.Serializable;

/**
 * Klasse, die ein Wort-Bild-Paar repräsentiert.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortBildPaar implements Serializable {

	private String wort;
	private String bildURL;

	public WortBildPaar(String wort, String bildURL) {
		this.wort = wort;
		this.bildURL = bildURL;
	}

	// Gibt das Wort des Wort-Bild-Paars zurück.
	public String getWort() {
		return wort;
	}

	// Gibt die Bild-URL des Wort-Bild-Paars zurück.
	public String getBildURL() {
		return bildURL;
	}
}
