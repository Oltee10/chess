package src.ui;

import java.util.Scanner;

public class Menu {

    public void displayMenu() {
        System.out.println("Bienvenido al juego de Ajedrez");
        System.out.println("Elige un modo de juego:");
        System.out.println("1. Modo Local");
        System.out.println("2. Modo Online");
        System.out.println("3. Contra la CPU");
        System.out.println("4. Salir");
        System.out.print("Elección: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Has seleccionado el Modo Local.");
                // Aquí iría el código para iniciar una partida local
                break;
            case 2:
                System.out.println("Has seleccionado el Modo Online.");
                // Aquí iría el código para iniciar una partida online
                break;
            case 3:
                System.out.println("Has seleccionado el Modo Contra la CPU.");
                // Aquí iría el código para jugar contra la CPU
                break;
            case 4:
                System.out.println("Saliendo del juego...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                displayMenu(); // Vuelve a mostrar el menú si la opción no es válida
        }
        scanner.close();
    }
}