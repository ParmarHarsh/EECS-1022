package lab5;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayUtility {

	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private ArrayUtility() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	
	public static int numberOfEvens(int[] inputarray) {
		
		int count = 0;
		
		for(int i = 0; i < inputarray.length; i++) {
			if(inputarray[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	

	public static double avgAreaofRectangeles(Rectangle[] inputarray) {
		
		int len = inputarray.length;
		double area = 0;
	
		for(int i = 0; i < len; i++) {
			area += inputarray[i].getArea();
		}
		area /= len;
		
		return area;
	}

	
	public static double average2D(int[][] inputarray) {
		
		double sum = 0;
		int count = 0;
		double avg = 0;
		
		for(int i = 0; i < inputarray.length; i++) {
			for(int j = 0; j < inputarray[0].length; j++) {
				sum += inputarray[i][j];
				count++;
			}
		}
		avg = sum / count;
		
		return avg;
	}


	public static int[] minmax2D(int[][] inputarray) {
		
		int len = inputarray.length;
	    int min = inputarray[0][0];
	    int max = inputarray[0][0];
	    
	    for(int i = 0; i < len; i++) {
	    	for(int j = 0; j < inputarray[i].length; j++) {
	    		if (inputarray[i][j] < min ) {
	    			min = inputarray[i][j];
	            }
	        }
	    }	
		
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < inputarray[i].length; j++) {
                if (inputarray[i][j] > max) {
                    max = inputarray[i][j];
                }
            }
        }
  
        
        int arr[] = new int[2];
        
        arr[0] = min;
        arr[1] = max;
        	
        return arr;
        
	}

	
	public static double averageOfOdd(int[] inputarray) {
		
		double sum = 0.;
		double count = 0.;
		double avg = 0.;
		
		for(int i = 0; i < inputarray.length; i++) {
			if((inputarray[i] % 2) == 0) {
				continue;
			}
			else {
				sum += inputarray[i];
				count++;
			}
		}
		
		if(sum == 0 && count == 0) {
			return 0.00;
		}
		else {
			avg = sum / count;
		}
		
		return avg;
	}


	public static int[] removeDuplicatesElement(int[] inputarray) {
			
		int len = inputarray.length;
		int arr[] = new int[len-1];
		int x = 0;
		
		for(int i = 0; i < len-1; i++) {
			if(inputarray[i] != inputarray[i+1]) {
				arr[x++] = inputarray[i];
			}
		}
		
		arr[x++] = inputarray[len-1];
		
		for(int i = 0; i < x; i++) {
			inputarray[i] = arr[i];
		}
		
		return arr;
	}
	

	public static String isConsecutive(int[] inputarray) {
		
		int x = inputarray[0];
		int len = inputarray.length;
		int flag = 0;
		
		for(int i = 1; i < len; i++) {
			if(x+1 == inputarray[i]) {
				flag = 1;
				x = inputarray[i];
			}
			else {
				flag = 0;
				break;			
			}
		}
		
		String ans = "{";
		
        for (int i = 0; i < len; i++) {
            ans += Integer.toString(inputarray[i]);
            if(i != (len - 1)) {
            	ans += ", ";
            }
        }
        
        ans += "}";
		
        if(flag == 1) {
			return ans + " is consecutive";
		}
		else {
			return ans + " is NOT consecutive";
		}
	}
}
