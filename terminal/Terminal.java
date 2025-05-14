package terminal;

import tiempo.Tiempo;

/*
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.
 */
public class Terminal implements Comunicable {
    private static Tiempo tiempoTotal = new Tiempo(0, 0, 0); 
    private String numero;
    private Tiempo tiempoLlamada;

    public Terminal(String number) {
        this.numero = number;
        this.tiempoLlamada = new Tiempo(0, 0, 0);
    }

    public String getNumero() {
        return numero;
    }

    public int getSegundos() {
        return  tiempoLlamada.getSeconds();
    }

    public int getMinutos() {
        return tiempoLlamada.getMinuts();
    }

    public static Tiempo getTiempoTotalTerminales() {
        return tiempoTotal;
    }

    public void setTiempo(int segundos) {
        tiempoLlamada.setSeconds(segundos);;
    }

    public void llama(Terminal terminal, int segundos) {
        terminal.setTiempo(segundos);
        this.setTiempo(segundos);
        tiempoTotal.sum(0, 0, segundos);
    }
    
    public String toString() {
        return "Nº " + this.numero + " - " + tiempoLlamada.getSeconds() + "s " + "de conversación";
    }

}    

