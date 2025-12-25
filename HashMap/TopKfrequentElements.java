import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap< Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        List<Map.Entry< Integer, Integer>> list = new ArrayList<>();

        for(Map.Entry<Integer , Integer> entry : entrySet){
            list.add(entry);
        }

        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i =0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}

//without sorting