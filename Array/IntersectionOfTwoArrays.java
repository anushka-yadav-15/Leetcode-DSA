// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int[] temp = new int[Math.min(nums1.length,nums2.length)];
//         int k =0;
//         for(int i = 0; i<nums1.length ; i++){
//             for( int j = 0; j<nums2.length ; j++){
//                 if(nums1[i]==nums2[j]){
//                     if(k==0 || temp[k-1]!=nums2[j]){
//                         temp[k++] = nums2[j];
//                     }
//                     break;

//                 }
//             }
//         }
//         return Arrays.copyOf(temp,k);
        
//     }
// }
import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[Math.min(nums1.length,nums2.length)];
        int k =0;

        int i =0;
        int j =0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                if(k==0 || temp[k-1] != nums2[j]){
                    temp[k++] = nums2[j];
                }
            }
            if(nums2[j] > nums1[i]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOf(temp,k);
        
    }
}