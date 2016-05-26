package jrout.tutorial.collections.sorting;

import java.util.*;

/**
 * Created by Jayram on 5/25/2016.
 */
public class SortringExample {
    public static void main(String[] args) {
        List<Watch> watches = new ArrayList<>();
        watches.add(new Watch("Jayram","Fasttract","India"));
        watches.add(new Watch("Ananth","Rado","Usa"));
        watches.add(new Watch("Tanu","Titan","China"));

        System.out.println("Original Order");
        System.out.println(watches);

        Collections.sort(watches);
        System.out.println("Sorting using Name");
        System.out.println(watches);

        Collections.sort(watches , new SortWithModel());
        System.out.println("Sorting using Model");
        System.out.println(watches);

       /* Collections.sort(watches, new Comparator<Watch>() {
            @Override
            public int compare(Watch o1, Watch o2) {
                return o1.getMake().compareTo(o2.getMake());
            }
        });*/

        Collections.sort(watches, (o1, o2) ->
                            o1.getMake().compareTo(o2.getMake()));
        System.out.println("Sorting using Country");
        System.out.println(watches);
    }
}
