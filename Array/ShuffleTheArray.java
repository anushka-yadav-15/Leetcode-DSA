class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k =0;

        int i = 0;
        int j = n;
        while(k < nums.length){
            if(k%2 == 0){
                arr[k] = nums[i];
                k++;
                i++;
            }
            else{
                arr[k] = nums[j];
                k++;
                j++;
            }
        }
        return arr;
    }
}
