package vehiculos_poo;

public class Coche extends Vehiculo {
    private String tipo;
    
    public Coche(String marca, String modelo, int kilometrosRecorridos, String tipo) {
        super(marca, modelo, kilometrosRecorridos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void quemaRueda(){
    System.out.println("FFFFFIIIIIIIUUUUUUUUUUUUU");
        System.out.println("Quema rueda con el coche");
    }
        
    @Override
    public void andar(){
        System.out.println("Recorre kilometros acelerando con el coche");
        super.incrementarKilometros(super.getKilometros());
    }

    @Override
    public void printInfoVehicle(){
        super.printInfoVehicle();
        System.out.println("Tipo: " + this.getTipo());
    };
}