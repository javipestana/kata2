package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if(!histogram.containsKey(j)){
                histogram.put(j, 0);
            }
            histogram.put(j, (histogram.get(j)+1));
    
        }
        for (int key : histogram.keySet()) {
            System.out.println(key + "--> "+histogram.get(key));
        }
    }    
}
