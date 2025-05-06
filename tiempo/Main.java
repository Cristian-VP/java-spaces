package tiempo;

public class Main {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 40, 50);
        
        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);
        
        t1.sum(0, 30, 40);
        System.out.println("Tiempo 1 después de sumar 30m y 40s: " + t1);
        
        t2.rest(0, 20, 30);
        System.out.println("Tiempo 2 después de restar 20m y 30s: " + t2);
    }
}
