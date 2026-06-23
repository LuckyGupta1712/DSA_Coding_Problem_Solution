package hashmap;
import java.util.HashMap;
import java.util.Map;

public class TwoSummer {
    public int[] twoSum(int[] arr,int target){
        int[]  res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                res[0]=map.get(complement);
                res[1]=i;
                return res;
            }
            map.put(arr[i],i);
        }
        return res;
    }  
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        TwoSummer solution=new TwoSummer();
        int[] result=solution.twoSum(arr,target);
        System.out.println("Indices of the two numbers that add up to the target: [" + result[0] + ", " + result[1] + "]");
    }
}
