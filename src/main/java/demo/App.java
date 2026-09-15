package demo;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class App {
    public static void main(String[] args) {
        var a = new ArrayList<String>();
        SequencedCollection<String> values = a;
        values.addFirst("first");
        values.addLast("last");

        System.out.println(values.toString());
    }
}
