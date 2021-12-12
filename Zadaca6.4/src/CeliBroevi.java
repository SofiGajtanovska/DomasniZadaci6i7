import java.util.ArrayList;
import  java.util.List;
import java.util.Collections;


public class CeliBroevi {
    public static void main (String args[]){
        List<Integer>CeliBroevi = new ArrayList<Integer>();
        CeliBroevi.add(5);
        CeliBroevi.add(2);
        CeliBroevi.add(7);
        CeliBroevi.add(1);
        CeliBroevi.add(6);

        System.out.println("Nizata pred sosrtiranjeto : "+CeliBroevi);

        Collections.sort(CeliBroevi);

        System.out.println("Nizata po sortiranjeto :" + CeliBroevi);
    }
}
