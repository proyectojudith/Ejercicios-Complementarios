import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario;
        System.out.println("Ingrese su nombre de usuario");
        usuario = teclado.nextLine();
        System.out.println("Hola" + " " +usuario);

    }
}
