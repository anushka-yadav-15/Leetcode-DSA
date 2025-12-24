class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] con = new int[nums.length*2];
        for(int i = 0; i< nums.length ; i++){
            con[i] = nums[i];
            con[i+nums.length] = nums[i];
        }
        return con;
        
    }
}
