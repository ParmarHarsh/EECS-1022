package lab4;

import java.util.Random;

public class UtilityClass {
	
	private UtilityClass() {
		
	}

	public static String evenlyDivisible(int a, int b) {
		
		if(a == 0 || b == 0) {
        	return ("Invalid input");
        }
        else if(a % b == 0 || b % a == 0) {
        	return (a + " and " + b + " are evenly divisible");
        }
        else {
        	return (a + " and " + b + " are NOT evenly divisible");
        }
	}
	
	public static int getRandomNumber(int x, int y) {
		
		int ans = (int) (Math.random() * (y - x + 1)) + x;
		return ans;
	}
	
	public static String stringOfRandomInt(int n, int x, int y) {
		
		Random rand = new Random();
		
		int range = x - y + 1;
		int min = y;
		String str = "";
		
		int randomNumber[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = (int)(rand.nextDouble() * range) + min;
			randomNumber[i] = num;
		}
		
		for(int i = 0; i < n; i++) {
			str = "(" + randomNumber[i] + ")";
		}
		
		return str;
	}

	public static String isPerfectSquare(int n) {
		
		String str;
		double x = Math.sqrt(n);
		
		if(x - Math.floor(x) == 0) {
			str = "Integer " + n + " is Perfect Square";
		}
		else {
			str = "Integer " + n +" is NOT Perfect Square";
		}
		return str;
	}
	
	public static String isPalindromeInt(int n) {
		
		int x;
		int rev = 0;
		int temp = n;
		
		while(n > 0) {
			x = n % 10;
			rev = (rev * 10) + x;
			n = n / 10;
		}
		
		if(temp == rev) {
			return ("Integer " + temp +" is Palindrome");
		}
		else {
			return ("Integer " + temp +" is NOT Palindrome");
		}
    }
	
	public static int digitSum(int number) {
		
		int sum = 0;
		int x;
		
        while (number != 0) {
        	x = number % 10;
            sum = sum + x;
            number = number / 10;
        }
        return sum;
	}
	
	public static int sumEvendigits(int number) {
		
		int sum = 0;
		int x;
		
        while (number != 0) {
        	x = number % 10;
        	
        	if (x % 2 == 0) {
        		sum = sum + x;
        	}
            
        	number = number / 10;
        }
        return sum;
	}
	
	public static String  isCongruent (int a , int b , int m ) {
	
		if(( (m > 0) && (a != 0 || b != 0) ) && ( (a-b) % m == 0 )) {
			return a + " and " + b + " congruent modulo " + m;
		}
		else {
				return a + " and " + b + " NOT congruent modulo " + m;
		}
	}
	
	public static String isPrime(int n) {
		
		boolean flag = false;
		int x = n/2;
		
		for (int i = 2; i <= x; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
	    }
		
		if(n < 0 || n == 1) {
			return n + " is NOT Prime";
		}
		else if(flag == true) {
			return n + " is NOT Prime";
		}
		else{
			return n + " is Prime";
		}
	}	
	
}
