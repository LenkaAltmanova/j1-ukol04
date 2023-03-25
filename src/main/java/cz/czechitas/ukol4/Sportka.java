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
    //naplnit osudí čísly 1 až 49

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */

    public void zamichat() {

        Collections.shuffle(osudi);
        //System.out.println(osudi);

    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     *
     * @see List#subList(int, int)
     */

    public List<Integer> vylosovanaCisla() {
        List<Integer> top6 = new ArrayList<Integer>(osudi.subList(0,6));
        return top6;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */

    public Integer dodatkoveCislo() {
        return osudi.get(6);

    }
}
