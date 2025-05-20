package write_read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    /*
     * Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.
     */
   
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            
            for (int i = 2; i <= 500; i++) {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    bw.write(i + "\n");
                }
            }
            bw.close();
            System.out.println("Los números primos se han guardado en primos.dat");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());

        }        
    }
}
