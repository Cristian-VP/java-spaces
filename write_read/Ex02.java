package write_read;
/*
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.
 */

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.stream.Stream;

public class Ex02 {
    
    public static void main(String[] args) {
       try {
            BufferedReader br = new BufferedReader( new FileReader("primos.dat"));
            BufferedWriter bw = new BufferedWriter( new FileWriter("sqrtPrimes.dat"));

            
            /*String lineOfBuffered = br.readLine();*/

            Stream<String> stream = br.lines();
            stream.forEach(
                 c -> {
                    try{
                        double n = Double.parseDouble(c);
                        double sqrt = Math.sqrt(n);
                        bw.write(new DecimalFormat("#.##").format(sqrt) + "\n");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el archivo: " + e.getMessage());
                    }
                    System.out.println();
                }
            );

            bw.close();
            br.close();
       } catch (FileNotFoundException fnfe) {
          System.out.println("No se encontró el archivo: " + fnfe.getMessage());    
       } catch (IOException ioe) {
           System.out.println("Error al leer el archivo: " + ioe.getMessage());
       } 
    }
}
