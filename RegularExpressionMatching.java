public class RegularExpressionMatching {

	public static boolean isMatch(String s, String p) {     
        return isMatch(s, p, 0, 0);
    }
	
	public static boolean isMatch(String s, String p, int indexS, int indexP) {
		
		//This case is sure, the case that s is empty is considered next
		if (indexP == p.length()) return indexS == s.length();
		
		if (indexP < p.length() - 1 && p.charAt(indexP + 1) == '*') { //next is star
			
			if (indexS == s.length()) return isMatch(s, p, indexS, indexP + 2);	
			if (p.charAt(indexP) != '.' && s.charAt(indexS) != p.charAt(indexP)) return isMatch(s, p, indexS, indexP + 2); // not dot
			
			else {
				int number = 0, tmp = indexS; //calculate how many successive numbers
				if (p.charAt(indexP) == '.'){
					while (tmp < s.length()) {
						number++;
						tmp++;
					}	
				}
				else {
					while (tmp < s.length() && s.charAt(tmp) == p.charAt(indexP)) {
						number++;
						tmp++;
					}
				}
				for (int i = 0; i <= number; i++) { //list all cases
					if (isMatch(s, p, indexS + i, indexP + 2)) return true;
				}
				return false;	
			}
			
		} else { //next is not star
			
			if (indexS == s.length()) return false;
			if (p.charAt(indexP) != '.' && s.charAt(indexS) != p.charAt(indexP)) return false; //not dot
			else return isMatch(s, p, indexS + 1, indexP + 1);		
		}	
	}
}
