package astrosPoo;

public class Satelite extends Astro {
    private String name;
    private Double radio, rotacion, masa, temperatura, gravedad, traslacionSatelite, distanciaPlaneta;
  
    public Satelite(String name, Double radio, Double rotacion, Double masa, Double temperatura, Double gravedad, Double traslacionSatelite, Double distanciaPlaneta){
      super(name, radio, rotacion, masa, temperatura, gravedad);
      this.traslacionSatelite = traslacionSatelite;
      this.distanciaPlaneta = distanciaPlaneta;
    }
    
    
    public Double getTraslacion(){
      return traslacionSatelite;
    }
    public void setTraslacion(Double tras){
      this.traslacionSatelite = tras;
    }
    public Double getDistancia(){
      return distanciaPlaneta;
    }
    public void setDistancia(Double dis){
      this.distanciaPlaneta = dis;
    }
  
    public void prinfInfoSat()
  {
    System.out.println("El satelite"+ super.getName());
    System.out.println("Tiene un radio de: "+ super.getRadio());
    System.out.println("Tien una velocidad de  rotacion: "+ super.getRotacion());
    System.out.println("Tiene un masa de : "+ super.getMasa());
    System.out.println("Tiene una temperatura de : "+ super.getTemperatura());
    System.out.println("Tiene una gravedad de : "+ super.getGravedad());
    System.out.println("Tiene una traslacion  de : "+ traslacionSatelite);
    System.out.println("Tiene una distncia al planeta de : "+((distanciaPlaneta == null) ? "No tiene ningun planeta asociado" : distanciaPlaneta));
  }
  }