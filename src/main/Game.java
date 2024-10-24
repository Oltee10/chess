package src.main;

import src.main.players.Player1;
import src.main.players.Player2;

public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player1();
        player2 = new Player2();
    }

    public void displayPlayers() {
        System.out.println("Player 1 color: " + player1.getColor());
        System.out.println("Player 2 color: " + player2.getColor());
    }
}