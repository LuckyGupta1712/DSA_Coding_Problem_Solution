import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        System.out.println(missingNumber(arr));
    }
    public static int findMissingNumber(int[] arr){
        int n=arr.length+1;
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor1^=arr[i];
        }
        for(int i=1;i<=n;i++){
            xor2^=i;
        }
        return xor1^xor2;
    }
}
