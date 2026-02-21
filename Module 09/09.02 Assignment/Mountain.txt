public class Mountain extends Terrain {
    private int length, width, numMountains;
    public Mountain(int l, int w, int numMountains){
        super(l, w);
        length = l;
        width = w;
        this.numMountains = numMountains;
    }

    public String getMountainSize()
    {
        return "Land has dimensions " + length + " X " + width + " and has " + numMountains+ " mountains.";
    }
    
}
