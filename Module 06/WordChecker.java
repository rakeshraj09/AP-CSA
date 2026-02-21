public class WordChecker
{
    private String [] myWords;
    private int myNumWords;
    private String myTargetWord;
    public WordChecker(String [] words, int numWords, String targetWord)
    {
        myWords = words;
        myNumWords = numWords;
        myTargetWord = targetWord;
    }
    public boolean isWithin()
    {
        for(String word : myWords) {
            if(word.equals(myTargetWord)) {
                return true;
            }
        }
        return false;
    }
    public boolean sameNumber()
    {
        if(myNumWords == myWords.length) {
            return true;
        }
        return false;
    }
    public int totalChar()
    {
        int total = 0;
        for(String word : myWords) {
            total += word.length();
        }
        return total;
    }
}