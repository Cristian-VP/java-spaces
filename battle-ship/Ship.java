import java.util.List;

public class Ship {
    private ShipType type;
    private List<Cordinate> cordinates;
    private List<Cordinate> hitsCordinates;

    
    public Ship(ShipType type, List<Cordinate> cordinates) {
        this.type = type;
        this.cordinates = cordinates;
        this.hits = 0; 
    }
   
    public void registriHit(Cordinate coord) {
        if (cordinates.contains(coord) && !hitsCordinates.contains(coord)) {
            hitsCordinates.add(coord);
        }
    }

    public boolean isSunk() {
        return hits >= type.getSize();
    }

    public List<Cordinate> getCordinates() {
        return cordinates;
    }

    public ShipType getType() {
        return type;
    }
}
