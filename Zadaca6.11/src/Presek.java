import java.util.ArrayList;
import java.util.List;

public class Presek {
    public static void main(String[] args) {
        List<String> l1 =  new ArrayList<String>();
        l1.add("Motor");
        l1.add("Avtomobil");
        l1.add("Roleri");

        List<String> l2 = new ArrayList<String>();
        l2.add("Trotinet");
        l2.add("Avtomobil");
        l2.add("Roleri");

        l1.retainAll(l2);

        System.out.println(l1);
    }
}
