public class WinterPond extends Pond {
    private int length, width, numFish;
    private double Temp;
    public WinterPond(int l, int w, int numFish, double Temp){
        super(l, w, numFish);
        length = l;
        width = w;
        this.numFish=numFish;
        this.Temp = Temp;
    }

    public String getWinterPondSize()
    {
        return "Winter Pond has dimensions " + length + " X " + width + ", " + numFish+ " fish, and has temp " + Temp +" degrees.";
    }
}
