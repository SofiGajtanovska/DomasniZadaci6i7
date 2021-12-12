import java.util.ArrayList;
import java.util.List;

public class Stringovi {
    public static void main(String[] args) {

        List<String> stringovi = new ArrayList<String>();

        for(int i=0;i<20;i++){
            stringovi.add("mail"+(i+1)+"@yahoo.com");

        }
        for(int i=0;i<20;i++){
            System.out.println(stringovi.get(i));
        }
    }
}

