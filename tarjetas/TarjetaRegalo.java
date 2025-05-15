package tarjetas;

import tarjetas.utils.RandomNumber;

public class TarjetaRegalo extends Tarjeta implements Regalo {
    public TarjetaRegalo(double saldo) {
        super(saldo);
    }

    public void setCuenta(int cuenta) {
        int cuentaAleatoria = RandomNumber.generarNumeroAleatorio();
        super.setCuenta(cuentaAleatoria);
    }

    public int getCuenta() {
        return super.getCuenta();
    }

    /*
     * Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo.
     */
    public TarjetaRegalo fusionar(TarjetaRegalo tarjeta) {
        double miSaldo = super.getSaldo();
        double saldoTarjeta = tarjeta.getSaldo();
        double nuevoSaldo = miSaldo + saldoTarjeta;
        super.setSaldo(0);
        tarjeta.setSaldo(0);
        
        TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(nuevoSaldo);
        nuevaTarjeta.setCuenta(RandomNumber.generarNumeroAleatorio());
        return nuevaTarjeta;
    }
}

