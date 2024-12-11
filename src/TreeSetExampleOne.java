import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {
    public static void main(String[] args) {
        TreeSet<Integer> num_treeset = new TreeSet<>();
        num_treeset.add(20);
        num_treeset.add(5);
        num_treeset.add(15);
        num_treeset.add(25);
        num_treeset.add(10);

        Iterator<Integer> iter_set = num_treeset.iterator();
        System.out.println("TreeSet using Iterator: ");
        while (iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(", ");
        }
    }
}
