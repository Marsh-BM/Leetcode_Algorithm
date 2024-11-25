import java.util.HashMap;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // HashMap的字符串放进去
        HashMap<Character,Integer> magazineHashMap = new HashMap<>();
        for (char character : magazine.toCharArray()) {
            magazineHashMap.put(character, magazineHashMap.getOrDefault(character, 0)+1);
        }
        // 检查ransomNote中放入对应的
        for (char r : ransomNote.toCharArray()) {
            int count = magazineHashMap.getOrDefault(r, 0);
            if(count==0){
                return  false;
            }else{
                magazineHashMap.put(r, count-1);
            }
            
        }
        return true;  
    }
}
