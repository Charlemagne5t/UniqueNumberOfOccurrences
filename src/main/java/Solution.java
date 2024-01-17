import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            int c = map.getOrDefault(x, 0);
            c++;
            map.put(x, c);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(set.contains(e.getValue())){
                return false;
            }
            set.add(e.getValue());
        }
        return true;
    }
}
