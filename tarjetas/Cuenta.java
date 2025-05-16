package tarjetas;

public interface Cuenta {
    void gasta(double cantidad);
    double getSaldo();
    void setSaldo(double saldo);
    String toString();
}
