package astrosPoo;

class Main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 6371.0, 24.0, 5.972e24, 15.0, 9.81, 149.6e6, 365.25, null, null);
        Satelite luna = new Satelite("Luna", 1737.4, 27.3, 7.34767309e22, -53.0, 1.62, 27.3, 384400.0);

        tierra.setAddSatelite(luna);
        tierra.prinfInfoPlaneta();
        luna.prinfInfoSat();
        
        SistemaSolar viaLactea = new SistemaSolar("Vía Láctea");
        viaLactea.addPlanets(tierra);
        viaLactea.printInfoSystem();
    }
  }