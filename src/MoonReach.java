public class MoonReach {

    public String[] kien = new String[45];{

    kien[0] = "  -  ";
    kien[1] = "  -  ";
    kien[2] = "  -  ";
    kien[3] = "  -  ";
    kien[4] = "  -  ";
    kien[5] = "  -  ";
    kien[6] = "  -  ";
    kien[7] = "  -  ";
    kien[8] = "  -  ";
    kien[9] = "  -  ";
    kien[10] = "  0  ";
    kien[11] = "  0  ";
    kien[12] = "  -  ";
    kien[13] = "  -  ";
    kien[14] = "  -  ";
    kien[15] = "  -  ";
    kien[16] = "  -  ";
    kien[17] = "  -  ";
    kien[18] = "  -  ";
    kien[19] = "  -  ";
    kien[20] = "  -  ";
    kien[21] = "  -  ";
    kien[22] = "  -  ";
    kien[23] = "  -  ";
    kien[24] = "  -  ";
    kien[25] = "  -  ";
    kien[26] = "  -  ";
    kien[27] = "  <-  ";
    kien[28] = "  -  ";
    kien[29] = "  -  ";
    kien[30] = "  -  ";
    kien[31] = "  -  ";
    kien[32] = "  -  ";
    kien[33] = "  -  ";
    kien[34] = "  -  ";
    kien[35] = "  -  ";
    kien[36] = "  -  ";
    kien[37] = "  -  ";
    kien[38] = " x The Moon";
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
        System.out.println("\t\t\t\t\t\t\t"+kien[26]);
        System.out.println("\t\t\t\t\t\t\t"+kien[27]);
        System.out.print(kien[28]);
        System.out.print(kien[29]);
        System.out.print(kien[30]);
        System.out.print(kien[31]);
        System.out.print(kien[32]);
        System.out.print(kien[33]);
        System.out.print(kien[34]);
        System.out.print(kien[35]);
        System.out.print(kien[36]);
        System.out.print(kien[37]);
        System.out.print("\t\t"+kien[38]);
        System.out.print("\n");
    }

    public void movePlayer(String player, int dice){
        if (kien[dice] == kien[0]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[1]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[2]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[3]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[4]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[5]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[6]){
            kien[dice] = "  " + player + " ";
        }else if (kien[dice] == kien[7]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[8]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[9]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[10]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[11]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[12]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[13]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[14]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[15]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[16]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[17]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[18]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[19]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[20]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[21]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[22]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[23]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[24]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[25]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[26]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[27]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[28]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[29]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[30]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[31]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[32]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[33]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[34]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[35]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[36]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[37]){
            kien[dice] = "  " + player;
        }else if (kien[dice] == kien[38]){
            kien[dice] = "  " + player;
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