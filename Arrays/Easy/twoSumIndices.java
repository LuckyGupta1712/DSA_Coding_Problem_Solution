import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] index=twoSumIndices(arr,11);
        System.out.println(index[0]);
        System.out.println(index[1]);
    }
    public static int[] twoSumIndices(int[] arr, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement= target-arr[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] { -1, -1 };
    }
}
