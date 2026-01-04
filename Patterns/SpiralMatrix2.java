class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;

        int[][] result = new int[n][n];

        int num =1;

        while(left <= right && top <= bottom){
            for(int i = left; i<= bottom ; i++){
                result[top][i] = num++;
            }
            top++;

            for(int j = top; j<= bottom ; j++){
                result[j][right] = num++;
            }
            right--;

            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    result[bottom][i] = num++;
                }
                bottom--;
            }

            if(left <= right){
                for(int j = bottom ; j >= top ; j--){
                    result[j][left] = num++;
                }
                left++;
            }
        }
        return result;
        
    }
}