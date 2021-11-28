public class MoonReach {
    String[][] grid;
    int[][] list = new int[][]{ 
        {1, 1}, {1, 2}, {1, 3}, {1, 4},
        {1, 5}, {1, 6}, {1, 7}, {1, 8},
        {2 ,1}, {2 ,2}, {2 ,3}, {2 ,4},
        {2 ,5}, {2 ,6}, {2 ,7}, {2 ,8},
        {3 ,1}, {3 ,2}, {3 ,3}, {3 ,4},
        {3 ,5}, {3 ,6}, {3 ,7}, {3 ,8},
    };

    public void createGrid() {
        grid = new String[5][10];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " O ";
            }
        }
    }

    public void createSpecialCells() {
        for( int[] row : list ) {
            
            grid[ row[0] ][ row[1] ] = " - ";
        }
    }

    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public void movePlayer(int row, int column,String namePlayer, String direction) {
        int dice = throwDice() - 1;
        System.out.println("Dice: " + dice);
        grid[row][column] = namePlayer;
        
        if(direction.equals("rigth")){
            if(grid[row][column] == grid[0][0]){

                if(grid[row][column].equals(" O ")){
                    grid[row][column] = namePlayer;
                }else{
                    grid[row][column] = grid[row][column].charAt(1) + "," + namePlayer.charAt(1);
                }
                
            }else if(grid[row] == grid[0]){
                
                if(grid[row][column + dice] == " O "){
                    grid[row][column + dice] = namePlayer;
                    direction = "rigth";
                }
            }
            
        }else if(direction.equals("left")){
    
            if(grid[row] == grid[4]){

                if(grid[row][column - dice] == " O "){
                    grid[row][column - dice] = namePlayer;
                    direction = "lelf";
                }
            }
    
        }else if(direction.equals("down")){
                    
            if(grid[column] == grid[9]){

                if(grid[row + dice][column] == " O "){
                    grid[row +dice][column] = namePlayer;
                    direction = "down";
                }
            }
        
        }else if(direction.equals("up")){
        
            if(grid[column] == grid[0]){

                if(grid[row + dice][column] == " O "){
                    grid[row + dice][column] = namePlayer;
                    direction = "up";
                }
            }
    
        }else{
            grid[row][column] = grid[row][column].charAt(1) + "," + namePlayer.charAt(1);
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