package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        for (int i = 1; i < 50; i++) {
            osudi.add(i);
            //System.out.println(osudi);

        }
    }

    public void zamichat() {

        Collections.shuffle(osudi);

    }

    public List<Integer> vylosovanaCisla() {
        List<Integer> top6 = new ArrayList<Integer>(osudi.subList(Math.max(osudi.size() - 6, 0), osudi.size()));
        return top6;
    }

    public Integer dodatkoveCislo() {
        return osudi.get(6);

    }
}
