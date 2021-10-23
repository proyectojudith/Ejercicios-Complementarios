import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJERCICIO3 {
    public static void main (String[] args){
        List<Integer> barajafrancesa = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
        System.out.println(barajafrancesa);
        Collections.reverse(barajafrancesa);
        System.out.println(barajafrancesa);
        Collections.shuffle(barajafrancesa);
        System.out.println(barajafrancesa);
    }
}
