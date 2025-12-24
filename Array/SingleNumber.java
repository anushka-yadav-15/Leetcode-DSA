// class Solution {
//     public int singleNumber(int[] nums) {
        
//         for(int i = 0; i<nums.length ; i++){
//             int j = i+1;
//             while(j<n && nums[i]!=nums[j]){
//                 j++;
//             }
//             if(j==n){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }
// XOR(a^a=0 a^0=a)

class Solution {
    public int singleNumber(int[] nums) {
        int n= 0;

        for(int i =0; i<nums.length ; i++){
            n ^= nums[i];
        }
        return n;
    }
}
