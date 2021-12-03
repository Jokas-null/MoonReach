import java.util.Scanner;

public class App {
    public static int opc;
    public static Scanner sc = new Scanner(System.in);
    public static String player1;
    public static String player2;

    public static int index = 0;
    public static int index2 = 0;
    public static void main(String[] args) throws Exception {
        Banner banner = new Banner();
        banner.displayBanner();
        info();
        MoonReach controler = new MoonReach();
        
        System.out.println("Welcome to MooReach");
        System.out.println("Before you start, please input players names");
        System.out.print("Player 1: ");
        player1 = sc.nextLine();
        
        System.out.print("Player 2: ");
        player2 = sc.nextLine();
        
        controler.clearScreen();
        menu();
        
        do {
            switch (opc) {
                case 1:
                        controler.clearScreen();
                        rules();
                        System.out.println("\n");
                        controler.printGrid();
                        System.out.println("Press any key to continue");
                        sc.nextLine();
                        controler.clearScreen();
                        menu();
                        break;
                case 2:
                        int dice = controler.throwDice();
                        int dice2 = controler.throwDice();
                        controler.clearScreen();
     
                        System.out.println("Player "+ player1 + " Dice: " + dice);
                        System.out.println("\n");
                        setPlayer(dice);
                        controler.movePlayer(index, getFirtsLetter(player1));
                        
                        System.out.println("Player "+ player2 + " Dice: " + dice2);
                        System.out.println("\n");
                        setPlayer2(dice2);
                        controler.movePlayer(index2, getFirtsLetter(player2));
                        controler.clearScreen();
                        menu();
                        break;
                case 3:
                        System.out.println("Bye!");
                        break;
            
                default:
                        System.out.println("Invalid option");
                        break;
            }
        } while (opc != 3);
        
    }

    public static void setPlayer(int dice){
        if(index >= 26){
            System.out.println("win");
        }
        else{
            index += dice;
        } 
    }

    public static void setPlayer2(int dice){
        if(index2 >= 26){
            System.out.println("win");
        }
        else{
            index2 += dice;
        } 
    }


    public static void info(){
        System.out.println("\t\t\t\t\tUniversidad Catolica de Honduras");
        System.out.println("\t\t\t\t\t\tJose Ed Castro");
        System.out.println("\t\t\t\t\t\tRoque Castillo");
        System.out.println("\t\t\t\t\t\tVersion 1.1");
    }

    public static void menu(){
        System.out.println("1. How to play?");
        System.out.println("2. Play");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");
        opc = Integer.parseInt(System.console().readLine());
    }

    public static String getFirtsLetter(String name){
        String x = name.toUpperCase().charAt(0) + name.substring(1, name.length());
        return x.charAt(0) + "";
    }

    public static void rules(){
        System.out.println("\t\t\tRULES!!!!");
        System.out.println("\n");
        System.out.println("1. Throw the dice to move the player on the grid");
        System.out.println("2. If you land on a +, you can move to the next box");
        System.out.println("3. If you land on a !, you can move to the previous box");
        System.out.println("4. The 0 box means teleport you only need to reach it to teleport to the next box");
        System.out.println("5. Reach Moon to win");
    }
}