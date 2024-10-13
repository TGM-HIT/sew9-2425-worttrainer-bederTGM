import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main { // Changed the class name to start with uppercase

    public static void main(String[] args) {
        // 1. Initialize some word-image pairs for the trainer
        WortBildPaar paar1 = new WortBildPaar("Hund", "https://img.freepik.com/vektoren-kostenlos/niedliche-hunde-cartoon-figur-stehend_1308-133833.jpg");
        WortBildPaar paar2 = new WortBildPaar("Katze", "https://img.freepik.com/vektoren-kostenlos/schoene-kleine-katze-zeichentrickfigur_1308-140198.jpg");
        WortBildPaar paar3 = new WortBildPaar("Auto", "https://img.freepik.com/vektoren-kostenlos/orangen-vektor-illustration-fuer-klassische-autos_1308-164098.jpg");

        // 2. Create the list of word-image pairs
        List<WortBildPaar> paare = new ArrayList<>();
        paare.add(paar1);
        paare.add(paar2);
        paare.add(paar3);

        // 3. Create an instance of SpeicherManager (make sure this class is implemented)
        DateiManager dateiManager = new DateiManager();

        // 4. Create a new Worttrainer with the list of word-image pairs and the SpeicherManager
        Worttrainer worttrainer = new Worttrainer(paare, dateiManager);

        // 5. Initialize the GUI and the Controller
        WortTrainerGUI gui = new WortTrainerGUI();
        WortTrainerController controller = new WortTrainerController(worttrainer, gui);

        // 6. Start the training
        controller.startTrainer();
    }
}
