package pizza_order;
/*
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 información sobre el número total de pizzas que se han pedido y que se
 han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
 siguiente código del programa principal debe dar la salida que se muestra
*/
class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    private String tamaño;
    private String tipo;
    private String estado;

    public Pizza(String size, String type) {
        this.tamaño = (size.equals(Tamano.MEDIANA) || size.equals(Tamano.FAMILIAR)) ? size : null;
        this.tipo = (type.equals(Tipo.MARGARITA) || type.equals(Tipo.CUATRO_QUESOS) || type.equals(Tipo.FUNGI)) ? type : null;
        this.estado = Estado.PEDIDA;
        if(getTipo() != null && getTamaño() != null){
            this.estado = Estado.PEDIDA;
            totalPedidas++;
        }else{
            this.estado = null;
            System.out.println("Error: Tamano o Pizza no válida");
        }
    }
    // Getters
    public String getTamaño() {
        return this.tamaño;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getEstado() {
        return this.estado;
    }
    // Setters
    public void setTamaño(String size) {
        this.tamaño = (size.equals(Tamano.MEDIANA) || size.equals(Tamano.FAMILIAR)) ? size : null;
    }
    public void setTipo(String type) {
        this.tipo = (type.equals(Tipo.MARGARITA) || type.equals(Tipo.CUATRO_QUESOS) || type.equals(Tipo.FUNGI)) ? type : null;
    }
    
    public void sirve() {
        if(Estado.SERVIDA.equals(this.estado)){
            System.out.println("Error: Pizza ya servida");
        }else if (getTipo() != null && getTamaño() != null) {
            this.estado = Estado.SERVIDA;
            totalServidas++;
        }
    }
    // Métodos
    public static int getTotalPedidas() {
        return totalPedidas;
    }
    public static int getTotalServidas() {
        return totalServidas;
    }

    // Imprimir
    public void printOut() {
        if(getEstado() == null || getTipo() == null || getTamaño() == null){
            System.out.println("Error: Pizza no válida");
            System.out.println("Tamano o Pizza no válida");
            return;
        }else{
            System.out.println("Gracias por su pedido");
            System.out.println("Tu pizza es de tamaño " + getTamaño() + " y tipo " + getTipo());
            System.out.println("El estado de tu pizza es " + getEstado());
        }
       
    }
}


class Estado {
    public static final String PEDIDA = "pedida";
    public static final String SERVIDA = "servida";
}

class Tipo {
    public static final String MARGARITA = "margarita";
    public static final String CUATRO_QUESOS = "cuatro quesos";
    public static final String FUNGI = "funghi";
}

class Tamano {
    public static final String MEDIANA = "mediana";
    public static final String FAMILIAR = "familiar";
}
