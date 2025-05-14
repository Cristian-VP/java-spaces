package movil;

public enum Tarifa {
    RATA(0.06),
    MONO(0.12),
    BISONTE(0.30);

    private final double costePorMinuto;

    private Tarifa(double costePorMinuto) {
        this.costePorMinuto = costePorMinuto;
    }

    public double getCostePorMinuto() {
        return costePorMinuto;
    }

    
}
