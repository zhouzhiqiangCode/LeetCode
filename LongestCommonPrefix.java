public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) return "";
        
        int index = 0;
        boolean flag = true;
        boolean isExisted = false;
        
        char tmp;
        
        while (flag) {
            
            if (index >= strs[0].length()) break;
            else tmp = strs[0].charAt(index);
            
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != tmp) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                index++;
                isExisted = true;
            }
            
        }
        
        if (!isExisted) return "";
        else return strs[0].substring(0,index);
        
    }
}
