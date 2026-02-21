public class TerrainTester {
    public static void main(String[] args) {
        Terrain terrain = new Terrain(150, 240);
        Forest forest = new Forest(400, 400, 180);
        Mountain mountain = new Mountain(600, 200, 12);
        WinterMountain winMountain = new WinterMountain(500, 500, 30, 12.34);
        Pond pond = new Pond(160, 320, 45);
        WinterPond winpond = new WinterPond(160, 320, 45, 1.9);
        
        System.out.println(terrain.getTerrainSize()+"\n");
        
        System.out.println(forest.getForestSize()+"\n");
        
        System.out.println(mountain.getMountainSize()+"\n");      
        System.out.println(winMountain.getWinterMountainSize()+"\n");
        System.out.println(pond.getPondSize()+"\n");
        System.out.println(winpond.getWinterPondSize()+"\n");
    }
}
