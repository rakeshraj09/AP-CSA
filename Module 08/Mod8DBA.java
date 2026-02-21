/*
Rakesh Raj
3/26/25
*/
import java.util.*;

public class Mod8DBA {
    public static int[][] calcMagicMath (int[] rowH, int[] colH){
        int numC = colH.length + 1;
        int numR = rowH.length;
        int n = (int)(Math.random()*28) + 3;
        int[] newColH = new int[numC];
        for(int i = 0; i < numC-1; i++) {
            newColH[i] = colH[i];
        }
        newColH[numC-1] = n;

        int[][] matrix = new int[numR][numC];
        for(int col = 0; col < numR; col++) {
            for(int row = 0; row < numC; row++) {
                matrix[row][col] = rowH[col] * newColH[row];
            }
            System.out.println();
        }

        return matrix;
    }

    public static ArrayList<Integer> oddNumbers(int[][] twoD){
        ArrayList<Integer> oddNums = new ArrayList<Integer>();
        for(int col = twoD[0].length - 1; col > 0; col--) {
            for(int row = 0; row < twoD.length; row++) {
                if(twoD[row][col] % 2 == 1) {
                    oddNums.add(twoD[row][col]);
                }
            }
        }

        return oddNums;
    }
}
