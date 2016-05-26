package jrout.tutorial.collections.sorting;

import java.util.Comparator;

/**
 * Created by Jayram on 5/25/2016.
 */
public class SortWithModel implements Comparator<Watch> {

    @Override
    public int compare(Watch o1, Watch o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
