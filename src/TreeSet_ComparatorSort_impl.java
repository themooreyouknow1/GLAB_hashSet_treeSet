import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ComparatorSort_impl {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>(new TreeSet_ComparatorSort());
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        System.out.println("TreeSet: " + cities);
    }
}
