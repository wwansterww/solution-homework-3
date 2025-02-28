public class MUDBuilderDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the dark cave Dark Cave");
        Dungeon dungeon = new SimpleDungeonBuilder()
                .addRoom(new Room("And you see two torches.")) //0
                .addRoom(new Room("If you go to the right, you will get what you want; if you go to the left, you will find peace.")) //1
                .addRoom(new Room("You got into a fight with an ogre whom you barely defeated and got some treasure.")) //2
                .addRoom(new Room("You fell into the abyss. The game is lost.")) //3
                .addRoom(new Room("An empty room...")) //4
                .addRoom(new Room("You have completed the game, congratulations.")) //5
                .build();

        dungeon.startGame();
    }
}