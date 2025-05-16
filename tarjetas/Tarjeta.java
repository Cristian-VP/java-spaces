package tarjetas;

/**
 *  void gasta(double cantidad);
    double getSaldo();
    void setSaldo(double saldo);
    String toString();
 */

public class Tarjeta implements Cuenta {
    private double saldo;
    private int cuenta;

    public Tarjeta(double saldo) {
        this.saldo = saldo;
        this.cuenta = 00000;
    }

    public void setCuenta(int cuenta) {
        if (cuenta > 0) {
            this.cuenta = cuenta;
        } else {
            System.out.println("El número de cuenta no puede ser negativo");
        }
    }

    public int getCuenta() {
        return cuenta;
    }
    
    public void setSaldo(double saldo) {
        if(saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void gasta(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No tienes suficiente saldo" + " para gastar " + cantidad + "€");
        } else {
            saldo -= cantidad;
        }
    }
    /**Tarjeta nº 67324 – Saldo 100.00€ */

    public String toString() {
        return "Tarjeta nº " + this.cuenta + " – Saldo " + getSaldo() + "€";
    }
}
