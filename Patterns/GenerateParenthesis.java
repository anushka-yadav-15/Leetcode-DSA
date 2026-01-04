import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        parenthesis(s , 0 , 0 , n, list);
        return list;

    }
    void parenthesis(StringBuilder s , int open , int close, int n , List<String> list){

        if(s.length() == 2*n){
            list.add(s.toString());
            return;
        }

        if(open < n){
            s.append('(');
            parenthesis(s , open+1 , close , n, list);
            s.deleteCharAt(s.length() - 1);
        }

        if(close < open){
            s.append(')');
            parenthesis(s , open, close+1 , n , list);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
