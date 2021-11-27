import Alumno.java.Alumno;

import java.time.*;
import java.util.*;
import java.util.stream.*;


public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Marta", "Avalos", LocalDate.of(1999, 1, 10)),
                new Alumno("Pablo", "Barrios", LocalDate.of(1998, 2, 11)),
                new Alumno("Victoria", "Monzón", LocalDate.of(1997, 3, 12)),
                new Alumno("Marcos", "Brizuela", LocalDate.of(1996, 4, 13)));
        Map<String,Integer> edad = alumnos.stream()
                .collect(Collectors.toMap(p-> (p.getName() + " " + p.getSurname()),
                        p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.print(edad);
    }
    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}


