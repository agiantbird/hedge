import java.util.Scanner;

public class Game {
    public static int day = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printDay();
        System.out.println("YOU HAVE SIGNED INTO TERMINALCHAT");
        System.out.println("CREATING CHAT STREAM, PLEASE BE PATIENT. . .");
        // TODO: create a random word generator for these chat streams,
        // adjective + adjective + brain related noun
        System.out.println("CREATED CHAT STREAM IndirectSilentHippocampus!");
        System.out.println("YOU HAVE JOINED CHAT STREAM IndirectSilentHippocampus!");
        System.out.println("CottilardDeLouison HAS JOINED CHAT STREAM IndirectSilentHippocampus!");
        System.out.println("-----------");
        System.out.println("");
        System.out.println("CottilardDeLouison: Hey! Are you there?");
        System.out.println(".....");
        while(true) {
            System.out.println("1. Reply that you are there");
            System.out.println("2. Do not reply");
            System.out.print("> ");
            String response = scanner.nextLine();
            if (response.trim().equals("1")) {
                System.out.println("CottilardDeLouison: Thank god, I'm kind of losing my marbles here lol");
                break;
            }
            System.out.println(response);
            System.out.println("CottilardDeLouison: . . . come on please tell me you're not AFK . . . ");
        }
        incrementDay();
        printDay();
    }

    public static void incrementDay() {
        day += 1;
    }

    public static void printDay() {
        System.out.println("-----------");
        System.out.println("DAY: " + day);
        System.out.println("-----------");
    }
}
