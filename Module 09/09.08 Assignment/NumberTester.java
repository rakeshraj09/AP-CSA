/*
Rakesh Raj
04/14/25
this code is to find all primes 
*/

import java.util.*;
public class NumberTester{

    public static void main(String[] args) {
        //takes input for bounds
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a range for me to find primes");
        System.out.println("Enter the low number in the range");
        int low = in.nextInt();
        System.out.println("Enter the highest number in the range");
        int high = in.nextInt();

        //prints all primes and how many
        Number primes = new Number(low, high);
        System.out.println("There are " + primeFinder(primes.getLow(), primes.getHigh()) +" primes between " + primes.getLow()+" and "+ primes.getHigh());

    }

    //this is to find all (and how many) primes in the given interval
    public static int primeFinder(int low, int high){
        int pCount=0, j;
        System.out.println("Here are all primes between " + low + " and " + high + ":");
        for(int i=low; i<=high;i++){
            int count=2;
            for(j=2;j<=Math.sqrt(i);j++){
                count++;
                if(i%j==0){
                    break;
                }
                                
            }
            if(count==j){
                if(!(i==1)){
                    System.out.println(i);
                    pCount++;
                }                
            }            
        }
        return pCount;
    }
}