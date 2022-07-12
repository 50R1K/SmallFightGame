import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Fighter player = new Fighter() {
        };
        Fighter enemy= new Fighter() {
        };


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input1 = "";
        String input2 = "";
        boolean InputChecker = true; // защита от неправильного ввода


        System.out.println("Choose Fighter, 1-Tank, 2-Berserk");
        while (InputChecker){
            input1 = bf.readLine();
            switch (input1) {
                case "1" -> {
                    player = new Tank("You");
                    enemy = new Berserk("Zakhar");
                    InputChecker = false;
                }
                case "2" -> {
                    player = new Berserk("You");
                    enemy = new Tank("Zakhar");
                    InputChecker = false;
                }
                default -> {
                    System.out.println("Wrong input");
                    System.out.println("Choose Fighter, 1-Tank, 2-Berserk");
                }
            }
        }

        while (true){
            System.out.println("Choose where to attack: \n1 - Head,\n2 - Body, \n3 - Smell, \n4 - Legs");
            InputChecker = true;
            while (InputChecker){
                input1 = bf.readLine();
                switch (input1) {
                    case "1", "2", "3", "4" -> InputChecker = false;
                    default -> {
                        System.out.println("Wrong Input");
                        System.out.println("Choose where to attack: \n1 - Head,\n2 - Body, \n3 - Smell, \n4 - Legs");
                    }
                }
            }
            System.out.println("Choose what to defend: \n1 - Head,\n2 - Body, \n3 - Smell, \n4 - Legs");
            InputChecker = true;
            while (InputChecker){
                input2 = bf.readLine();
                switch (input2) {
                    case "1", "2", "3", "4" -> InputChecker = false;
                    default -> {
                        System.out.println("Wrong Input");
                        System.out.println("Choose where to attack: \n1 - Head,\n2 - Body, \n3 - Smell, \n4 - Legs");
                    }
                }
            }
            player.setTactics(Integer.parseInt(input1), Integer.parseInt(input2));
            enemy.setTactics((int)(Math.random() * 4 + 1), (int)(Math.random() * 4 + 1));
            if (!player.attack(enemy)){
                System.out.println("You win");
                break;
            }
            if (!enemy.attack(player)){
                System.out.println("You lose");
                break;
            }
        }
    }
}