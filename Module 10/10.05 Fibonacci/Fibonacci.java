/*
this code is to find fibonacci terms
Rakesh Raj
5/3/2025
*/
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "";
        
        while(true){
            System.out.println("Please enter which fibonacci number you want (within the range 0-46) or enter q to quit");
            a = in.next();
            if(a.equalsIgnoreCase("q")){
                System.out.println("Program terminated.");
                break;
            }
            else if(Integer.parseInt(a)< 0 || Integer.parseInt(a)>46){
                System.out.println("Please enter a number in the given range.");
            }
            else {
                System.out.println("The Fibonacci number is: " + fibonacci(Integer.parseInt(a)));
            }
        }
        
    }

    public static int fibonacci(int a){
        if(a==0){
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else {
            return fibonacci(a-1)+ fibonacci(a-2);
        }
        
    }
}
