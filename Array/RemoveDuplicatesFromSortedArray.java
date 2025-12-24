// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i = 0;
//         int j = i+1;
//         int k =0;
//         while( i < nums.length && j< nums.length){
//             if(nums[i] != nums[j]){ 
//                 if(k==0 || nums[k-1] != nums[i]){
//                     nums[k++] = nums[i];
//                     i++;
//                     j++;
//                 }
//             }
//             else{
//                 i++;
//                 j++;
//             }

//         }
//         if(k == 0 || nums[k-1] != nums[i-1]){
//             nums[k++] = nums[i-1];
//         }
//         return k;
        
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int k = 0;
        nums[k++] = nums[0];

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[k++] = nums[j];   
                i = j;
            }
            j++;
        }
        return k;
    }
}

