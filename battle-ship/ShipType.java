
public enum ShipType {
    LANCHA(1),
    BUQUE(3),
    ACORAZADO(4),
    PORTAVIONES(5);
    
    private int size;
    
    private ShipType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
