import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,5};
        int[] arr2={3,4};
        List<Integer> union = UnionOfSortedArray(arr1, arr2);
        for(int x:union){
            System.out.println(x);
        }
    }
    public static List<Integer> UnionOfSortedArray(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        List<Integer> union = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                    i++;
                }
            }
            else if(arr2[j]<arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                    j++;
                }
            }
        }
        while(i<arr1.length){
            if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                    i++;
            }
        }
        while(j<arr2.length){
            if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                    j++;
            }
        }        
        return union;        
    }   
}
