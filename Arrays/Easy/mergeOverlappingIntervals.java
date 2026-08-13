import java.util.*;
public class mergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(a,b)->a[0]-b[0]);
            List<int[]> res=new ArrayList<>();
            int i=0;
            int n=intervals.length;
            while(i<n){
                int start=intervals[i][0];
                int end=intervals[i][1];
                int j=i+1;
                while(j<n && intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                    j++;
                }
                res.add(new int[]{start,end});
                i=j;
            }
            return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        mergeOverlappingIntervals solution = new mergeOverlappingIntervals();
        
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = solution.merge(intervals);
        
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
    
}
