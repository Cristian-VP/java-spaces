import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

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
            String dataPrimes, dataSqrtPrimes;
            FileWriter mixNumbers = new FileWriter( "mixnumbers.dat" );
            
            BufferedWriter writeBW = new BufferedWriter( mixNumbers );
            BufferedReader primesBR = new BufferedReader( new FileReader("primos.dat" ));
            BufferedReader sqrtPrimesBR = new BufferedReader( new FileReader("sqrtPrimes.dat" ));
            
            dataPrimes = primesBR.readLine();
            dataSqrtPrimes = sqrtPrimesBR.readLine();
            
            while( dataPrimes != null || dataSqrtPrimes != null ) {
                if( dataPrimes != null ) {
                    writeBW.write( dataPrimes + "\n" );
                    dataPrimes = primesBR.readLine();
                }
                if( dataSqrtPrimes != null ) {
                    writeBW.write( dataSqrtPrimes + "\n" );
                    dataSqrtPrimes = sqrtPrimesBR.readLine();
                }
            }            
            
            writeBW.close();
            primesBR.close();
            sqrtPrimesBR.close();

        }catch (IOException e) {

            System.out.println("Error al escribir en el archivo: " + e.getMessage());

        } 
    }
}
