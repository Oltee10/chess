package src.main;

import src.main.pieces.*;

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
        board[6][0] = new Pawn(true, 6, 0);
        board[6][1] = new Pawn(true, 6, 1);
        board[6][2] = new Pawn(true, 6, 2);
        board[6][3] = new Pawn(true, 6, 3);
        board[6][4] = new Pawn(true, 6, 4);
        board[6][5] = new Pawn(true, 6, 5);
        board[6][6] = new Pawn(true, 6, 6);
        board[6][7] = new Pawn(true, 6, 7);
/**
 * IMPORTANTE
 * PARA MOVER UNA FICHA ES D4, E7, A1...
 */

        board[5][1] = new Pawn(false, 5, 1);
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
                if (board[i][j] == null) {
                    System.out.print("■  ");
                } else {
                    System.out.print(board[i][j] + "  ");

                }
            }
            System.out.println();
            System.out.println();
        }
    }
}