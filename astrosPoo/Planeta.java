package astrosPoo;

import java.util.HashSet;
import java.util.Set;

class Planeta extends Astro{
    private Double distanciaSol, orbitaSol;
    private Boolean contieneSatelites;
    private Set<Satelite> satelites;
    private Satelite satelite;
  
    public Planeta(String name, Double radio, Double rotacion, Double masa, Double temperatura, Double gravedad, Double distanciaSol, Double orbitaSol, HashSet<Satelite> satelites, Satelite satelite){
      super(name, radio, rotacion, masa, temperatura, gravedad);
      this.distanciaSol = distanciaSol;
      this.orbitaSol = orbitaSol;
      this.satelites = new HashSet<>();
      this.satelite = satelite;
      this.contieneSatelites = false;
    }
  
    public void prinfInfoPlaneta(){
        System.out.println("El planeta"+ super.getName());
        System.out.println("Tiene un radio de: "+super.getRadio());
        System.out.println("Tien una velocidad de  rotacion: "+ super.getRotacion());
        System.out.println("Tiene un masa de : "+super.getMasa());
        System.out.println("Tiene una temperatura de : "+super.getTemperatura());
        System.out.println("Tiene una gravedad de : "+super.getGravedad());
        System.out.println("Tiene una orbita solar  de : "+orbitaSol);
        System.out.println("Tiene una distncia al sol de : "+distanciaSol);
        if(contieneSatelites){
            System.out.println("Tiene "+satelites.size()+" asociados");
            for(Satelite sat: satelites){
                sat.prinfInfoSat();
            }
        } 
    }

    public void setAddSatelite(Satelite sat){
        satelites.add(sat);
        contieneSatelites = true;
    }
    /**
     * this.distanciaSol = distanciaSol;
      this.orbitaSol = orbitaSol;
      this.satelites = new HashSet<>();
      this.satelite = satelite;
      this.contieneSatelites = false;
    */
    public Double getDistanciaSol() {
        return distanciaSol;
    }
    public Double getOrbitaSol() {
        return orbitaSol;
    }
    public Boolean getContieneSat() {
        return contieneSatelites;
    }

    public Set<Satelite> getSatelites(){
        return satelites;
      }

    public void setDistanciaSol( Double disc) {
        this.distanciaSol = disc;
    }

    public void setOrbitaSol(Double orb) {
        this.orbitaSol = orb;
    }

  }