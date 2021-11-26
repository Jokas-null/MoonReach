public class MoonReach {
    private String[][] grid;
    private int[][] list = new int[][]{ 
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
}