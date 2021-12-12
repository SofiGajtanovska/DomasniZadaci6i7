import java.util.ArrayList;
import java.util.List;

public class Unija {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Trotinet");
        l1.add("Roleri");
        l1.add("Motor");
        List<String> l2 = new ArrayList<String>();
        l2.add("Avtomobil");
        l2.add("Skejtbord");
        l2.add("Rousuli");

        l1.addAll(l2);

        System.out.println(l1);
    }
}
