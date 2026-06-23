class Find{
    public  void findMissingAndRepeating(int[] arr){
        int[] count=new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            if (count[i]==0){
                System.out.println("Missing number is: "+(i));
            }
            else if (count[i]>1){
                System.out.println("Repeating number is: "+(i));
            }
        }
    }
}


public class findMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        Find res=new Find();
        res.findMissingAndRepeating(arr);
    }
}