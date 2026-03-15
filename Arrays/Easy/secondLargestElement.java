class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){  // if ele is larger than the largest
                secondLarge=large;
                large=arr[i];
                
            }
            else if(arr[i]>secondLarge && arr[i]!=large){ // if ele is larger than second largest but not equal to large
                secondLarge=arr[i]; // update second large
            }
        }
        return secondLarge;
    }
}
