public class Solution {
    public boolean isPalindrome(int x) {
        
        int tmp = x;
        int result = 0;
        
        while (tmp > 0) {
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        
        if (result == x) return true;
        return false;
        
    }
}
