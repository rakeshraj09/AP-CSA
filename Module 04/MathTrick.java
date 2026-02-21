/**
 * Purpose: Reverse a random number and perform some operations on it.
 * 
 * @author Rakesh Raj
 * @version 07/07/24
 *
 */

public class MathTrick {
	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;
        while(Math.abs(firstDigit-lastDigit) < 2) {
            num = (int)(Math.random()*900 + 100);
            firstDigit = num/100;
            lastDigit = num%10;
        }

		return num;
	}

	public static int reverseDigits (int num) {
        int revNum = 0;
        while(num > 0) {
            revNum*=10;
            revNum+=(num%10);
            num/=10;
        }
        return revNum;
	}

	public static String replaceLtr(String str)
	{
        String replacedString = "";
		for(int i = 0; i < str.length(); i++) {
            String num =  str.substring(i, i+1);
            if(num.equals("0")) {
                replacedString+="Y";
            }
            else if(num.equals("1")) {
                replacedString+="M";
            }
            else if(num.equals("2")) {
                replacedString+="P";
            }
            else if(num.equals("3")) {
                replacedString+="L";
            }
            else if(num.equals("4")) {
                replacedString+="R";
            }
            else if(num.equals("5")) {
                replacedString+="O";
            }
            else if(num.equals("6")) {
                replacedString+="F";
            }
            else if(num.equals("7")) {
                replacedString+="A";
            }
            else if(num.equals("8")) {
                replacedString+="I";
            }
            else {
                replacedString+="B";
            }
        }
			return replacedString;
	}
	
	public static String reverseString(String str) {
		String revString = "";
        for(int i = 0; i < str.length(); i++) {
            revString+=str.substring(str.length()-1-i, str.length()-i);
        }
        return revString;
	}
		
	public static void main(String[] args) 
	{
		int num1 = getRandomNum();
        System.out.println("1. The starting number: " + num1);

        int revNum1 = reverseDigits(num1);
        System.out.println("2. The reversed number: " + revNum1);

        int diff = Math.abs(num1-revNum1);
        System.out.println("3. The difference is: " + diff);

        int revNumAddToDiff = diff+=reverseDigits(diff);
        System.out.println("4. The reversed number added to difference: " + revNumAddToDiff);

        int xMillion = revNumAddToDiff*=1000000;
        System.out.println("5. Number x one million: " + xMillion);

        int subNum = xMillion - 733361573;
        System.out.println("6. Number subtracted and converted to String: " + subNum);

        String replacedStr = replaceLtr(String.valueOf(subNum));
        System.out.println("7. Replaced string: " + replacedStr);

        String revStr = reverseString(replacedStr);
        System.out.println("8. Reversed string: " + revStr);
	} // end main
} // end class