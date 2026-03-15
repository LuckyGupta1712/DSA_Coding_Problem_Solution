class Main {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,0,4,5};
        System.out.println(linearSearch(arr,5));
    }
    public static int linearSearch(int[] arr,int target){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                pos=i;
            }
        }
        return pos;
    }
    
}
