package Week1.grpa1;

import java.util.*;

public class findMinDiff {
    public static int find_min_diff(int[] L,int P){
        Arrays.sort(L);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<L.length - P;i++){
            int currentDiff = L[i+P-1] - L[i];
            if(minDiff>currentDiff){
                minDiff = currentDiff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args){
        // int[] L = {3,4,1,9,56,7,9,12,13};
        int[] L = {3,3,3,3,3,3,3,3,3};
        int P = 4;
        int result = find_min_diff(L,P);
        System.out.println(result);
    }
}
