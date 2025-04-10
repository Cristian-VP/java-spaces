package astrosPoo;
import java.util.HashSet;

class SistemaSolar{
    private String name; 
    private HashSet<Planeta> groupPlanet;


    public SistemaSolar(String name){
        this.name = name;
        this.groupPlanet = new HashSet<>();
    }

    public void addPlanets(Planeta bolita){
        groupPlanet.add(bolita);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void printInfoSystem(){
        System.out.println("El sistema "+name+"tiene"+groupPlanet.size()+" planetas");
        for(Planeta planet: groupPlanet){
            System.out.println("El planeta "+planet.getName());
            if(planet.getContieneSat()){
                System.out.println("Tiene "+planet.getSatelites().size()+" satelites asociados");
                for(Satelite sat: planet.getSatelites()){
                    System.out.println("El satelite "+sat.getName());
                }
            }else{
                System.out.println("No tiene satelites asociados");
            }
        }
    }
}