package tarjetas.utils;


public final class RandomNumber {

    private int numero;

    private RandomNumber() {
    }

    public static int generarNumeroAleatorio() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }
}
