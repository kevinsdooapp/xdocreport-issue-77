package formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class BigDecimalFormat {


    public static final BigDecimalFormat INSTANCE = new BigDecimalFormat();
    final NumberFormat format = new DecimalFormat("#.##");

    public String format(BigDecimal bigDecimal) {
        format.setMinimumFractionDigits(2);
        try {
            return format.format(bigDecimal.doubleValue());
        } catch (Exception e) {
            return "";
        }
    }

    public String formatc(String patern, BigDecimal bigDecimal) {
        try {
            NumberFormat customFormat = new DecimalFormat(patern);
            return customFormat.format(bigDecimal.doubleValue());
        } catch (NullPointerException e) {

        }
        return "";
    }


}
