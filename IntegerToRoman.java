public class Solution {
    public String intToRoman(int num) {
        
        //I(1),X(10),C(100),M(1000),V(5),L(50),D(500)
        
        String result = "";
        
        int tmp = num;
        int thousand = tmp / 1000; tmp %= 1000;
        int hundred = tmp / 100; tmp %= 100;
        int ten = tmp / 10; tmp %= 10;
        int one = tmp;
        
        // 1000
        if (thousand >= 1 && thousand <= 3) { // 1-3999
            for (int i = 0; i < thousand; i++) result += "M";
        }
        
        // 100
        if (hundred >= 1 && hundred <= 3) { 
            for (int i = 0; i < hundred; i++) result += "C";
        }
        if (hundred == 4) result += "CD";
        if (hundred >= 5 && hundred <= 8) {
            result += "D";
            for (int i = 0; i < hundred - 5; i++) result += "C";
        }
        if (hundred == 9) result += "CM";
        
        // 10
        if (ten >= 1 && ten <= 3) { 
            for (int i = 0; i < ten; i++) result += "X";
        }
        if (ten == 4) result += "XL";
        if (ten >= 5 && ten <= 8) {
            result += "L";
            for (int i = 0; i < ten - 5; i++) result += "X";
        }
        if (ten == 9) result += "XC";
        
        // 1
        if (one >= 1 && one <= 3) { 
            for (int i = 0; i < one; i++) result += "I";
        }
        if (one == 4) result += "IV";
        if (one >= 5 && one <= 8) {
            result += "V";
            for (int i = 0; i < one - 5; i++) result += "I";
        }
        if (one == 9) result += "IX";
        
        return result;
    }
}
