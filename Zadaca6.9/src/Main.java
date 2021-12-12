import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fakultet> fakulteti = new ArrayList<Fakultet>();

        Fakultet f = new Fakultet("FIKT",5,2000);
        fakulteti.add(f);
        fakulteti.add(new Fakultet("FINKI", 3, 1000));
        fakulteti.add(new Fakultet("FAMIS", 8, 800));
        fakulteti.add(new Fakultet("PMF", 4, 400));
        fakulteti.add(new Fakultet("FPN", 5, 900));

        for(int i=0;i<fakulteti.size();i++){
            System.out.println(fakulteti.get(i).getIme());
            System.out.println(fakulteti.get(i).getBrojSmerovi());
            System.out.println(fakulteti.get(i).getVkupnoStudenti());
        }
    }
}
