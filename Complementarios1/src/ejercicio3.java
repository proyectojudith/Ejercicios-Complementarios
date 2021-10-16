import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número, luego se imprimirá la secuencia");
        int num = scan.nextInt();
        scan.close();
        for (int i=1; i<=num; i++) {
            List<Integer> lista = new ArrayList<Integer>();
            for (int a=1; a<=i; a++){
                lista.add(a);
            }
            System.out.println(lista);
        }

    }
}