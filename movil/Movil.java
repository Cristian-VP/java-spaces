package movil;

import terminal.Terminal;
import java.text.DecimalFormat;

/*
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 llamada. A continuación se proporciona el contenido del main y el resultado
 que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 decimales, puedes utilizar DecimalFormat.
 
 */

public class Movil extends Terminal {
    Tarifa tarifa;
    double costeLlamadas = 0;
    
    public Movil(String numero, Tarifa tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    public String getCosteLlamadas() {
        return new DecimalFormat("#0.00").format(costeLlamadas);
    }

    public void setCosteLlamada(int segundos) {
        this.costeLlamadas = (segundos/60.0) * tarifa.getCostePorMinuto() ; 
    }

    public void llama( Terminal terminal, int segundos ) {
        super.llama(terminal, segundos);
        setCosteLlamada(segundos);
    }

    public String toString() {
        return super.toString() + "Tarificados " + getCosteLlamadas() + " euros.";
    }    
}
