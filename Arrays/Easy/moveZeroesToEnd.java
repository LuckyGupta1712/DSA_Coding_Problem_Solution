class Main {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,0,4,5};
        int[] newArr=moveZeroesToEnd(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }
        
        
    }
    public static int[] moveZeroesToEnd(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){  
                j=i;
                break;
            }
        }
        if (j==-1) return arr;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    
}
