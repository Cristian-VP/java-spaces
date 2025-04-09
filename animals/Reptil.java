package animals;

public class Reptil extends Animal {
    
    public Reptil(String nombre, String habitat, String tipoAlimentacion) {
        super(nombre, habitat, tipoAlimentacion);
    }
    @Override
    public void hacerSonido() {
        System.out.println("El " + super.getNombre() + " hace ");
    }

    @Override
    public void comer() {
        System.out.println("El " + super.getNombre() + " come: " + super.getTipoAlimentacion());
    }
    @Override
    public void desplazarse() {
        System.out.println("El " + super.getNombre() + " se desplaza por: " + super.getHabitat());
    }
    public void escalar() {
        System.out.println("El " + super.getNombre() + " escala");
    }
    public void camuflarse() {
        System.out.println("El " + super.getNombre() + " se camufla");
    }
    
}
