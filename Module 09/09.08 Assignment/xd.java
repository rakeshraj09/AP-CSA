import java.util.*;
public class xd{

    public static int mystery(int n)
    {
         if (n >= 3)
         {
              return mystery(n - 1) + 2;
         }
    
         return n + 1;
    }
    public static void main(String[] args) {

        System.out.println(mystery(5));
    }
}