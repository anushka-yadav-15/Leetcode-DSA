import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean found = false;
        for(int i = 0 ; i< nums.length -1 ; i++){
            if( nums[i] == nums[i+1]){
                found = true;
            }
               
        }
        return found;
        
    }
}

