import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String , List<String>> map = new HashMap<>();

        for(int i = 0; i< strs.length; i++){
            String single = strs[i];
            char[] arr = single.toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr);

            if(map.containsKey(sorted) == false){
                List<String> list = new ArrayList<>();
                map.put(sorted,list);
            }
            map.get(sorted).add(single);  

        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> value : map.values()){
            ans.add(value);
        }

        return ans;        
    }
}