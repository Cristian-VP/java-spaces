package vehiculos_poo;

public class Main {
    /*
    VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
 */

public static void main(String[] args) {

    Coche fiat = new Coche("Fiat", "Punto", 0, "Gasolina");
    Coche peugeot = new Coche("Peugeot", "208", 0, "Gasolina");
    Bici bmxBike = new Bici("BMX", "X1", 0, "Montaña");
    Bici roadBike = new Bici("700cPeugeot", "2-4549", 0, "Carretera");
    
    
    peugeot.setKilometros(100);
    bmxBike.setKilometros(20);
    roadBike.setKilometros(50);

    bmxBike.andar();
    bmxBike.caballito();
    peugeot.andar();
    peugeot.quemaRueda();

    bmxBike.printInfoVehicle();
    peugeot.printInfoVehicle();

    peugeot.setKilometros(200);
    System.out.println("Kilómetros recorridos por el peugeot: " + peugeot.getKilometros());
    System.out.println("Kilómetros recorridos por el fiat: " + fiat.getKilometros());
    System.out.println("Kilometros totales recorridos por los vehiculos: " + Vehiculo.getKilometrosTotales());
    System.out.println("Vehiculos creados: " + Vehiculo.getVehiculosCreados());

    }
}
