
public class Cell {
    private Ship ship;
    private  CellStatus status;

    public Cell() {
        this.ship = null;
        this.status = CellStatus.EMPTY;
    }

    public void placeShip(Ship ship) {
        this.ship = ship;
        this.status = CellStatus.SHIP;
    }

    public void hit() {
        if(ship != null) {
            ship.hit();
            status = CellStatus.HIT;
        }else {
            status = CellStatus.MISS;
        }
    }

    public boolean hasShip() {
        return ship != null;
    }

    public boolean isHit() {
        return status == CellStatus.HIT;
    }

    public char display(boolean reveal) {
        if(status == CellStatus.HIT) {
            return 'X';        
        } else if(status == CellStatus.MISS) {
            return 'O';
        } else if(reveal && status == CellStatus.SHIP) {
            return switch(ship.getType()) {
                case ShipType.LANCHA -> 'L';
                case ShipType.BUQUE -> 'B';
                case ShipType.ACORAZADO -> 'Z';
                case ShipType.PORTAVIONES -> 'P';
            };
        } else{
            return '-';
        }
    }
}
