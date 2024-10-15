import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WortBildPaar paar1 = new WortBildPaar("Hund", "https://img.freepik.com/vektoren-kostenlos/niedliche-hunde-cartoon-figur-stehend_1308-133833.jpg");
        WortBildPaar paar2 = new WortBildPaar("Katze", "https://img.freepik.com/vektoren-kostenlos/schoene-kleine-katze-zeichentrickfigur_1308-140198.jpg");
        WortBildPaar paar3 = new WortBildPaar("Auto", "https://img.freepik.com/vektoren-kostenlos/orangen-vektor-illustration-fuer-klassische-autos_1308-164098.jpg");
        WortBildPaar paar4 = new WortBildPaar("Haus", "https://img.freepik.com/free-vector/cozy-cartoon-family-home-illustration_1308-164502.jpg");
        WortBildPaar paar5 = new WortBildPaar("Baum", "https://img.freepik.com/free-vector/isolated-tree-white-background_1308-113562.jpg");
        WortBildPaar paar6 = new WortBildPaar("Blume", "https://img.freepik.com/free-vector/blue-flower-with-green-leaves_1308-103581.jpg");
        WortBildPaar paar7 = new WortBildPaar("Schaf", "https://img.freepik.com/free-vector/white-sheep-standing-white-background_1308-81697.jpg");
        WortBildPaar paar8 = new WortBildPaar("Kuh", "https://img.freepik.com/free-vector/cute-cow-white-background_1308-44448.jpg");
        WortBildPaar paar9 = new WortBildPaar("Motorrad", "https://img.freepik.com/free-vector/illustration-motorcycle-red-color_1308-35859.jpg");
        WortBildPaar paar10 = new WortBildPaar("Schwein", "https://img.freepik.com/free-vector/cute-pig-with-pink-skin-white_1308-40061.jpg");

        List<WortBildPaar> paare = new ArrayList<>();
        paare.add(paar1);
        paare.add(paar2);
        paare.add(paar3);
        paare.add(paar4);
        paare.add(paar5);
        paare.add(paar6);
        paare.add(paar7);
        paare.add(paar8);
        paare.add(paar9);
        paare.add(paar10);

        Worttrainer worttrainer = new Worttrainer(paare);

        WortTrainerGUI gui = new WortTrainerGUI();
        WortTrainerController controller = new WortTrainerController(worttrainer, gui);

        controller.startTrainer();
    }
}
