public class Solution {
    public int myAtoi(String str) {
        
        final int MAXPOSITIVE = 2147483647;
        final int MINNEGSTIVE = -2147483648;
        boolean isNegative = false; //default positive
        int index = 0;
        int result = 0;
        
        if (str.equals("")) return 0; //no string
        if (str.length() == 1){       //string length equals 1
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') return (str.charAt(index) - '0');
            else return 0;
        }
        
        //string length more than 1
        while (index < str.length() && str.charAt(index) == ' ') index++; //elimate spaces
        
        if (str.charAt(index) == '-' || str.charAt(index) == '+') { //judge positive or negative
            if (str.charAt(index) == '-') isNegative = true;
            index++;
        }
        
        while (index < str.length() && str.charAt(index) == '0') index++; //elimate zeros
    
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            
            if (result > 214748364) { //overflow
                if (isNegative) return MINNEGSTIVE;
                else return MAXPOSITIVE;
            }
            result = result * 10 + str.charAt(index) - '0';
            if (result < 0) { //overflow
                if (isNegative) return MINNEGSTIVE;
                else return MAXPOSITIVE;
            }
            index++;
        }
        
        if (isNegative) result = 0 - result;
        return result;
    }
}
