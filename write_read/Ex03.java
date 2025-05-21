import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex03 {
    /*
     * Escribe un programa que guarde en un fichero el contenido de otros dos
ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
primeros dos ficheros mezcladas, es decir, la primera línea será del primer
fichero, la segunda será del segundo fichero, la tercera será la siguiente del
primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
pueden tener tamaños diferentes.
     */
    public static void main(String args []) {
        try{

            FileWriter mixNumbers = new FileWriter("mixnumbers.dat");
            BufferedWriter bw = new BufferedWriter(mixNumbers);
            BufferedReader br1 = new BufferedReader( new FileReader("primos.dat"));
            BufferedReader br2 = new BufferedReader( new FileReader("sqrtPrimes.dat"));

            Stream<String> stream1 = br1.lines();
            Stream<String> stream2 = br2.lines();

            

        }catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
