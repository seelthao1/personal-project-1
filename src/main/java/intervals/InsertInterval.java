package intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem: Insert Interval
 * Description: Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //Store final intervals result
        List<int[]> result = new ArrayList<>();
        //Keeps track of which interval we're looking at
        int i = 0;
        //Loop to check current interval if last index is bigger than new interval first index
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);
            i++;
        }

        // Checks if current interval first index is less than or equal to new interval's last index
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Checks if new intervals is significantly bigger than current intervals
        while(i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
