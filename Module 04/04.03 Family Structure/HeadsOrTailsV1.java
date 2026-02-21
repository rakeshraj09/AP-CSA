/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 *
 * @author Charles Babbage 
 * @version 06/05/17
 */
public class HeadsOrTailsV1
{
	public static void main(String[] args)
	{
	    int stones = 0;
        int purple = 0;
        int yellow = 0;
        while(stones < 20) {
            int prob = (int)(Math.random()*10) + 1;
            if(prob >= 1 && prob <= 4) {purple++;}
            else {yellow++;}
            stones++;
        }
        System.out.println("Number of purple stones: " + purple);
        System.out.println("Number of yellow stones: " + yellow);
    }
}
