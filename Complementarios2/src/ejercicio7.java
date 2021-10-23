import java.util.Scanner;

public class EJERCICIO7 {

    public static <def> void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero_1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2 = scan.nextInt();


        for (var i = 1; i <numero_2; i++) {
            var result = "";
            if (i % 2 == 0) {
                result += "Fizz";
            }
            if (i % 3 == 0) {
                result += "Buzz";
            }
            boolean resul;
            System.out.println(result+i);
        }
    }
}
