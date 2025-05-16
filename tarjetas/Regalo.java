package tarjetas;

public interface Regalo {
    TarjetaRegalo fusionar(TarjetaRegalo tarjeta);
    int getCuenta();
    void setCuenta(int cuenta);
}
