import java.util.Scanner;
import java.util.Formatter;


    public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,edad,direccion,ciudad;
        System.out.print("Ingrese su nombre y apellido");
        nombre = sc.nextLine();
        System.out.print("Ingrese su edad");
        edad = sc.nextLine();
        System.out.print("Ingrese su direccion");
        direccion = sc.nextLine();
        System.out.print("Ingrese su ciudad");
        ciudad = sc.nextLine();

        Formatter formatter = new Formatter();
        Object cadenaFormato = formatter.format("{ %-7s} - { %-9s} - { %-7s} - { %-19s}", ciudad,direccion,edad,nombre);

        System.out.println("{ Ciudad} - {Direccion} - {Edad} - {Nombre y apellido}");
        System.out.println(cadenaFormato);

    }
}