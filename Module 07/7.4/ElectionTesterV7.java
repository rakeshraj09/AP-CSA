

/**
 * Purpose:  This class prints the results of an election
 *
 * @author Rakesh Raj
 * @version 2/17/25
 */

public class ElectionTesterV7
{
    public static void main(String[] args) {
        Candidate[] candidates = {new Candidate("Steve Rogers", 4426), new Candidate("Peter Parker", 3982), new Candidate("Tony Stark", 3225), new Candidate("Bruce Banner", 2187), new Candidate("Bucky Barnes", 1527)};
        System.out.println("Original Results:\n");
        printResults(candidates);
        changeName(candidates, "Peter Parker", "Wanda Maximoff");
        printResults(candidates);
        changeVotes(candidates, "Bruce Banner", 1988);
        printResults(candidates);
        changeNameVotes(candidates, "Steve Rogers", "Stephen Strange", 4193);
        printResults(candidates);
        insertCandidate(candidates, 2, "Nick Fury", 4822);
        printResults(candidates);
        insertCandidateByName(candidates, "Tony Stark", "Professor X", 3268);
        printResults(candidates);
        deleteCandidate(candidates, 1);
        printResults(candidates);
        deleteCandidateByName(candidates, "Stephen Strange");
        printResults(candidates);
    }

    static void printRawData(Candidate[] myCandidates) {
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i] != null) {System.out.printf("%s received %d votes.%n", myCandidates[i].getName(), myCandidates[i].getVotes());}
        }
        System.out.println();
    }

    static int countTotalVotes(Candidate[] myCandidates) {
        int total = 0;
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i] != null) {total += myCandidates[i].getVotes();}
        }
        return total;
    }

    static void printResults(Candidate[] myCandidates) {
        System.out.println("Candidate       Votes Received       % of Total Votes\n========================================================");
        int total = countTotalVotes(myCandidates);
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i] != null) {
                double percentage = 100*myCandidates[i].getVotes()/(double)total;
                System.out.printf("%-17s %-26d %.2f %n", myCandidates[i].getName(), myCandidates[i].getVotes(), percentage);
            }
        }
        System.out.printf("The total number of votes is: %d %n", total);
    }

    static void changeName(Candidate[] myCandidates, String find, String replacement) {
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i].getName().equals(find)) {
                myCandidates[i].setName(replacement);
            }
        }
        System.out.printf("<<Changing %s to %s>>%n%n", find, replacement);
    }

    static void changeVotes(Candidate[] myCandidates, String find, int replacement) {
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i].getName().equals(find)) {
                myCandidates[i].setVotes(replacement);
            }
        }
        System.out.printf("<<Changing %s votes to %d>>%n%n", find, replacement);
    }

    static void changeNameVotes(Candidate[] myCandidates, String find, String replacementName, int replacementVotes) {
        for(int i = 0; i < myCandidates.length; i++) {
            if(myCandidates[i].getName().equals(find)) {
                myCandidates[i].setName(replacementName);
                myCandidates[i].setVotes(replacementVotes);
            }
        }
        System.out.printf("<<Changing %s to %s and votes to %d>>%n%n", find, replacementName, replacementVotes);
    }

    static void insertCandidate(Candidate[] myCandidates, int pos, String name, int votes) {
        for(int i = myCandidates.length - 1; i > pos; i--)
        myCandidates[i] = myCandidates[i-1];
        myCandidates[pos] = new Candidate(name, votes);

        System.out.printf("<<In position %d, add %s, %d votes>>%n%n", pos, name, votes);
    }

    static void insertCandidateByName(Candidate[] myCandidates, String find, String name, int votes) {
        int pos = 0;
        for(int i = 0; i < myCandidates.length; i++)
            if(myCandidates[i].getName().equals(find))
                pos = i;

        for(int i = myCandidates.length - 1; i > pos; i--) {
            myCandidates[i] = myCandidates[i-1];
            myCandidates[pos] = new Candidate(name, votes);
        }

        System.out.printf("<<Before %s, add %s, %d votes>>%n%n", find, name, votes);
    }

    static void deleteCandidate(Candidate[] myCandidates, int pos) {
        if ((pos > 0) && (pos < myCandidates.length)) {
            for(int i = pos; i < myCandidates.length - 1; i++)
            myCandidates[i] = myCandidates[i+1];
            myCandidates[myCandidates.length-1] = null;
        }

        System.out.printf("<<Delete position %d>>%n%n", pos);
    }

    static void deleteCandidateByName(Candidate[] myCandidates, String find) {
        int pos = 0;
        int i;
        for(i = 0; i < myCandidates.length; i++)
        {
            if((myCandidates[i] != null) && (myCandidates[i].getName().equals(find)))
            {
                pos = i;
                break;
            }
            else if(myCandidates[i] == null)
            {
                pos = -1;
                break;
            }
        }
        if ((i != myCandidates.length) && (pos >= 0))
        {
            for(i = pos; i < myCandidates.length - 1; i++)
            myCandidates[i] = myCandidates[i+1];
            myCandidates[myCandidates.length-1] = null;
        }

        System.out.printf("<<Delete %s>>%n%n", find);
    }
}
