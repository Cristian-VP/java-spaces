package tiempo;

/*
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien.
 */

public class Tiempo {
    private int hours;
    private int minuts;
    private int seconds;

    public Tiempo(int h, int m, int s) {
        this.hours = (h >= 0 && h < 24) ? h : 0;
        this.minuts = (m >= 0 && m < 60) ? m : 0;
        this.seconds = (s >= 0 && s < 60) ? s : 0;
    }

    //Setters 
    public void setHours(int h) {
        this.hours = (h >= 0 && h < 24) ? h : 0;
    }
    public void setMinuts(int m) {
        this.minuts = (m >= 0 && m < 60) ? m : 0;
    }
    public void setSeconds(int s) {
        this.seconds = (s >= 0 && s < 60) ? s : 0;
    }

    //Getters
    public int getHours() {
        return this.hours;
    }
    public int getMinuts() {
        return this.minuts;
    }
    public int getSeconds() {
        return this.seconds;
    }
    
    public void sum(int h, int m, int s) {
        this.hours += h;
        this.minuts += m;
        this.seconds += s;

        if (this.seconds >= 60) {
            this.minuts += this.seconds / 60;
            this.seconds = this.seconds % 60;
        }
        if (this.minuts >= 60) {
            this.hours += this.minuts / 60;
            this.minuts = this.minuts % 60;
        }
    }

    public void rest(int h, int m, int s) {
        this.hours -= h;
        this.minuts -= m;
        this.seconds -= s;

        if (this.seconds < 0) {
            this.minuts -= this.seconds / 60;
            this.seconds += this.seconds % 60;
        }
        if (this.minuts < 0) {
            this.hours -= this.seconds / 60;
            this.minuts += this.minuts % 60;
        }
    }

    public String toString() {
        return this.hours + "h " + this.minuts + "m " + this.seconds + "s";
    }
}
