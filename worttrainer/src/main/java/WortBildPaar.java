import java.io.Serializable;

/**
 * Klasse, die ein Wort-Bild-Paar repräsentiert.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortBildPaar implements Serializable {

	private String wort;
	private String bildURL;

	/**
	 * Erstellt ein neues Wort-Bild-Paar.
	 * @param wort Das Wort des Paares.
	 * @param bildURL Die URL des Bildes des Paares.
	 */
	public WortBildPaar(String wort, String bildURL) {
		this.wort = wort;
		this.bildURL = bildURL;
	}

	/**
	 * Gibt das Wort des Wort-Bild-Paares zurück.
	 * @return Das Wort des Paares.
	 */
	public String getWort() {
		return wort;
	}

	/**
	 * Gibt die URL des Bildes des Wort-Bild-Paares zurück.
	 * @return Die URL des Bildes.
	 */
	public String getBildURL() {
		return bildURL;
	}
}
