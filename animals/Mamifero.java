package animals;

class Mamifero extends Animal{
    private String tiempoGestacion;
    private String habla;
    private String accion;
    /*
     *Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario
     */

    public Mamifero(String nombre, String habitat, String tipoAlimentacion, String tiempoGestacion, String habla) {
        super(nombre, habitat, tipoAlimentacion);
        this.tiempoGestacion = tiempoGestacion;
        this.habla = habla;
    }

    public String getTiempoGestacion() {
        return tiempoGestacion;
    }
    public void setTiempoGestacion(String tiempoGestacion) {
        this.tiempoGestacion = tiempoGestacion;
    }
    
    public void setHabla(String habla) {
        this.habla = habla;
    }
    
    public void setAccion(String accion) {
        this.accion = accion;
    }


    @Override
    public void hacerSonido() {
        System.out.println("El "+ super.getNombre() +" hace: "+this.habla+ " para "+this.accion);
    }

    @Override
    public void comer() {
        System.out.println("El "+super.getNombre()+" come: "+super.getTipoAlimentacion());
    }

    @Override
    public void desplazarse() {
        System.out.println("El"+super.getNombre()+"desplaza por: "+super.getHabitat());
    }

    public void printOf() {
        super.printOf();
        System.out.println("Tiempo de gestacion: " + this.getTiempoGestacion());
    }

    public void saltar() {
        System.out.println("Booing Boing");
    }


    
}
