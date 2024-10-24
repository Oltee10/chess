package src.main;

public abstract class Piece {
    protected boolean color;
    protected int x, y;

    public Piece(boolean color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public String getColor() {
        return color ? "Blanco" : "Negro";
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String toString();
    public abstract void movePiece(int newX, int newY);
    
}