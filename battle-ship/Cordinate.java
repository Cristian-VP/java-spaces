

public abstract class Cordinate {
    private int row;
    private int collumn;

    public Cordinate(int row, int collumn) {
        this.row = row;
        this.collumn = collumn;
    }

    public int getRow() {
        return row;
    }
    public int getCollumn() {
        return collumn;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }   
}
