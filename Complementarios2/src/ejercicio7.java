import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int i = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2 = scan.nextInt();

        for (i = 1; i < numero_2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print("'FIzzBuzz'");
            } else if (i % 2 == 0) {
                System.out.print("'FIzz'");
            } else if (i % 3 == 0) {
                System.out.print("'Buzz'");
            } else {
                System.out.print(i);
            }
            System.out.print(",");
        }
            scan.close();
        }
    }