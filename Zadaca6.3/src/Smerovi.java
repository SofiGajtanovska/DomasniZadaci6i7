import java.util.ArrayList;
import java.util.List;


public class Smerovi {
    public static void main (String args[]){
        List<String> Smerovi = new ArrayList<String>();
        Smerovi.add("INKI");
        Smerovi.add("IKT");
        Smerovi.add("INKIV");

        System.out.println("Listata pred da se dodade element na treta pozicija izgleda vaka "+ Smerovi);

        Smerovi.add(2,"FAMIS");

        System.out.println("Lisatata po dovanjeto izgleda vaka "+ Smerovi);
    }
}
