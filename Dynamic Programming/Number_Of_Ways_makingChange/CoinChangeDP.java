import java.util.Scanner;
import java.util.HashMap;

// "static void main" must be defined in a public class.
public class CoinChangeDP {
    
    static HashMap<Integer,Long> map = new HashMap<Integer,Long>();
    
    public static Long ways(int x,int[] arr){
        if(x<0)
            return Long.valueOf(0);
        if(x == 0)
            return Long.valueOf(1);
        
        if(map.getOrDefault(x,Long.valueOf(-1)) != Long.valueOf(-1))
            return map.get(x);
        
        long sn = 0 ;
        for(int i : arr)
            sn += ways(x-i,arr);
        map.put(x,sn);
        return sn;
    }
    
    
    public static void main(String[] args) {
        
        int n,x;
        long count;
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
