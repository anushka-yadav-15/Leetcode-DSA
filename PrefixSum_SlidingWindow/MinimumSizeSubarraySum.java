class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minlength = nums.length+1;

        while(j<nums.length){
            sum += nums[j];

            while(sum >= target){
                int length = j - i + 1;
                minlength = Math.min(minlength, length);

                sum = sum - nums[i];
                i += 1;
            }
            j += 1;
        }

        if(minlength == nums.length+1){
            return 0;
        }
        return minlength;
    }
}