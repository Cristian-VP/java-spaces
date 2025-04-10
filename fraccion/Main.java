package fraccion;

public class Main {
 

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2, 3);
        Fraccion f2 = new Fraccion(4, 5);
        Fraccion f3 = new Fraccion(6, 7);

        System.out.println("Fracción 1: " + f1.getNumerador() + "/" + f1.getDenominador());
        System.out.println("Fracción 2: " + f2.getNumerador() + "/" + f2.getDenominador());
        System.out.println("Fracción 3: " + f3.getNumerador() + "/" + f3.getDenominador());

        f1.invierte();
        System.out.println("Fracción 1 invertida: " + f1.getNumerador() + "/" + f1.getDenominador());

        f1.multiplica();
        f1.divide();
    }
}
