import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    Locale currentLocale;
    ResourceBundle resourceBundle;

    public InternationalizationExample(String language) {

        switch (language) {
            case "pt":
                resourceBundle = ResourceBundle.getBundle("ex", new Locale("pt", "BR"));
                break;
            case "en":
                currentLocale = Locale.US;
                resourceBundle = ResourceBundle.getBundle("Ex", currentLocale);
                break;
            case "fr":
                currentLocale = Locale.FRANCE;
                resourceBundle = ResourceBundle.getBundle("Ex", currentLocale);
                break;
            case "it":
                currentLocale = Locale.ITALY;
                resourceBundle = ResourceBundle.getBundle("Ex", currentLocale);
                break;
            default:
                currentLocale = Locale.getDefault();
                resourceBundle = ResourceBundle.getBundle("Ex", currentLocale);
                break;
        }
    }

    public String getRaul() {
        return resourceBundle.getString("example1.raul");
    }
}
