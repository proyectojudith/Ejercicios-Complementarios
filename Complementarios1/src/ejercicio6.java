import java.util.Scanner;
public class EJERCICIO6 {
    public static void main(String[] args) {
        int base, exponente;
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        base = es.nextInt();
        System.out.println("Ingrese el segundo numero");
        exponente = es.nextInt();
        System.out.println(base + " " + "elevado a " + exponente + " = " + pot(base, exponente));
    }
    public static int pot(int b, int e) {
        int acu = 1;
        for (int i = 1; i <= e; i++) {
            acu = acu * b;
        }
        return(acu);
    }
}
