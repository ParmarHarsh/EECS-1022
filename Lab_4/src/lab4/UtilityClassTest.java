package lab4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;


import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilityClassTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test_00_stringOfRandomInt() {
		final int x = 2;
		final int y =10;
		final int n =2;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\(");
		for (String e: a){
			String [] b = e.split("\\)");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_01_stringOfRandomInt() {
		final int x = 2;
		final int y =10;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\(");
		for (String e: a){
			String [] b = e.split("\\)");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_02_stringOfRandomInt() {
		final int x = 2;
		final int y =7;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		Integer[] array = {2,3,4,5,6,7};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\(");
		for (String e: a){
			String [] b = e.split("\\)");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_03_stringOfRandomInt() {
		final int x = 3;
		final int y =8;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		Integer[] array = {3,4,5,6,7,8};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\(");
		for (String e: a){
			String [] b = e.split("\\)");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	@Test
	public void test_04_stringOfRandomInt() {
		final int x = 13;
		final int y =18;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		Integer[] array = {13,14,15,16,17,18};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\(");
		for (String e: a){
			String [] b = e.split("\\)");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_00_getRandomNumber() {
		final int x = 2;
		final int y =10;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}

	
	@Test
	public void test_01_getRandomNumber() {
		final int x = 5;
		final int y =7;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_02_getRandomNumber() {
		final int x = 10;
		final int y =15;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {10,11,12,13,14,15};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_03_getRandomNumber() {
		final int x = 2;
		final int y =7;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct is ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	@Test
	public void test_04_getRandomNumber() {
		final int x = 0;
		final int y =10;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {0,1,2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	
	@Test
	public void test_00_isPalindromeInt() {
		final int n = 16;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 16 is NOT Palindrome", result);
	}
	
	
	
	@Test
	public void test_01_isPalindromeInt() {
		final int n = 161;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 161 is Palindrome", result);
	}
	@Test
	public void test_02_isPalindromeInt() {
		final int n = 1006001;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 1006001 is Palindrome", result);
	}
	
	@Test
	public void test_03_isPalindromeInt() {
		final int n = 1230603201;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 1230603201 is NOT Palindrome", result);
	}
	
	@Test
	public void test_04_isPalindromeInt() {
		final int n = 2306032;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 2306032 is Palindrome", result);
	}
	
	@Test
	public void test_05_isPalindromeInt() {
		final int n = 230555032;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 230555032 is Palindrome", result);
	}
	
	
	@Test
	public void test_07_isPalindromeInt() {
		final int n = 555111;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 555111 is NOT Palindrome", result);
	}
	
	@Test
	public void test_00_isPerfectSquare() {
		final int n = 16;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 16 is Perfect Square", result);
	}
	@Test
	public void test_01_isPerfectSquare() {
		final int n = 25;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 25 is Perfect Square", result);
	}
	@Test
	public void test_02_isPerfectSquare() {
		final int n = 64;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 64 is Perfect Square", result);
	}
	
	@Test
	public void test_04_isPerfectSquare() {
		final int n = 0;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 0 is Perfect Square", result);
	}
	@Test
	public void test_05_isPerfectSquare() {
		final int n = 100;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 100 is Perfect Square", result);;
	}
	@Test
	public void test_06_isPerfectSquare() {
		final int n = 99;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 99 is NOT Perfect Square", result);;
	}
	@Test
	public void test_07_isPerfectSquare() {
		final int n = 7;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 7 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_08_isPerfectSquare() {
		final int n = 11;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 11 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_00_digitSum() {
		final int n = 2134;
		int sum = UtilityClass.digitSum(n);
		int expect = 10;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_01_digitSum() {
		final int n = 29107;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_02_digitSum() {
		final int n = 5842;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_03_digitSum() {
		final int n = 1005842;
		int sum = UtilityClass.digitSum(n);
		int expect = 20;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}
	
	
	@Test
	public void test_00_evenlyDivisible() {
		final int x = 16;
		final int y = 4;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("16 and 4 are evenly divisible", result);
	}
	
	@Test
	public void test_01_evenlyDivisible() {
		final int x = 15;
		final int y = 3;
		String result = UtilityClass.evenlyDivisible(x,y);

		assertEquals("15 and 3 are evenly divisible", result);;
	}
	
	@Test
	public void test_02_evenlyDivisible() {
		final int x = 15;
		final int y = 4;
		String result = UtilityClass.evenlyDivisible(x,y);

		assertEquals("15 and 4 are NOT evenly divisible", result);
	}
	
	@Test
	public void test_03_evenlyDivisible() {
		final int x = 150;
		final int y = 30;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("150 and 30 are evenly divisible", result);
		
	}
	
	
	@Test
	public void test_04_evenlyDivisible() {
		final int x = 17;
		final int y = 4;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("17 and 4 are NOT evenly divisible", result);
	}
	
	@Test
	public void test_05_evenlyDivisible() {
		final int x = 4;
		final int y = 32;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("4 and 32 are evenly divisible", result);
	}
	
	@Test
	public void test_06_evenlyDivisible() {
		final int x = 0;
		final int y = 4;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("Invalid input", result);
	}
	
	@Test
	public void test_07_evenlyDivisible() {
		final int x = 12;
		final int y = 0;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("Invalid input", result);
	}
	
	@Test
	public void test_08_evenlyDivisible() {
		final int x = 0;
		final int y = 0;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("Invalid input", result);
	}
	@Test
	public void test_09_evenlyDivisible() {
		final int x = 10;
		final int y = 5;
		String result = UtilityClass.evenlyDivisible(x,y);
		assertEquals("10 and 5 are evenly divisible", result);
	}
	
	@Test
	public void test_00_sumEvendigits() {
		final int n= 2134;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 6 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_01_sumEvendigits() {
		final int n= 1002;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 2 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_02_sumEvendigits() {
		final int n= 5842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 14 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	@Test
	public void test_03_sumEvendigits() {
		final int n= 105842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 14 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_04_sumEvendigits() {
		final int n= 4105842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 18 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test00_isCongruent() {
		
		
		assertEquals("81 and 199 NOT congruent modulo 5", UtilityClass.isCongruent ( 81,199,5));


	}
	
	@Test
	public void test01_isCongruent() {
		
		
		
		assertEquals("24 and 14 NOT congruent modulo 6", UtilityClass.isCongruent ( 24, 14, 6));
		


	}
	
	@Test
	public void test02_isCongruent() {
		
		

		
		assertEquals("-8 and 2 congruent modulo 5", UtilityClass.isCongruent ( -8,2, 5));
		


	}
	@Test
	public void test03_isCongruent() {
		
		

		
		assertEquals("38 and 23 congruent modulo 15", UtilityClass.isCongruent ( 38,23, 15));


	}
	@Test
	public void test04_isCongruent() {
		

		
		assertEquals("2 and 3 NOT congruent modulo 10", UtilityClass.isCongruent ( 2,3, 10));

	}
	
	@Test
	public void test00_isPrime() {
		
		assertEquals("81 is NOT Prime", UtilityClass.isPrime ( 81));

		

	}
	@Test
	public void test01_isPrime() {
		

		assertEquals("24 is NOT Prime", UtilityClass.isPrime ( 24));
	

	}
	
	@Test
	public void test02_isPrime() {
		

		assertEquals("6 is NOT Prime", UtilityClass.isPrime ( 6));

		

	}
	@Test
	public void test03_isPrime() {
		

		assertEquals("-8 is NOT Prime", UtilityClass.isPrime ( -8));

		

	}
	@Test
	public void test04_isPrime() {
		

		assertEquals("29 is Prime", UtilityClass.isPrime ( 29));

		

	}
	@Test
	public void test05_isPrime() {
		
		assertEquals("13 is Prime", UtilityClass.isPrime ( 13));
		

	}
	
	@Test
	public void test06_isPrime() {
		
		assertEquals("1 is NOT Prime", UtilityClass.isPrime ( 1));
		

	}
	
	
	@Test
	public void test07_isPrime() {
		
		assertEquals("2 is Prime", UtilityClass.isPrime ( 2));
		

	}
}
