class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int digits = 0;
        while(temp != 0){
            temp /= 10;
            digits++;
        }

        int result = 0;
        int n = Math.abs(x);
        while(digits > 0){
            int lastdigit = n % 10;
            int placevalue = (int)Math.pow(10,digits-1);
            
            if(lastdigit !=0 && placevalue> Integer.MAX_VALUE/Math.abs(lastdigit)){
                return 0;
            }
            int addValue = lastdigit*placevalue;
            if ((addValue > 0 && result > Integer.MAX_VALUE - addValue) ||
                (addValue < 0 && result < Integer.MIN_VALUE - addValue)) {
                return 0;
            }
            result += addValue;

            n /=10;
            digits--;
        }
        if(x < 0){
            result = -result;
        }
        
        return result;
        
    }
}