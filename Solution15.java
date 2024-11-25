
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        //使用双指针算法求解
        int n = nums.length;
        //保证从小到大排序
        Arrays.sort(nums);
        //一个二维数组用于存储最终结果
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //枚举第一个指针a
        for (int first = 0; first < nums.length; first++) {
            //避免读取重复值
            if(first > 0 && nums[first] == nums[first-1]){
                continue;
            }
            //将第三个指针c放到数组的最右侧
            int third = n-1;
            int target = -nums[first];
            for (int second = first + 1;  second <= third; second++) {
                //从first后面一位开始枚举
                if (second > first+1 && nums[second] == nums[second-1]) {
                    continue;
                }
                //保证b在c的前面
                while(second < third && nums[second]+nums[third]>target){
                    third--;
                }
                //如果指针重合，不会存在一个值让b+c=target，因为nums从大到小排序
                if(second == third){
                    break;
                }
                if(nums[second]+nums[third]==target){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
        }
    }
        return ans;
    }
}


