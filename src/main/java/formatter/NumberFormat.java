package formatter;

import java.text.DecimalFormat;


public class NumberFormat {
    public static final NumberFormat INSTANCE = new NumberFormat();

    public String format(String f, double nb) {
        java.text.NumberFormat numberFormat = new DecimalFormat(f);
        return numberFormat.format(nb);
    }
}
