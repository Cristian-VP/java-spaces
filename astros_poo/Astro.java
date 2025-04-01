class Astro{
    private String name;
    private Double radio, rotacion, masa, temperatura, gravedad;
  
    public Astro(String name, Double radio, Double rotacion, Double masa, Double temperatura, Double gravedad){
      this.name = name;
      this.radio = radio;
      this.rotacion = rotacion;
      this.masa = masa;
      this.temperatura = temperatura;
      this.gravedad = gravedad;
    }
  
    public void printInfoAstro(){
      System.out.println("El astro tiene un radio de:"+radio+" y tiene una velocidad de rotación de "+rotacion+", está formado por una masa de: "+masa+" y en su superficie existe una temperatura de: "+". Por ultimo la gravedad en el planeta es de: "+gravedad);
    }
  
    public String getName(){return name;}
    public Double getRadio(){return radio;}
    public Double getRotacion(){return rotacion;}
    public Double getMasa(){return masa;}
    public Double getTemperatura(){return temperatura;}
    public Double getGravedad(){return gravedad;}
  
    public void setName(String name){this.name = name;}
    public void setRadio(Double radio){ this.radio = radio;}
    public void setRotacion(Double rotacion){ this.rotacion = rotacion;}
    public void setMasa(Double masa){this.masa = masa;}
    public void setTemperatura(Double temp){this.temperatura = temp;}
    public void setGravedad(Double gravedad){this.gravedad = gravedad;}
  }