import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class EJERCICIO4 {
        public static void main(String[] args) {

            List<String> estudiantes = new ArrayList<>(Arrays.asList("Carolina", "Leonardo", "Fabiana", "Gerardo", "Walter", "Laura", "Luis", "Georgina",
                    "Alfredo", "Diego", "Natalia", "Cecilia"
            ));
            List<List<String>> cursos = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                cursos.add(estudiantes.subList(3 * i, 3 + 4 * i));
            }
            System.out.println(cursos);
            int count = 1;
            for (List<String> curso:cursos){
                System.out.println("curso " + (count++) + ": " + curso);
            }
        }
    }

