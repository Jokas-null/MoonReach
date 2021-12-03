import java.util.Scanner;

public class App {
    public static int opc;
    public static Scanner sc = new Scanner(System.in);
    public static String player1;
    public static String player2;
    public static void main(String[] args) throws Exception {
        //Banner banner = new Banner();
        //banner.displayBanner();
        //info();
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
                     controler.printGrid();
                    break;
                 case 2:
                     int dice = controler.throwDice();
                     int dice2 = controler.throwDice();
                     controler.clearScreen();
     
                     System.out.println("Player "+ player1 + " Dice: " + dice);
                     controler.movePlayer(getFirtsLetter(player1), dice);
     
                     System.out.println("Player "+ player2 + " Dice: " + dice2);
                     controler.movePlayer(getFirtsLetter(player2), dice2);
     
                     controler.printGrid();
                     System.out.println("Press enter to continue");
                        sc.nextLine();
                     controler.clearScreen();
                     menu();
                     break;
                 case 3:
                     System.out.println("Bye!");
                     break;
            
                default:
                    break;
            }
        } while (opc != 3);
        
    }

    public static void info(){
        System.out.println("\t\t\t\t\tUniversidad Catolica de Honduras");
        System.out.println("\t\t\t\t\t\tJose Ed Castro");
        System.out.println("\t\t\t\t\t\tRoque Castillo");
        System.out.println("\t\t\t\t\t\tVersion 1.1");
    }

    public static void menu(){
        System.out.println("1. Display Grid");
        System.out.println("2. Play");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");
        opc = Integer.parseInt(System.console().readLine());
    }

    public static String getFirtsLetter(String name){
        String x = name.toUpperCase().charAt(0) + name.substring(1, name.length());
        return x.charAt(0) + "";
    }
}