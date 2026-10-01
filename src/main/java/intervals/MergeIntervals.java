package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * LeetCode Problem: Merge Intervals
 * Description: Given an array of intervals, merge all overlapping intervals.
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals){
        if(intervals.length == 0){
            return new int [0][0];
        }

        //Sorting
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        //First interval is least from the sort
        result.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
            int[] previous = result.get(result.size() - 1);

            if(current[0] <= previous[1]){
                previous[1] = Math.max(previous[1], current[1]);
            }
            else{
                result.add(current);
            }
        }

    return result.toArray(new int[result.size()][]);



    }
}
