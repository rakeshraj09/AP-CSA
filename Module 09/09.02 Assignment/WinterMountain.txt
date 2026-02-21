public class WinterMountain extends Mountain {
    private int length, width, numMountains;
    private double Temp;
    public WinterMountain(int l, int w, int numMountains, double Temp){
        super(l, w, numMountains);
        length = l;
        width = w;
        this.numMountains = numMountains;
        this.Temp = Temp;
    }

    public String getWinterMountainSize()
    {
        return "Winter Mountain Land has dimensions " + length + " X " + width + " and has " + numMountains+ " Mountains and temperature "+ Temp+" degrees.";
    }
    
}

