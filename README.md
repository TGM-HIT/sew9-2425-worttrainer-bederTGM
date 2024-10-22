## Worttrainer - Ein Rechtschreibtrainer für Volksschulkinder
Autor: **Benjamin Eder**
Datum: **18.09.2024**

### Projektbeschreibung
Der Worttrainer ist eine Anwendung, die entwickelt wurde, um Volksschulkindern dabei zu helfen, ihre Rechtschreibung zu verbessern. Die Kinder sehen ein Bild (z.B. einen Hund) und sollen dann das dazugehörige Wort in ein Textfeld eingeben. Die Eingabe wird mit der korrekten Schreibweise verglichen, und die Kinder erhalten sofort eine Rückmeldung darüber, ob das Wort korrekt eingegeben wurde.

### Entwicklungsprozess
#### Erstellung eines UML-Klassendiagramms
Der Entwicklungsprozess begann mit der Erstellung eines UML-Klassendiagramms. Hierbei wurde ein erster Entwurf der grundlegenden Struktur der Anwendung erstellt, um die Beziehungen zwischen den verschiedenen Klassen zu visualisieren. Dieser Prototyp diente als Ausgangspunkt und wurde im Laufe des Projekts weiter überarbeitet und verbessert.

#### Implementierung der Klassen
Basierend auf dem UML-Diagramm wurden die Klassen grob implementiert. Diese Klassen legen die Basis für die Funktionsweise der Anwendung, indem sie die Logik und die Datenstruktur des Worttrainers definieren.

#### Implementierung der Methoden
In einem iterativen Prozess wurden zuerst die wichtigsten Klassen implementiert und getestet:

Worttrainer: Diese Klasse steuert den Ablauf der Anwendung.
WortBildPaar: Sie stellt die Verbindung zwischen einem Bild und dem entsprechenden Wort her.
WortBildPaarValidator: Diese Klasse prüft, ob das eingegebene Wort korrekt ist.
Nachdem diese Grundfunktionen funktionierten, wurden weitere Klassen wie die GUI und der SpeicherManager implementiert und ebenfalls getestet.

#### Testen der Anwendung
Die Anwendung wurde umfassend mit JUnit getestet. Hierbei wurden alle wesentlichen Funktionen überprüft, insbesondere das korrekte Anzeigen der Rückmeldungen und das Validieren der eingegebenen Wörter. Identifizierte Fehler wurden behoben, um die Stabilität der Anwendung zu gewährleisten.

#### Erstellung einer .gitignore-Datei und Überarbeitung der Kommentare
Zum Abschluss der Implementierung wurde eine .gitignore-Datei hinzugefügt, um nicht relevante oder sensible Dateien vom Versionskontrollsystem auszuschließen. Alle Kommentare im Code wurden überarbeitet, um sicherzustellen, dass sie verständlich und klar sind. Dies erleichtert die Wartung und Weiterentwicklung der Anwendung.

### Fazit
Mit dieser Anwendung können Volksschulkinder spielerisch ihre Rechtschreibung verbessern. Der Einsatz einer benutzerfreundlichen grafischen Oberfläche (GUI) ermöglicht eine intuitive Bedienung. Die Anwendung bietet direkte Rückmeldung und motiviert die Kinder so, ihre Fähigkeiten weiter zu trainieren.







