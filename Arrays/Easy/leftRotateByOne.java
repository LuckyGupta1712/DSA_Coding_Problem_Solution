class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newArr=leftRotateByOne(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }        
    }
    public static int[] leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}
