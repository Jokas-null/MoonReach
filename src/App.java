public class App {
    public static void main(String[] args) throws Exception {
        //Banner banner = new Banner();
        //banner.displayBanner();
        
        MoonReach controler = new MoonReach();
        controler.createGrid();
        controler.createSpecialCells();
        controler.printGrid();
    }


}