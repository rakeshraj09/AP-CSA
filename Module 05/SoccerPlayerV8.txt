/**
 * @purpose: SoccerPlayerV8 object (implementation class) - uses the default constructor 
 *
 * @author Rakesh Raj
 * @version 09/15/24
 */
 
 
public class SoccerPlayerV8
{
    int goals;
    int games;
    int assists;
    String name;
   // default constructor
   public SoccerPlayerV8(){
   }
   
   public SoccerPlayerV8(String iName, int iGoals, int iAssists, int iGames){
    goals = iGoals;
    games = iGames;
    assists = iAssists;
    name = iName;
   }

   public double goalsPerGame(int goals, int games)
   {
       double gpg = (int)(100*(double)goals/games)/100.0;
       return gpg;
   }

   public int totalGoalContributions(int goals, int assists) {
    return goals+assists;
   }

   public int getGoals() {
    return goals;
   }

   public int getGames() {
    return games;
   }

   public int getAssists() {
    return assists;
   }

   public String getName() {
    return name;
   }

   public void setGoals(int newGl) {
    goals = newGl;
   }

   public void setGames(int newGm) {
    games = newGm;
   }

   public void setAssists(int newA) {
    assists = newA;
   }

   public void setName(String newN) {
    name = newN;
   }

   
}
