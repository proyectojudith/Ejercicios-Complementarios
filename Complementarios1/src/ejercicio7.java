import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Ingrese una palabra en minúscula");
        String palabra = str.nextLine();
        str.close();

        System.out.println(mayuscula(palabra));
    }
         public static String mayuscula(String str)
         {
             String palabra = "";
            for (int i = 0; i < str.length(); i++) {
                int v = str.charAt(i);
                if (v > 96 && v < 123) v -= 32;
                palabra += (char)v;
            }
            return palabra;
        }
    }