

public class Forest extends Terrain{
    private int length, width, numTrees;
    public Forest(int l, int w, int numTrees){
        super(l, w);
        length = l;
        width = w;
        this.numTrees = numTrees;
    }

    public String getForestSize()
    {
        return "Forest and has dimensions " + length + " X " + width + " and has " + numTrees+ " trees.";
    }
    
}