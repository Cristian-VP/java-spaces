package animals;


public class Main {

    public static void main(String[] args) {
        String llamadaComida = "Miiiiaaaauuuuu";
        Mamifero gato = new Mamifero("Gato", "Casa", "Carne", "2 meses", "Miau");
        
        gato.setAccion("llamar la atención");
        gato.hacerSonido();
        gato.setAccion("comer");
        gato.setHabla(llamadaComida);
        gato.hacerSonido();
        gato.comer();

        gato.desplazarse();
        gato.saltar();
        gato.printOf();

    
    }
}
