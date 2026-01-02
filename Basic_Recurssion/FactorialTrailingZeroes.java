// only upto n=20
// class Solution {
//     public int trailingZeroes(int n) {
//         if(n<= 2){
//             return 0;
//         }

//         int a = 1;
//         int b = 2;
//         long c = a*b;
//         long multiply;

//         for(int i = 3; i <= n ; i++){
//             multiply = c*i;
//             c = multiply;
//         }
        
//         int zerocount = 0;
//         while(c % 10 == 0){
//             zerocount++;
//             c /= 10;
//         }
//         return zerocount;
//     }
// }

class Solution {
    public int trailingZeroes(int n) {
        if(n == 0){
            return 0;
        }
        
        int zerocount = 0;
        while(n > 0){
            n /= 5;
            zerocount += n;

        }
        return zerocount;
    }
}
