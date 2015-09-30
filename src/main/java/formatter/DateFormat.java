package formatter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateFormat {

    public static final DateFormat INSTANCE = new DateFormat();


    /**
     * Will display the french format jour/mois/année
     *
     * @param date
     * @return
     */
    public String format(Date date) {
        java.text.DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    /**
     * Will display the french format jour/mois/année
     *
     * @param date
     * @return
     */
    public String format(LocalDate date) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(date);
    }

    /**
     * Will display the french format jour/mois/année
     *
     * @param date
     * @return
     */
    public String format(String format, LocalDate date) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(date);
    }

    /**
     * You can specify the format of the date
     *
     * @param format
     * @param date
     * @return
     */
    public String format(String format, Date date) {
        java.text.DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }


}
