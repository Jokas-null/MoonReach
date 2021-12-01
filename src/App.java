public class App {
    public static int opc;
    public static void main(String[] args) throws Exception {
        Banner banner = new Banner();
        banner.displayBanner();
        info();

        MoonReach controler = new MoonReach();
        controler.createGrid();
        controler.createSpecialCells();

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
                        
                        controler.clearScreen();
                        System.out.print("Write player 1 name: ");
                        String player1 = System.console().readLine();



                        System.out.print("Write player 2 name: ");
                        String player2 = System.console().readLine();
                      

                        controler.movePlayer(0, 0, getFirtsLetter(player1));
                        controler.movePlayer(0, 0, getFirtsLetter(player2));
                        controler.printGrid();
                        
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

    public static String getFirtsLetter(String name){
        String x = name.toUpperCase().charAt(0) + name.substring(1, name.length());
        return x.charAt(0) + "";
    }
}