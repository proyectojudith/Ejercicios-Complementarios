import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1,2,4,4,4);
        List<Integer> nuevaLista = palabras.stream()
                .map(Ejercicio4::factorial)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nuevaLista);
    }
    public static Integer factorial(Integer numero) {
        if (numero == 1){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }
}

