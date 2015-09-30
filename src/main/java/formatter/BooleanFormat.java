package formatter;


public class BooleanFormat {

    public static final BooleanFormat INSTANCE = new BooleanFormat();

    public String format(boolean b) {
        return Boolean.toString(b);
    }
}
