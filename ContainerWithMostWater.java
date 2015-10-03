public class Solution {
    public int maxArea(int[] height) {
        
        int start = 0, end = height.length - 1;
        
        int max = 0; // the area depends on the shorter line and the distance between them
        
        while (start < end) {
            
            int h = (height[start] < height[end]) ? height[start] : height[end];
            int tmp = h * (end - start);
            if (tmp > max) max = tmp;
            
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
