package animals;
/*Crea las clases Animal, Mamifero, Ave, Reptil: Gato, Perro, Canario, Pinguino y Lagarto. 
Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos. */

abstract public class Animal {
    private String nombre;
    private String habitat;
    private String tipoAlimentacion;

    public Animal(String nombre, String habitat, String tipoAlimentacion) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    abstract public void hacerSonido();
    abstract public void comer();
    abstract public void desplazarse();

    public String getNombre() {
        return this.nombre;
    }

    public String getHabitat() {
        return this.habitat;
    }
    
    public String getTipoAlimentacion() {
        return this.tipoAlimentacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitat(String hab) {
        this.habitat = hab;
    }

    public void setTipoAlimentacion(String food) {
        this.tipoAlimentacion = food;
    }

    public void printOf() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Tipo de alimentacion: " + this.getTipoAlimentacion());
    }
}
