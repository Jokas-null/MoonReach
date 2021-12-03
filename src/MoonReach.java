import java.util.Scanner;

public class MoonReach {
    public Scanner sc = new Scanner(System.in);
    public String[] kien = new String[26];{

    kien[0] = "  -  ";
    kien[1] = "  -  ";
    kien[2] = "  -  ";
    kien[3] = "  +  ";
    kien[4] = "  -  ";
    kien[5] = "  -  ";
    kien[6] = "  +  ";
    kien[7] = "  -  ";
    kien[8] = "  -  ";
    kien[9] = "  !  ";
    kien[10] = "  0  <-- Teleport!!!!!";
    kien[11] = "  0  ";
    kien[12] = "  -  ";
    kien[13] = "  -  ";
    kien[14] = "  -  ";
    kien[15] = "  +  ";
    kien[16] = "  -  ";
    kien[17] = "  -  ";
    kien[18] = "  -  ";
    kien[19] = "  !  ";
    kien[20] = "  -  ";
    kien[21] = "  -  ";
    kien[22] = "  -  ";
    kien[23] = "  !  ";
    kien[24] = "  -  ";
    kien[25] = "  X  You Win!";
    }
    
    public void printGrid(){
        System.out.print(kien[0]);
        System.out.print(kien[1]);
        System.out.print(kien[2]);
        System.out.print(kien[3]);
        System.out.print(kien[4]);
        System.out.print(kien[5]);
        System.out.print(kien[6]);
        System.out.print(kien[7]);
        System.out.print(kien[8]);
        System.out.print(kien[9]);
        System.out.println(kien[10]);
        System.out.println(kien[11]);
        System.out.println(kien[12]);
        System.out.println(kien[13]);
        System.out.print(kien[14]);
        System.out.print(kien[15]);
        System.out.print(kien[16]);
        System.out.print(kien[17]);
        System.out.print(kien[18]);
        System.out.print(kien[19]);
        System.out.print(kien[20]);
        System.out.print(kien[21]);
        System.out.print(kien[22]);
        System.out.print(kien[23]);
        System.out.println(kien[24]);
        System.out.println("\t\t\t\t\t\t\t"+kien[25]);
    }

    public void movePlayer(int index, String player){
        if(index == 0){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 1){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 2){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 3){
            if(kien[index].equals("  +  ")){
                kien[index + 1] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to next box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index + 1] = "  -  ";
            }
        }else if(index == 4){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 5){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 6){
            if(kien[index].equals("  +  ")){
                kien[index + 1] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to next box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index + 1] = "  -  ";
            }
        }else if(index == 7){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 8){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 9){
            if(kien[index].equals("  !  ")){
                kien[index - 1] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to previous box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index - 1] = "  -  ";
            }
        }else if(index == 10){
            if(kien[index].equals("  0  <-- Teleport!!!!!")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  0  <-- Teleport!!!!!";
            }
        }else if(index == 11){
            if(kien[index].equals("  0  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  0  ";
            }
        }else if(index == 12){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 13){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 14){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 15){
            if(kien[index].equals("  +  ")){
                kien[index + 1] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to next box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index + 1] = "  -  ";
            }
        }else if(index == 16){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 17){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 18){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 19){
            if(kien[index].equals("  !  ")){
                kien[index - 1] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to previous box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index - 1] = "  -  ";
            }
        }else if(index == 20){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 21){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 22){
            if(kien[index].equals("  +  ")){
                kien[index + 1] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index + 1] = "  +  ";
            }
        }else if(index == 23){
            if(kien[index].equals("  !  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println(player + " Has moved to previous box");
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index == 24){
            if(kien[index].equals("  -  ")){
                kien[index] = "  " + player + "  ";
                printGrid();
                System.out.println("Press Enter to continue");
                sc.nextLine();
                kien[index] = "  -  ";
            }
        }else if(index >= 25){
            
            kien[25] = "  " + player + "  ";
            printGrid();
            System.out.println(player + " Well done! You reached the MOON!");
            System.out.println("Press Enter to continue");
            sc.nextLine();   
            kien[25] = "  -  ";
        }
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int throwDice() {
        return(int) (Math.random() * 6) + 1;
    }
}