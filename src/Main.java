import model.Player;
import repository.PlayerRepository;
import repository.TeamRepository;

import java.util.List;
import java.util.Scanner;


public class Main {

    private static PlayerRepository playerRepository = new PlayerRepository();

    private static void printMainMenu() {
        System.out.println("\n==== SPORTING GOODS STORE ====");
        System.out.println("1. Manage Players (CRUD)");
        System.out.println("2. Manage Customers (CRUD)");
        System.out.println("3. Filter Customers by Location");
        System.out.println("4. Find Customers by Player Season");
        System.out.println("5. Sort a Customer's Players (asc/desc)");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void managePlayers() {
        boolean back = false;
        while (!back) {
//            printPlayerMenu();
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    createPlayer();
                    break;
//                case "2":
//                    listAllPlayers();
//                    break;
//                case "3":
//                    updatePlayer();
//                    break;
//                case "4":
//                    deletePlayer();
//                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PlayerRepository playerRepository;
        TeamRepository teamRepository;
        
            boolean running = true;

            while (running) {
                printMainMenu();
                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        managePlayers();
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

            System.out.println("Exiting application. Goodbye!");
        }



        // ------------------------------------------------------------
        // Player Management
        // ------------------------------------------------------------
      

        private void printPlayerMenu () {
            System.out.println("\n-- Player Menu --");
            System.out.println("1. Create Player");
            System.out.println("2. List All Players");
            System.out.println("3. Update Player");
            System.out.println("4. Delete Player");
            System.out.println("0. Back to Main");
            System.out.print("Choice: ");
        }

        private static void createPlayer() {
            System.out.println("Enter player name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine().trim();

            System.out.println("Enter player price: ");
            double value = Double.parseDouble(scanner.nextLine().trim());

            System.out.println("Position ");
            String position = scanner.nextLine().trim();


            Player p = playerRepository.create(new Player(name, position, (int) value));
            System.out.println("Player created: " + p);
        }

//        private void listAllPlayers () {
//            List<Player> products = controller.listAllPlayers();
//            if (products.isEmpty()) {
//                System.out.println("No products found.");
//            } else {
//                products.forEach(System.out::println);
//            }
//        }
//
//        private void updatePlayer () {
//            System.out.println("Enter player ID to update: ");
//            int id = Integer.parseInt(scanner.nextLine().trim());
//
//            Player existing = controller.findPlayer(id);
//            if (existing == null) {
//                System.out.println("Player not found.");
//                return;
//            }
//
//            System.out.println("Current player: " + existing);
//            System.out.println("Enter new name (leave blank to keep current): ");
//            String name = scanner.nextLine().trim();
//            if (!name.isEmpty()) {
//                existing.setName(name);
//            }
//
//            System.out.println("Enter new price (leave blank to keep current): ");
//            String priceInput = scanner.nextLine().trim();
//            if (!priceInput.isEmpty()) {
//                existing.setPrice(Double.parseDouble(priceInput));
//            }
//
//            System.out.println("Enter new season (leave blank to keep current): ");
//            String seasonInput = scanner.nextLine().trim();
//            if (!seasonInput.isEmpty()) {
//                existing.setSeason(Season.valueOf(seasonInput.toUpperCase()));
//            }
//
//            controller.updatePlayer(existing);
//            System.out.println("Player updated: " + existing);
//        }
//
//        private void deletePlayer () {
//            System.out.println("Enter player ID to delete: ");
//            int id = Integer.parseInt(scanner.nextLine().trim());
//            boolean deleted = controller.deletePlayer(id);
//            if (deleted) {
//                System.out.println("Player deleted.");
//            } else {
//                System.out.println("Player not found.");
//            }
//        
        }


