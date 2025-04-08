package animals;

abstract class Mamifero extends Animal{
    private String tiempoGestacion;
    /*
     *Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario
     */

    public Mamifero(String nombre, String habitat, String tipoAlimentacion, String tiempoGestacion) {
        super(nombre, habitat, tipoAlimentacion);
        this.tiempoGestacion = tiempoGestacion;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El mamifero"+ super.getNombre() +"hace: ");
    }
    @Override
    public void comer() {
        System.out.println("El mamifero come: "+super.getTipoAlimentacion());
    }
    @Override


}
