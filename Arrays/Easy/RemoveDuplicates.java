
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        int k=removeDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] arr){
        int unique=0;
        for(int i=1;i<arr.length;i++){
            if(arr[unique]!=arr[i]){
               unique++;
               arr[unique]=arr[i];
            }
            
            
        }
        return unique+1;
    }
}
