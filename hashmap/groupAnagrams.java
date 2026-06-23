package hashmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams{
    public List<List<String>> groupAnangrams(String[] strs){
        Map<String , List<String>> map=new HashMap<>();
        for(String words:strs){
            char[] chars=words.toCharArray();
            Arrays.sort(chars);
            String key =new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(words);

        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        groupAnagrams obj=new groupAnagrams();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=obj.groupAnangrams(strs);
        System.out.println(result);
    }
}