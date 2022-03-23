package lab5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayUtilityTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test_00_NumberOfEvens() {
		final int[] myList = { 9, 10, 3, 4, 3 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 2;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_01_NumberOfEvens() {
		final int[] myList = { 1, 6, 1 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 1;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	@Test
	public void test_02_NumberOfEvens() {
		final int[] myList = { 4, 24, 46, 0 };
		int n = ArrayUtility.numberOfEvens(myList);
		int expect = 4;
		String str = String.format("\nTest numberOfEvens fail for %s. Returned ( %d ), but correct is ( %d )\n",
				Arrays.toString(myList), n, expect);
		assertTrue(str, expect == n);
	}

	
	@Test
	public void test_00_avgAreaofRectangeles() {
		Rectangle[] a = {new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3)};
		double avg =ArrayUtility.avgAreaofRectangeles(a);
		double exp = 6.0;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_01_avgAreaofRectangeles() {
		Rectangle[] a = {new Rectangle(3,3),new Rectangle(3,3),new Rectangle(2,3),new Rectangle(2,3),new Rectangle(2,3)};
		double avg =ArrayUtility.avgAreaofRectangeles(a);
		double exp = 7.2;
		String error = String.format(
				"\n Test avgAreaofRectangeles failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_00_average2D() {
		int[][] inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}};
		double avg =ArrayUtility.average2D(inputarray);
		double exp = 9.0;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	@Test
	public void test_01_average2D() {
		int[][] inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}};
		double avg =ArrayUtility.average2D(inputarray);
		double exp = 51.75;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	
	@Test
	public void test_02_average2D() {
		int[][] inputarray = {{9, 2, 33, 4}, {11, 2, 32, 45}, {1, 222, 333, -4}};
		double avg =ArrayUtility.average2D(inputarray);
		double exp = 57.50;
		String error = String.format(
				"\n Test average2D failed. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				 avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);
		
	}
	
	@Test
	public void test_00_minmax2D() {

		final int[][] A = { {12, 4, 6}, {5 , 2,1 } };
		int [] exp = {1, 12};
		int [] result = ArrayUtility.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}

	@Test
	public void test_01_minmax2D() {

		final int[][] A = { {-12, 4, 6}, {5 , 2,1 } };
		int [] exp = {-12, 6};
		int [] result = ArrayUtility.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}
	@Test
	public void test_03_minmax2D() {

		final int[][] A = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}};
		int [] exp = {-42, 81};
		int [] result = ArrayUtility.minmax2D(A);

		String error = String.format(
				"\n Test minmax2D failed,  Returned ( %s ) " + 
		" but correct is ( %s ). \n",
				 Arrays.toString(result), Arrays.toString(exp));

		assertTrue(error, Arrays.equals(exp, result));

	}
	
	@Test
	public void test_00_averageOfOdd() {

		final int[] A = { 12, 4, 6 };
		double exp = 0.0;
		double avg = ArrayUtility.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}

	
	
	@Test
	public void test_01_averageOfOdd() {

		final int[] A = { 3, 6 };
		double exp = 3.0;

		double avg = ArrayUtility.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);
		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	@Test
	public void test_02_averageOfOdd() {

		final int[] A = {12, 4, 6, 3, 3 ,5 ,7 };
		double exp = 4.5;
		double avg = ArrayUtility.averageOfOdd(A);

		String error = String.format(
				"\n Test averageOfOdd failed for %s. Returned ( %.2f ) " + " but correct is ( %.2f ). \n",
				Arrays.toString(A), avg, exp);

		final double THRESHOLD = .01;
		assertTrue(error, Math.abs(exp - avg) < THRESHOLD);

	}
	
	@Test
	public void test_00_removeDuplicatesElement() {

		final int[] A = { 12, 4, 6, 3, 3 ,5 ,7 };
		int[]  exp = {3,4,5,6,7,12};
		int[] result = ArrayUtility.removeDuplicatesElement(A);
		Arrays.sort(exp);
		Arrays.sort(result);
		String error = String.format(
				"\n Test removeDuplicatesElement failed for %s. Returned ( %s ) " + 
						" but correct is ( %s ). \n",
				Arrays.toString(A), Arrays.toString(result), Arrays.toString(exp));

		
		assertTrue(error, Arrays.equals(exp, result) );

	}
	
	@Test
	public void test_00_isConsecutive() {
		final int[] myList = { 3, 6 };
		String  n = ArrayUtility.isConsecutive(myList);
		assertEquals("{3, 6} is NOT consecutive",n);
	}

	@Test
	public void test_01_isConsecutive() {
		final int[] myList = { 6, 7, 8, 9 };
		String  n = ArrayUtility.isConsecutive(myList);
		assertEquals("{6, 7, 8, 9} is consecutive",n);
	}
	
	@Test
	public void test_02_isConsecutive() {
		final int[] myList = { 6, 7, 8, 9 ,10 };
		String  n = ArrayUtility.isConsecutive(myList);
		assertEquals("{6, 7, 8, 9, 10} is consecutive",n);
	}
	
	@Test
	public void test_03_isConsecutive() {
		final int[] myList = { 69 ,10 };
		String  n = ArrayUtility.isConsecutive(myList);
		assertEquals("{69, 10} is NOT consecutive",n);
	}

}
