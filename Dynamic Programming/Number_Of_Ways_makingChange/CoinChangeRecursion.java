import java.util.Scanner;

// "static void main" must be defined in a public class.
public class CoinChangeRecursion {
    
    public static int ways(int x,int[] arr){
        if(x<0)
            return 0;
        if(x == 0)
            return 1;
        
        int sn = 0 ;
        for(int i : arr)
            sn += ways(x-i,arr);
        return sn;
    }
    
    
    public static void main(String[] args) {
        
        int n,x,count;
        int [] arr;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        x = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
    
        count = ways(x,arr);
        
        System.out.println(count);
        
    }
}
