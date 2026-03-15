class Main {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,1,1,4,5};
        System.out.println(maxConsecutiveOnes(arr));
    }
    public static int maxConsecutiveOnes(int[] arr){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
