
import java.util.*;
/**
 * Purpose:  This class prints the results of an election
 *
 * @author Rakesh Raj
 * @version 2/17/25
 */

public class ElectionTesterV8
{
    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Steve Rogers", 4426));
        candidates.add(new Candidate("Peter Parker", 3982));
        candidates.add(new Candidate("Tony Stark", 3225));
        candidates.add(new Candidate("Bruce Banner", 2187));
        candidates.add(new Candidate("Bucky Barnes", 1527));
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

    static void printRawData(List<Candidate> myCandidates) {
        for(int i = 0; i < myCandidates.size(); i++) {
            System.out.printf("%s received %d votes.%n", myCandidates.get(i).getName(), myCandidates.get(i).getVotes());
        }
        System.out.println();
    }

    static int countTotalVotes(List<Candidate> myCandidates) {
        int total = 0;
        for(int i = 0; i < myCandidates.size(); i++) {
            total += myCandidates.get(i).getVotes();
        }
        return total;
    }

    static void printResults(List<Candidate> myCandidates) {
        System.out.println("Candidate       Votes Received       % of Total Votes\n========================================================");
        int total = countTotalVotes(myCandidates);
        for(int i = 0; i < myCandidates.size(); i++) {
            double percentage = 100*myCandidates.get(i).getVotes()/(double)total;
            System.out.printf("%-17s %-26d %.2f %n", myCandidates.get(i).getName(), myCandidates.get(i).getVotes(), percentage);
        }
        System.out.printf("The total number of votes is: %d %n", total);
    }

    static void changeName(List<Candidate> myCandidates, String find, String replacement) {
        for(int i = 0; i < myCandidates.size(); i++) {
            if(myCandidates.get(i).getName().equals(find)) {
                myCandidates.get(i).setName(replacement);
            }
        }
        System.out.printf("<<Changing %s to %s>>%n%n", find, replacement);
    }

    static void changeVotes(List<Candidate> myCandidates, String find, int replacement) {
        for(int i = 0; i < myCandidates.size(); i++) {
            if(myCandidates.get(i).getName().equals(find)) {
                myCandidates.get(i).setVotes(replacement);
            }
        }
        System.out.printf("<<Changing %s votes to %d>>%n%n", find, replacement);
    }

    static void changeNameVotes(List<Candidate> myCandidates, String find, String replacementName, int replacementVotes) {
        for(int i = 0; i < myCandidates.size(); i++) {
            if(myCandidates.get(i).getName().equals(find)) {
                myCandidates.get(i).setName(replacementName);
                myCandidates.get(i).setVotes(replacementVotes);
            }
        }
        System.out.printf("<<Changing %s to %s and votes to %d>>%n%n", find, replacementName, replacementVotes);
    }

    static void insertCandidate(List<Candidate> myCandidates, int pos, String name, int votes) {
        myCandidates.add(pos, new Candidate(name, votes));
        System.out.printf("<<In position %d, add %s, %d votes>>%n%n", pos, name, votes);
    }

    public static void insertCandidateByName(List<Candidate> myCandidates, String find, String name, int votes) {
        int pos = 0;
        for(int i = 0; i < myCandidates.size(); i++)
            if(myCandidates.get(i).getName().equals(find))
                pos = i;

        myCandidates.add(pos, new Candidate(name, votes));

        System.out.printf("<<Before %s, add %s, %d votes>>%n%n", find, name, votes);
    }

    static void deleteCandidate(List<Candidate> myCandidates, int pos) {
        myCandidates.remove(pos);
        System.out.printf("<<Delete position %d>>%n%n", pos);
    }

    static void deleteCandidateByName(List<Candidate> myCandidates, String find) {
        int pos = 0;
        int i;
        for(i = 0; i < myCandidates.size(); i++)
        {
            if((myCandidates.get(i).getName().equals(find)))
            {
                pos = i;
                break;
            }
        }
        if(i != myCandidates.size()) {
            myCandidates.remove(pos);
        }

        System.out.printf("<<Delete %s>>%n%n", find);
    }
}
