// class Solution {
//     public double myPow(double x, int n) {
//         double num;
//         num = Math.pow(x,n);
//         return num;
        
//     }
// }

// class Solution {
//     public double myPow(double x, int n) {
//         if(n == 0){
//             return 1;
//         }

//         if(n < 0 ){
//             return 1/myPow(x,-n);
//         }

//         return x * myPow(x, n-1);

//     }
// }

class Solution {
    public double myPow(double x, int n) {
        double num = 1 ;
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }

        long i = n;
        if(i < 0){
            i = -i;
        }

        // while(i >0){
        //     num *= x;
        //     i--;
        // }
        while(i>0){
            if((i & 1) == 1){
                num *= x;
            }

            x *= x;
            i >>= 1;
        }

        if( n < 0){
            return 1/num;
        }
        return num;

    }
}