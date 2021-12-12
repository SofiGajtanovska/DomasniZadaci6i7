import java.util.ArrayList;
import java.util.List;

public class Stringovi {
    public static void main(String[] args) {
        List<String> stringovi = new ArrayList<String>();

        for(int i=0;i<20;i++){
            if(i<9)
                stringovi.add("mail0"+(i+1)+"@yahoo.com");
            else
                stringovi.add("mail"+(i+1)+"@yahoo.com");

            System.out.println(stringovi.get(i));

        }
    }
}
