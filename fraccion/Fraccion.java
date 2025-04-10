package fraccion;

/*
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void invierte() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    public void multiplica(){
        System.out.println("Multiplicando: " + numerador + " * " + denominador);
        System.out.println("Resultado: " + numerador * denominador);
    }

    public void divide(){
        if(denominador == 0){
            System.out.println("No se puede dividir entre cero");
        }else{
            System.out.println("Dividiendo: " + numerador + " / " + denominador);
            System.out.println("Resultado: " + numerador / denominador);
        }
    }
}
