class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i = 0;
        int j = i+1;
        int maxlength = 1;

        while(j<s.length()){
            if(s.substring(i,j).indexOf(s.charAt(j)) != -1){
                i++;
            }
            else{
                int length = j-i+1;
                maxlength = Math.max(maxlength, length);
                j++;

            }

        } 
        return maxlength;
        
    }
}