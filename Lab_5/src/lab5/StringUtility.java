package lab5;

import java.util.Arrays;

public class StringUtility {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private StringUtility() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	
	public static int digitCountinString(String str) {

		int digits = 0;
		
        for(int i = 0; i < str.length(); i++) {
        	if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
        		digits++;
            }
        }
       
        return digits;
	}


	public static String removeDuplicatesChar(String str) {
		
		char ch[] = str.toCharArray();
		int len = str.length();
		int x = 0, i = 0, j = 0;
		
		for(i = 0; i < len; i++) {
			for(j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					break;
				}
			}
			
			if(i == j) {
				ch[x++] = ch[i];
			}
		}
		return String.valueOf(Arrays.copyOf(ch, x));
	}
	
	
	public static int sumofDigitinString(String str) {

        int x, sum = 0;
        int len = str.length();
        char ch;
        
        for(int i = 0; i < len; i++) {
        	ch = str.charAt(i);

            if(Character.isDigit(ch)) {
            	x = Character.getNumericValue(ch);
            	sum += x;
            }
        }
        return sum;
	}
	
	
	public static int lengthofMaxConsecutiveZeros(String str) {
		
		String[] s = str.split("1");
		
		int len = Integer.MIN_VALUE;
	    int x = s.length;
	 
	    for(int i = 0; i < x; i++) {
	    	int l = s[i].length();
	        if (len < l) {
	            len = l;
	        }
	    }
	    return len;
	}

	
	public static String removeConsecutiveDuplicates(String str) {
		
		if(str.length() <= 1) {
			return str;
		}

		if(str.charAt(0) == str.charAt(1)) {
			return removeConsecutiveDuplicates(str.substring(1));
        }
		else {
			return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
        }
	}


	public static int whitespaceCountinString(String str) {

		int whitespaces = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				whitespaces += 1;
			}
		}
		return whitespaces;
	}


    public static String compressString(String inputStr) {
    	
    	int len = inputStr.length();
    	
    	if(len == 0) {
    		return "";
    	}
    	else {
    		StringBuffer sb = new StringBuffer();
    		char lastChar = inputStr.charAt(0);
    		int count = 0;
    	
    		for(int i = 0; i < len; i++) {
    			if(inputStr.charAt(i) == lastChar) {
    			count++;
    			}
    			else {
    				sb.append(lastChar + "" + count);
    				count  = 1;
    			}
    			lastChar = inputStr.charAt(i);
    		}
    	
    		sb.append(lastChar + "" + count);
    		String str = sb.toString();
    	
    		if(str.length() < len) {
    			return inputStr;
    		}
    		else {
    			return str;
    		}
    	}
    }


}