package Week1.ppa1;
import java.util.ArrayList;
import java.util.List;

public class twinPrimes {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static List<int[]> Twin_Primes(int n,int m){
        List<int[]> twinPrimes = new ArrayList<>();

        for(int i=n;i<=m-2;i++){
            if(isPrime(i) && isPrime(i+2)){
                twinPrimes.add(new int[]{i,i+2});
            }
        }
        return twinPrimes;
    }
    public static void main(String[] args){
        int n=1;
        int m=20;

        List<int[]> twinPrimes = Twin_Primes(n, m);

        for(int[] pair : twinPrimes){
            System.out.println("("+pair[0]+","+pair[1]+")");
        }
    }
}
