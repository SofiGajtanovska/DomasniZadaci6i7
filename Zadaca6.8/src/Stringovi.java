import java.util.ArrayList;
import java.util.List;

public class Stringovi {
    public static void main(String[] args) {
        List<String> stringovi = new ArrayList<String>();
        for(int i=5;i<=20;i+=5){
            stringovi.add("mail"+i+"@yahoo.com");
        }

        for(int i=0;i<stringovi.size();i++){
            System.out.println(stringovi.get(i));
        }
    }
}
