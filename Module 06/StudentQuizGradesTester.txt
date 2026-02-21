/**
 * @purpose: Tester to create an array of StudentQuizGrades objects
 *
 * @author Rakesh Raj
 * @version 11/11/2024
 */
 
 
public class StudentQuizGradesTester
{
   
   public static void main (String [] args) {
   
      
       String name1 = "John";
       int jq1 = 84;
       int jq2 = 77;
       
       String name2 = "Mark";
       int mq1 = 91;
       int mq2 = 86;
       
       String name3 = "Sandy";
       int sq1 = 72;
       int sq2 = 75;

       String name4 = "Amelia";
       int aq1 = 95;
       int aq2 = 93;

       String name5 = "Frank";
       int fq1 = 81;
       int fq2 = 94;
       
       StudentQuizGrades[] grades = {new StudentQuizGrades(name1, jq1, jq2), new StudentQuizGrades(name2, mq1, mq2), new StudentQuizGrades(name3, sq1, sq2), new StudentQuizGrades(name4, aq1, aq2), new StudentQuizGrades(name5, fq1, fq2)};
     
       System.out.printf("%s %12s %12s %10s %10s %n", "Student", "Quiz1 Grade", "Quiz2 Grade", "Difference", "Average");
       System.out.println("==========================================================");
       
       //prints the PlanetV10 array of objects using the toString() method
       for(StudentQuizGrades g: grades) {
         double diff = g.calcDiff();
         double avg = g.calcAvg();
         System.out.println(g.toString() + diff + " \t" + avg);
       }
         
   
   
   }
    
    
}
