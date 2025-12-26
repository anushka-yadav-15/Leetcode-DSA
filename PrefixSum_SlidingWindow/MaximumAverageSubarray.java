class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i =0;
        int j = i+k-1;
        double sum = 0;

        for(int y = i ; y<= j; y++){
            sum += nums[y];
        }
        i++;
        j++;

        double avg = sum/k ;
        while(j<nums.length){
            sum = sum - nums[i-1] +nums[j];
            double nowavg = sum/k;

            avg = Math.max(avg, nowavg);
            i++;
            j++;
        }
        return avg;
        
    }
}
