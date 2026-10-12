package two_pointers;
/**
 * LeetCode Problem: Container With Most Water
 * Description: Given n non-negative integers a1, a2, ..., an ,
 * where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of the line i is at (i, ai).
 * Find two lines, which together with the x-axis forms a container,
 * such that the container contains the most water.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int maxArea = 0;

       while(left < right){
           int width = right - left;
           int currentHeight = Math.min(height[left], height[right]);
           int area = width * currentHeight;
           if (area > maxArea){
               maxArea = area;
           }
           if(height[left] < height[right]){
               left ++;
           } else{
               right --;
           }
       }

       return maxArea;
    }
}
