import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextInt();

        if (num1 < num2) {
                System.out.println();
        } else {
            if (num1 % num2 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buss");
            }
            if (num1 == num2 && num1 % num2 == 0) {
                System.out.println("FizzBuzz");

            }
        }
    }
}

