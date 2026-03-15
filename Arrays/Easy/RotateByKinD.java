class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newArr=RotateByKinD(arr,3,"left");
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }        
    }
    public static int[] reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] RotateByKinD(int[] arr, int k, String direction){
        if(arr.length==0 || k==0){
            return arr;
        }
        int n=arr.length;
        k=k%n;
        if(direction.equals("right")){
            reverse(arr, 0,n-1);
            reverse(arr, 0,k-1);
            reverse(arr, k, n-1);
        }
        if(direction.equals("left")){
            reverse(arr, 0,k-1);
            reverse(arr, k, n-1);
            reverse(arr, 0,n-1); 
        }
        return arr;
    }    
}
