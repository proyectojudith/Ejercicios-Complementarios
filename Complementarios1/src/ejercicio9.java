public class EJERCICIO9 {
         public static int contarCaracteres(String cadenaTexto, char caracter) {
            int pos;
            int contador=0;
            pos=cadenaTexto.indexOf(caracter);
            while (pos!=-1)
            {
             contador++;
             pos=cadenaTexto.indexOf(caracter, pos + 1);
            }
            return contador;
        }
        public static void main(String [] args)
        {
            int cont=contarCaracteres("Hola Informatorio Java 2020", 'a');
            System.out.println(cont);
        }
    }
