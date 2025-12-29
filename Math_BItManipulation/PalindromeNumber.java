class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int temp = x;
        int digits = 0;
        while(temp != 0){
            temp /= 10;
            digits++; 
        }

        int result = 0;
        int n = x;
        while(digits > 0){
            int lastdigit = n % 10;
            int placevalue = (int)Math.pow(10,digits -1);
            result += lastdigit*placevalue;

            n /= 10;
            digits--;
        }

        if(x == result){
            return true;
        }
        else{
            return false;
        }
        
    }
}
