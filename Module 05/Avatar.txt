public class Avatar
{
    String name;
    int level;
    
    public Avatar(String myName, int myLevel) {
        name = myName;
        if(myLevel >= 0) {
            level = myLevel;
        }
    }
    
    public void setName(String newName) {
        name = newName;
    }
    public void setLevel(int levelChng) {
        level += levelChng;
        if(level < 0) {
            level = 0;
        }
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

}