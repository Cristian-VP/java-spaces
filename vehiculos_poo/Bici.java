package vehiculos_poo;

public class Bici extends Vehiculo {
    private String tipo;
    
    public Bici(String marca, String modelo, int kilometrosRecorridos, String tipo) {
        super(marca, modelo, kilometrosRecorridos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void andar() {
        System.out.println("Recorre kilometros pedaleando con la bicicleta");
        super.incrementarKilometros(super.getKilometros());
    }

    public void caballito() {
        System.out.println("Haciendo el caballito con la bicicleta");
    }

    @Override
    public void printInfoVehicle() {
        super.printInfoVehicle();
        System.out.println("Tipo: " + this.getTipo());
    };
}
