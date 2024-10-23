package src.main;

public class Board {
    public static final int NUM_FILAS = 8;
    public static final int NUM_COLUMNAS = 8;

    private Piece[][] board = new Piece[NUM_FILAS][NUM_COLUMNAS];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < NUM_FILAS; i++) {
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                board[i][j] = null;
            }
        }
    }

    public void showBoard() {
        // Imprimir encabezados de columnas
        System.out.print("   ");
        for (int j = 0; j < NUM_COLUMNAS; j++) {
            // Convertir el índice de columna a letra (a, b, c, ...)
            char columnLabel = (char) ('a' + j);
            System.out.print(columnLabel + "  ");
        }
        System.out.println();
        System.out.println();

        // Imprimir filas con etiquetas
        for (int i = 0; i < NUM_FILAS; i++) {
            // Imprimir etiqueta de fila (1, 2, 3, ...)
            System.out.print((i + 1) + "  ");

            for (int j = 0; j < NUM_COLUMNAS; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}