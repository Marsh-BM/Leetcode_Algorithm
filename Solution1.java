import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{i,hashtable.get(target-nums[i])};
            }
            //把数字作为key，索引作为value
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }


}
