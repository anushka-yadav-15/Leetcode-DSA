class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;   // XOR cancels out duplicates
        }

        return xor;  // result is the unique number
    }
}

