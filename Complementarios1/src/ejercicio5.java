import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero_1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2 = leer.nextInt();
        int multiplicar = numero_1 * numero_2;
        System.out.println(numero_1 + " * " + numero_2 + " = " + multiplicar);
    }

}
