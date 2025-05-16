/*
 * Las amebas son seres unicelulares de forma cambiante ya que carecen de
pared celular. Fagocitan cualquier cosa que se les pone por delante. Crea la
clase Ameba con el atributo peso, un número entero que indica los microgramos
que pesa el bicho. Al tratarse de una unidad tan pequeña, no se tienen en
cuenta los decimales, será un dato entero. Cuando Dios crea una ameba de la
nada – new Ameba() – su peso es de 3 microgramos. Al comer, va incrementando
su peso; gasta un microgramo en el proceso de fagocitar y el resto hace que
aumente de peso. Por ejemplo, si come una partícula de 6 microgramos – por
ej. miAmeba.come(6) – engordaría 5 microgramos. Una ameba se puede comer
a otra ameba. En este caso, sucede lo mismo que anteriormente, se gasta
un microgramo en el proceso de fagocitado y el resto lo engorda la ameba
que come. Por ejemplo, si una ameba de 7 microgramos se come a una de
4, acaba pesando 10 microgramos. La ameba comida no se destruye sino
que se quedaría con un peso de 0 microgramos, una pena de ameba vamos.
Posteriormente, una ameba comida podría recuperarse si ella misma come
algo. Nótese que el método come está sobrecargado.
 */

public class Ameba implements Ciclo {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }
    
    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        if(peso >= 0) this.peso = peso;
    }

    public void come(int cantidad) {
        if(cantidad > 0) this.peso += cantidad - 1;
    }

    public void come(Ameba ameba) {
        int presa = ameba.getPeso();

        if(presa != 0) {
            this.peso += presa - 1;
            ameba.setPeso(0);
        }
    }

    public String toString() {
        return "Soy una ameba y peso " + getPeso() + " microgramos.";
    }

}
