import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero_1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2 = leer.nextInt();
        int suma = numero_1 + numero_2;
        int resta = numero_1 - numero_2;
        int multiplicar = numero_1 * numero_2;
        int dividir = numero_1 / numero_2;
        int resto = numero_1 % numero_2;
        System.out.println(numero_1 + " + " + numero_2 + " = " + suma);
        System.out.println(numero_1 + " - " + numero_2 + " = " + resta);
        System.out.println(numero_1 + " * " + numero_2 + " = " + multiplicar);
        System.out.println(numero_1 + " / " + numero_2 + " = " + dividir);
        System.out.println(numero_1 + " % " + numero_2 + " = " + resto);
    }
}
