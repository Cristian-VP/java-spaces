package write_read;
/*
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.
 */

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Ex02 {
    
    public static void main(String[] args) {
       try {
            BufferedReader br = new BufferedReader( new FileReader("primos.dat"));
            
            /*String lineOfBuffered = br.readLine();*/

            Stream<String> stream = br.lines();
            stream.forEach(System.out::println);
/*
            while(lineOfBuffered != null) {
                System.out.println(br.);
                System.out.println(lineOfBuffered);
                lineOfBuffered = br.readLine();
            }
*/
            br.close();
       } catch (FileNotFoundException fnfe) {
          System.out.println("No se encontró el archivo: " + fnfe.getMessage());    
       } catch (IOException ioe) {
           System.out.println("Error al leer el archivo: " + ioe.getMessage());
       } 
    }
}
