import java.util.Scanner;

// "static void main" must be defined in a public class.
public class CoinChangeTopDown {
    public static void main(String[] args) {
        
        long mod = 1000000000 + 7;

        Scanner sc = new Scanner(System.in);
        
        int n,x;
        n = sc.nextInt();
        int[] coins = new int[n];
        
        x = sc.nextInt();
        for(int i=0;i<n;i++)
            coins[i] = sc.nextInt();
    
        long[] dp = new long[x+1];
        dp[0] = 1;
        for(int i = 1; i <= x; i++)
            for(int j : coins)
                if(i - j >= 0)
                    dp[i] = (dp[i]%mod + dp[i - j]%mod)%mod;
        
        System.out.println(dp[x]);
    }
}
