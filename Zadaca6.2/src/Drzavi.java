import java.util.ArrayList;
import java.util.List;


public class Drzavi {
    public static void main(String args[]){
        List<String> Drzavi = new ArrayList<String>();
        Drzavi.add("Makedonija");
        Drzavi.add("Grcija");
        Drzavi.add("Rusija");

        System.out.println("Goleminata na ovaa lista e "+ Drzavi.size());

        if (Drzavi.size()==3){
            Drzavi.add("Srbija");
            Drzavi.add("Bugarija");
        }
        else {
            System.out.println(Drzavi.size());
        }
        System.out.println(Drzavi);
        System.out.println("Sega goleminata e "+ Drzavi.size());
    }
}
