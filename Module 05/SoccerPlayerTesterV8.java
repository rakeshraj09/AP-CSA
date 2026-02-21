/**
 * @purpose: SoccerPlayerV8 object (client class) - uses the default constructor 
 *
 * @author Rakesh Raj
 * @version 09/15/24
 */
 
 
public class SoccerPlayerTesterV8
{
    public static void printPlayer(String name, double goalsPerGame, int goalContributions) {
        System.out.println(name + "\t\t\t" + goalsPerGame + "\t\t\t" + goalContributions);
    }

   public static void main (String[] args) {
       SoccerPlayerV8 soccerPlayer1 = new SoccerPlayerV8();
       SoccerPlayerV8 soccerPlayer2 = new SoccerPlayerV8("Ronaldo", 11, 20, 33);
       SoccerPlayerV8 soccerPlayer3 =  new SoccerPlayerV8("Neymar", 41, 12, 48);
       soccerPlayer1.setGoals(23);
       soccerPlayer1.setAssists(16);
       soccerPlayer1.setGames(40);
       soccerPlayer1.setName("Messi");
       double gpg1 = soccerPlayer1.goalsPerGame(soccerPlayer1.getGoals(), soccerPlayer1.getGames());
       int gc1 = soccerPlayer1.totalGoalContributions(soccerPlayer1.getGoals(), soccerPlayer1.getAssists());
       double gpg2 = soccerPlayer2.goalsPerGame(soccerPlayer2.getGoals(), soccerPlayer2.getGames());
       int gc2 = soccerPlayer2.totalGoalContributions(soccerPlayer2.getGoals(), soccerPlayer2.getAssists());
       double gpg3 = soccerPlayer3.goalsPerGame(soccerPlayer3.getGoals(), soccerPlayer3.getGames());
       int gc3 = soccerPlayer3.totalGoalContributions(soccerPlayer3.getGoals(), soccerPlayer3.getAssists());

       System.out.println("Player\t\tGoals Per Game\t\tTotal Goal Contributions:\n====================================================================\n");
       printPlayer(soccerPlayer1.getName(), gpg1, gc1);
       printPlayer(soccerPlayer2.getName(), gpg2, gc2);
       printPlayer(soccerPlayer3.getName(), gpg3, gc3);
       
   
   }

   
}
