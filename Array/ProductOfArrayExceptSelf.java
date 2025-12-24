class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] product = new int[nums.length];
       int left= 1;
       int right = 1;
       for(int i = 0; i<nums.length ;i++){
        product[i] = left;
        left *= nums[i];
       }
       
       for(int j=nums.length -1 ; j >=0 ; j--){
        product[j] *= right;
        right *= nums[j];
       }
       return product;

        
    }
}