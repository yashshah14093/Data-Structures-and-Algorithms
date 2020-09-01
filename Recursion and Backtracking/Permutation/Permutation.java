import java.util.*;

class Permutation {
    
    int n;
    List<List<Integer>> permutation = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    
    public void generatePermutations(ArrayList<Integer> perm, int[] nums){
        
        if(perm.size() == n){
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++)
                a.add(perm.get(i));
            permutation.add(a);
            return;
        }
        
        for(int i=0;i<n;i++)
            if(map.getOrDefault(nums[i],0) == 0){
                perm.add(nums[i]);
                map.put(nums[i],1);
                generatePermutations(perm,nums);
                perm.remove(perm.size() - 1);
                map.put(nums[i],0);
            }  
    }
    
 
   
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        generatePermutations(new ArrayList<Integer>(), nums);
        return permutation;
    }

}
