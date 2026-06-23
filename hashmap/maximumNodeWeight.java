package hashmap;
import java.util.HashMap;
import java.util.Map;
public class maximumNodeWeight {
    // Code to find the node which has the maximum weight where weight of a node is defined as the sum of the indices of the nodes that point to it. 
    // The exits array represents the directed edges in a graph, where exits[i] is the node that node i points to. 
    // The function should return the index of the node with the maximum weight. 
    // If there are multiple nodes with the same maximum weight, return the one with the largest index.
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
