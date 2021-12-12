import java.util.Set;
import java.util.TreeSet;
public class PresekUnija {
    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String>();
        mnozestvo1.add("Motor");
        mnozestvo1.add("Avtomobil");
        mnozestvo1.add("Trotinet");

        Set<String> mnozestvo2 = new TreeSet<String>();
        mnozestvo2.add("Motor");
        mnozestvo2.add("Avtomobil");
        mnozestvo2.add("Roleri");

        System.out.println("Presek od dvete mnozestva");
        mnozestvo1.retainAll(mnozestvo2);
        System.out.println(mnozestvo1);

        System.out.println("Unija od dvete mnozhestva");
        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);
    }
}
