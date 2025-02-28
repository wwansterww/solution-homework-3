import java.util.List;
import java.util.Scanner;

public class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int currentRoom = 0;

        while (currentRoom < rooms.size()) {
            Room room = rooms.get(currentRoom);
            System.out.println(room.getDescription());

            if (room.getDescription().contains("you fell into the abyss")) {
                System.out.println("Game Over.");
                break;
            }

            if (room.getDescription().contains("you got into a fight with an ogre whom you barely defeated and got some treasure ")) {
                System.out.println("Congratulations!");

            }

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("next")) {
                currentRoom++;
            } else if (input.equalsIgnoreCase("left")) {
                currentRoom = 4;
            } else if (input.equalsIgnoreCase("right")) {
                currentRoom = 2;
            }
            if (currentRoom == 3){
                System.out.println("You fell into the abyss. Game Over.");
                break;
            }


        }

    }
}