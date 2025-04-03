package vehiculos_poo;


abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private String marca;
    private String modelo;
    private int kilometrosRecorridos;

    public Vehiculo(String marca, String modelo, int kilometrosRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getKilometros() {
        return kilometrosRecorridos;
    }

    public void setKilometros(int kilometros) {
        if (kilometros < 0) {
            System.out.println("Kilómetros no pueden ser negativos");
            return;
        }
        this.kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void incrementarKilometros(int km) {
        kilometrosTotales += km;
    }

    abstract public void andar();


    public void printInfoVehicle(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Kilómetros recorridos: " + this.getKilometros());
    };
    
}
