package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode Problem: Non-overlapping Intervals
 * Description: Given an array of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }

        Arrays.sort(intervals, (int[] a, int[] b ) -> Integer.compare(a[0],b[0]));

        int removed = 0;
        int [] previous = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
            //Overlap
            if(current[0] < previous[1]){
                removed++;
                if(current[1] < previous[1]){
                    previous = current;
                }
            }
            //No Overlap
            else{
                previous = current;
            }
        }
        return removed;

    }
}
