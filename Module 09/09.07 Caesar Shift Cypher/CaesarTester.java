/*
Rakesh Raj
4/13/25
this code is to encrypt or decrypt a ceasar shift. 
*/
import java.util.*;
public class CaesarTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key=-5;
        while(!(key<=25 && key>=0)){
            System.out.println("Please enter a number between 0 and 25 inclusive to be the key");
            key = in.nextInt();
        }

        
        String EorD="";
        while(!EorD.equalsIgnoreCase("q")){
            System.out.println("Would you like to encrypt or decrypt a message - Enter q to quit");
            EorD = in.next();
            if(EorD.equalsIgnoreCase("q")){
                break;
            }
            else if(EorD.equalsIgnoreCase("encrypt")){
                System.out.println("What would you like to encrypt");
                Encryption encrypt = new Encryption(in.next(), key);
                System.out.println("The decrypted message:\n"+encrypt(encrypt.getAlphabet(), encrypt.getKey()));
            }
            if(EorD.equalsIgnoreCase("Decrypt")){
                System.out.println("What would you like to decrypt");
                Decryption decrypt = new Decryption(in.next(), key);
                System.out.println("The decrypted message:\n"+decrypt(decrypt.getAlphabet(), decrypt.getKey()));
            }        
        }
        

    }
    public static String encrypt(String phrase, int key){
        String alphabet = "";
        int j;
        for(int i=0;i<phrase.length();i++){
            if(phrase.substring(i, i+1).compareToIgnoreCase("")>0&&phrase.substring(i, i+1).compareToIgnoreCase("X")<0){
                j = phrase.charAt(i);
                if(j+key>122){
                    alphabet+=(char)(j+key-97);
                }
                else{
                    alphabet += (char)(j+key);
                }
                
            }
        }

        return alphabet;
    }

    public static String decrypt(String phrase, int key){
        String alphabet = "";
        int j;
        for(int i=0;i<phrase.length();i++){
            if(phrase.substring(i, i+1).compareToIgnoreCase("")>0&&phrase.substring(i, i+1).compareToIgnoreCase("X")<0){
                j = phrase.charAt(i);
                if(j-key<97){
                    alphabet+=(char)(j-key+26);
                }
                else{
                    alphabet += (char)(j-key);
                }
                
            }
        }

        return alphabet;
    }

}
