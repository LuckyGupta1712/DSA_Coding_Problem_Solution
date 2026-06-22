package hashmap_problems;
import java.util.HashMap;
import java.util.Map;
public class maximumNodeWeight {
    public int maxWeightCell(int[] exits) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<exits.length;i++){
            map.put(i,0);
        }
        for(int i=0;i<exits.length;i++){
            map.put(exits[i],map.getOrDefault(exits[i],0)+i);
        }
        int maxWeightIndex=0;
        for(int i=0;i<exits.length;i++){
            if(map.get(i)>=map.get(maxWeightIndex)){
                maxWeightIndex=i;
            }
        }
        
        return maxWeightIndex;
    }
    public static void main(String[] args) {
        int[] exits = {1, 2, 0, 1};
        maximumNodeWeight solution = new maximumNodeWeight();
        int result = solution.maxWeightCell(exits);
        System.out.println("The cell with the maximum weight is: " + result);
    }
}
