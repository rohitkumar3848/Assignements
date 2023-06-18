import java.util.Arrays;

public class eraseOverllapsedInterval {
    public static int erase(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int[] curr = new int[] {intervals[0][0], intervals[0][1]};
        int cap=1;
        for(int j=1;j<intervals.length;j++){
            if(curr[1]>intervals[j][0]){
                continue;
            }
            curr[0]=intervals[j][0];
            curr[1]=intervals[j][1];
            cap++;
        }
        return intervals.length-cap;
    }
    public static void main(String[] args){
	    int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		System.out.println("The desired output is :  " + erase(intervals));
	}
}
