//Exercise 1.12
public class FightSong {
    public static void main(String[] args) {
        printGoTeamGo();
        System.out.println("");
        printVerse();
        printVerse();
        printGoTeamGo();
    }

    public static void printGoTeamGo() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void printYouTheBest() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }

    public static void printVerse() {
        printGoTeamGo();
        printYouTheBest();
        printGoTeamGo();
        System.out.println("");
    }
}

