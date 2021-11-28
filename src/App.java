public class App {
    public static int opc;
    public static void main(String[] args) throws Exception {
        Banner banner = new Banner();
        banner.displayBanner();
        info();

        MoonReach controler = new MoonReach();
        controler.createGrid();
        controler.createSpecialCells();
        controler.printGrid();

        Player player1 = new Player("Jokas");
        Player player2 = new Player("Roque");

        player1.movePlayer(0, 0, "J", "rigth");
        player2.movePlayer(0, 0, "R", "rigth");
        controler.printGrid();

        do{
            menu();
            switch (opc) {
                case 1:
                        controler.clearScreen();
                        controler.printGrid();
                        System.out.println("\n");
                        System.out.print("Press enter to continue...");
                        System.console().readLine();
                    break;
                case 2:
                        /*
                        controler.clearScreen();
                        System.out.println("Write player 1 name: ");
                        Player player1 = new Player(System.console().readLine());
                        player1(0,0,"J","rigth");
                        System.out.println("Write player 2 name: ");
                        Player player2 = new Player(System.console().readLine());*/

                        
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(opc != 3);
    }

    public static void info(){
        System.out.println("\t\t\t\t\tUniversidad Catolica de Honduras");
        System.out.println("\t\t\t\t\t\tJose Ed Castro");
        System.out.println("\t\t\t\t\t\tRoque Castillo");
        System.out.println("\t\t\t\t\t\tVersion 1.1");
    }

    public static void menu() {
        System.out.println("Welcome to MooReach");
        System.out.println("1. Display Grid");
        System.out.println("2. Play");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");
        opc = Integer.parseInt(System.console().readLine());
    }
}