public class Solution {
    
    public int mySqrt(int x) {
        
        return mySqrt(x, 0, x);
    }
    
    public int mySqrt(int x, int start, int end) {
        
        if (start == end) {
            if (start <= 46340 && start * start <= x) return start;
            else return (start - 1);
        }
        
        int mid = (start + end) / 2;
        
        if (mid > 46340 || mid * mid > x) return mySqrt(x, start, mid);
        
        else if (mid * mid < x) return mySqrt(x, mid + 1, end);
        
        else return mid;
    }
}
