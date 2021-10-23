import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero");
        Integer numero = scanner.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }
    public static Integer factorial(Integer numero) {
        if (numero == 1) {
            return numero;
        } else {
            return (numero * factorial(numero - 1));
        }
    }
}