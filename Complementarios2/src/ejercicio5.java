import java.util.ArrayList;
import java.util.List;

public class EJERCICIO5 {
    public static void main(String[] args) {

    List<Integer> Horastrabajadas;

    Horastrabajadas=new ArrayList<>();

        Horastrabajadas.add(6);
        Horastrabajadas.add(7);
        Horastrabajadas.add(8);
        Horastrabajadas.add(4);
        Horastrabajadas.add(5);
        List<Integer> PrecioHora;
        PrecioHora=new ArrayList<>();
        PrecioHora.add(350);
        PrecioHora.add(345);
        PrecioHora.add(550);
        PrecioHora.add(600);
        PrecioHora.add(320);

        System.out.println(Horastrabajadas);
        System.out.println(PrecioHora);
        List<Integer> Totalacobrar;
        Totalacobrar=new ArrayList<>();
        Totalacobrar.add(6*350);
        Totalacobrar.add(7*345);
        Totalacobrar.add(8*550);
        Totalacobrar.add(4*600);
        Totalacobrar.add(5*320);
        List<Integer> Totalfinal;
        Totalfinal=new ArrayList<>();
        Totalfinal.add(2100+2415+4400+2400+1600);
        System.out.println(Totalacobrar);
        System.out.println("Total final $" + " " + Totalfinal);

    }
}

