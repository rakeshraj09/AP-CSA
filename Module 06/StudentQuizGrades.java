/**
 * @purpose: StudentQuizGrades Object Class
 *
 * @author Rakesh Raj
 * @version 11/11/2024
 *
 */
 
 
public class StudentQuizGrades
{
   private String n;
   private int q1;
   private int q2;

     
   
   //one parameter constructor, all private instance variables initialized
   public StudentQuizGrades(String name) {
      n = name;
      q1 = 0;
      q2 = 0;
   }

   //two parameter constructor
   public StudentQuizGrades(String name, int g1, int g2){
      n = name;
      q1 = g1;
      q2 = g2;

   }
   
   public String getName() {
      return n; 
   }
   
   public double getQ1() {
      return q1;  
   }

   public double getQ2() {
      return q2;  
   }
   
   
   public void setName(String name) {
      n = name;
   }
   
   public void setQ1(int grade) {
      q1 = grade;
   }

   public void setQ2(int grade) {
      q2 = grade;
   }
   

   public double calcDiff()
   {
      return (double)q2 - q1;
   }
   
   //overloaded method
   public double calcAvg()
   {
      return (double)(q1+q2)/2;
   }

   public String toString() {
   
      return String.format("%-10s %-12.1f %-12.1f", getName(), getQ1(), getQ2());  
   }
    
}
