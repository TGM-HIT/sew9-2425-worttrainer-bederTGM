import java.util.regex.Pattern;

/**
 * Klasse zur Validierung von Wort-Bild-Paaren.
 * @version 12.10.2024
 * @author Benjamin Eder
 */

public class WortBildPaarValidator {

	/**
	 * Überprüft, ob die gegebene URL ein gültiges Bildformat hat.
	 * @return url
	 */
	public boolean validateURL(String url) {
		String regex = "^(http|https)://.*\\.(jpg|png)$"; // URL-Pattern für Bilder.
		return Pattern.matches(regex, url);
	}

	/**
	 * Überprüft, ob das gegebene Wort nur aus Buchstaben besteht.
	 * @return word
	 */
	public boolean validateWord(String word) {
		return word != null && word.matches("[a-zA-Z]+");
	}
}
