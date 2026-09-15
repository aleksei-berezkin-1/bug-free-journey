package demo;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class App {
    public static void main(String[] args) {
        SequencedCollection<String> values = new ArrayList<>();
        values.addFirst("first");
        values.addLast("last");

        System.out.println(values.toString());
    }
}
