class Solution {
    public int maxSubArray(int[] nums) {
        // int[] max = new int[nums.length*(nums.length+1)/2];
        // int k = 0;
        // for(int i = 0; i< nums.length ; i++){
        //     int sum = 0;
        //     for(int j =i; j<nums.length; j++){
        //         sum += nums[j];
        //         max[k] = sum;
        //         k++;

        //     }
        // }
        // Arrays.sort(max);
        // return max[max.length -1];
        int currentsum = nums[0];
        int maxsum = nums[0];

        for(int i= 1; i<nums.length ; i++){
            currentsum = Math.max(nums[i] , currentsum + nums[i]);
            maxsum = Math.max(currentsum , maxsum);
        }    
        return maxsum;
        
    }
}
