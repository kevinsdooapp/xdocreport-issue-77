package formatter;

import javafx.collections.ObservableList;

import java.util.LinkedList;


public class DocumentsConvert {

    public static final DocumentsConvert INSTANCE = new DocumentsConvert();

    public LinkedList getDocu(ObservableList<Object> documents) {
        return new LinkedList();
    }

    public LinkedList getDocu(ObservableList<Object> documents, float maxWidth) {
        LinkedList collection = new LinkedList();


        return collection;
    }

    private byte[] convertImageToBytes(Object source) {

        return null;
    }


    public String findLegend(Object object, ObservableList<Object> documents, LinkedList objects) {

        return "";
    }
}