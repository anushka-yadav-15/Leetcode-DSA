import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int j = k -1;
        
        List<Integer> list = new ArrayList<>();

        while(j<nums.length){
            int max = Integer.MIN_VALUE;
            
            for(int y =i; y<= j ; y++){
                max = Math.max(max, nums[y]);
            }
            list.add(max);
            i++;
            j++;
        }
        int[] result = new int[list.size()];
        for(int x = 0; x<list.size() ; x++){
            result[x] = list.get(x);
        }

        return result;
    }
}
