import java.util.ArrayList;
import java.util.List;

public class Broj {
    public static void main(String[] args) {
        List<Integer> broj = new ArrayList<Integer>();
        broj.add(10);
        broj.add(5);
        broj.add(6);
        broj.add(78);
        broj.add(17);

        System.out.println("Vtoriot element e: "+broj.get(1));
    }
}
