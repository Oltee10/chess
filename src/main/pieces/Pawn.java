package src.main.pieces;

import src.main.Piece;

public class Pawn extends Piece {
    public Pawn(boolean color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void movePiece(int newX, int newY) {
        if (color) { // Si es blanco, se mueve hacia arriba
            if (newX == x - 1 && newY == y /* && NO ESTÁ OCUPADO */) {
                setPosition(newX, newY);
            }

        } else { // Si es negro, se mueve hacia abajo
            if (newX == x + 1 && newY == y) {
                setPosition(newX, newY);
            }
        }
        
    }

    @Override
    public String toString() {
        return "P";
    }
}
