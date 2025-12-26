// class Solution {
//     public int pivotIndex(int[] nums) {

//         for(int i = 0; i<nums.length ; i++){
//             int leftsum = 0;
//             int rightsum = 0;
//             for(int k = 0; k<i ; k++){
//                 leftsum += nums[k]; 
//             }
//             for(int j = i+1 ; j<nums.length ; j++){
//                 rightsum += nums[j];
//             }
//             if(leftsum == rightsum){
//                 return i;
//             }
//         }
//         return -1;
        
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            sum += nums[i];
        }

        int leftsum = 0;
        for(int i = 0; i<nums.length; i++){
            int rightsum = sum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }

            leftsum += nums[i];
        }
        return -1;
        
    }
}
