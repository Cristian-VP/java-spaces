package expoCoches;

import java.util.Scanner;
/*
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
 */

 /*
  * El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
  */

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int userChoice;
        Boolean getOut = false;
        Zona ZonaPrincipal = new Zona(1000);
        Zona ZonaCompraVenta = new Zona(200);
        Zona ZonaVIP = new Zona(25);
        

        System.out.println("#############################");
        System.out.println("#       Expocoches          #");
        System.out.println("#       Campanillas         #");
        System.out.println();

        while(!getOut) {
        
       
            System.out.println("Elige la opción deseada:");
            System.out.println("#############################");
            System.out.println("# 1. Mostrar entradas libres   #");
            System.out.println("# 2. Vender entradas           #");
            System.out.println("# 3. Salir                    #");
            System.out.println("#############################");
            System.out.println();
            

            
            userChoice = sc.nextInt();
            
            
            if ((userChoice > 3) && (userChoice < 1)) {
                System.out.println("Opción no válida");
                System.out.println("Elige la opción deseada:");
                userChoice = sc.nextInt();
            } else {
            
                switch (userChoice) {
                    case 1:
                        System.out.println("Entradas disponibles:");
                        System.out.println("Zona principal: " + ZonaPrincipal.getEntradasPorVender());
                        System.out.println("Zona compra-venta: " + ZonaCompraVenta.getEntradasPorVender());
                        System.out.println("Zona VIP: " + ZonaVIP.getEntradasPorVender());
                        break;
                    case 2:
                        System.out.println("¿Qué zona quieres?");
                        System.out.println("1. Zona principal");
                        System.out.println("2. Zona compra-venta");
                        System.out.println("3. Zona VIP");
                        int zona = sc.nextInt();
                        
                        System.out.println("¿Cuántas entradas quieres?");
                        int entradas = sc.nextInt();
                        
                        switch (zona) {
                            case 1:
                                ZonaPrincipal.vender(entradas);
                                break;
                            case 2:
                                ZonaCompraVenta.vender(entradas);
                                break;
                            case 3:
                                ZonaVIP.vender(entradas);
                                break;
                            default:
                                System.out.println("Zona no válida.");
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        getOut = true;
                        break;
                }
            }
            
        }
        sc.close();
        System.out.println("Gracias por usar el programa.");
        System.out.println("Hasta luego.");
    }
}
