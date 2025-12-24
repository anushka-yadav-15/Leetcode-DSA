// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i = 0; i<nums.length; i++){
//             int count = 0;
//             for(int j= 0; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return -1;

          
//     }
// }

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int count = 1;

//         for(int i = 1; i< nums.length ; i++){
//             if(nums[i] == nums[i-1]){
//                 count++;
//             }
//             else{
//                 count =1;
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return nums[n/2];
//     }
// }
import java.util.HashMap;
// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i = 0; i<nums.length; i++){
//             int count = 0;
//             for(int j= 0; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return -1;

          
//     }
// }

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int count = 1;

//         for(int i = 1; i< nums.length ; i++){
//             if(nums[i] == nums[i-1]){
//                 count++;
//             }
//             else{
//                 count =1;
//             }
//             if(count>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return nums[n/2];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }
}