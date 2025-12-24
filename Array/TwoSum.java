import java.util.*;
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i =0; i<nums.length ; i++){
            int num = nums[i];
            int num2 = target - num;

            if(map.containsKey(num2)){
                return new int[] {map.get(num2),i};
            }
            map.put(num,i);
        }
        return new int[] {};
        
    }
}
