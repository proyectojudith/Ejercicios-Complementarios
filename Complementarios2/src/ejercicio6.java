import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EJERCICIO6 {

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> diccionario = new HashMap<>();
        empleados.add(new Empleado(33228229, "Carlos Uriarte", 200, 500));
        empleados.add(new Empleado(30354123, "Javier Ledesma", 150, 382));
        empleados.add(new Empleado(32173281, "Laura Martinez", 200, 576));
        empleados.add(new Empleado(26198812, "Sandra Avalos", 110, 425));

        for (Empleado i:empleados){
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            diccionario.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getNombre() + " DNI: " + i.getDni() + " Sueldo: " + sueldo);
        }
    }
    static class Empleado{
        private final int dni;
        private final String nombre;
        private final int horasTrabajadas;
        private final int valorHora;
        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }
        public int getDni() {
            return dni;
        }
        public String getNombre() {
            return nombre;
        }
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }
        public int getValorHora() {
            return valorHora;
        }
    }
}