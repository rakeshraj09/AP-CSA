/*
Rakesh Raj
4/13/25
this code is to encrypt or decrypt a ceasar shift. 
*/

public class Encryption{
    final private String alphabet;
    private static int key;
    public Encryption(String alphabet, int key){
        this.alphabet = alphabet;
        this.key = key;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public int getKey() {
        return key;
    }
}