public class Pond extends Terrain {
    private int length, width, numFish;
    public Pond(int l, int w, int numFish){
        super(l, w);
        length = l;
        width = w;
        this.numFish = numFish;
    }

    public String getPondSize()
    {
        return "Pond has dimensions " + length + " X " + width + " and has " + numFish+ " fish.";
    }
}
