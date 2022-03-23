package lab1;


import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lab1ClassTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void test31_0_mulDiff() {
		int x=1, y=2;
		int result= Lab1Class.mulDiff(x, y);
		int expect = -1;
		String str = String.format("\nTest mulDiff fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}

	@Test
	public void test31_1_mulDiff() {
		int x=4, y=2;
		int result= Lab1Class.mulDiff(x, y);
		int expect = 2;
		String str = String.format("\nTest mulDiff fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}
	@Test
	public void test31_2_mulDiff() {
		int x=5, y=2;
		int result= Lab1Class.mulDiff(x, y);
		int expect = 3;
		String str = String.format("\nTest mulDiff fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}
	
	
	@Test
	public void test34_0_sumSquares() {
		int x=1, y=2;
		int result= Lab1Class.sumSquares(x, y);
		int expect = 5;
		String str = String.format("\nTest sumSquares fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}
	@Test
	public void test34_1_sumSquares() {
		int x=4, y=2;
		int result= Lab1Class.sumSquares(x, y);
		int expect = 20;
		String str = String.format("\nTest sumSquares fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}
	@Test
	public void test34_2_sumSquares() {
		int x=5, y=2;
		int result= Lab1Class.sumSquares(x, y);
		int expect = 29;
		String str = String.format("\nTest sumSquares fail for x=%d , y=%d. Returned ( %d ), but correct is ( %d )\n",
				x,y, result, expect);
		assertEquals(str, result,expect);
		
	}
	
	@Test
	public void test36_0_compute() {
		double x = 3;
		String result= Lab1Class.compute(3);
		String expect = "The square root of 3 is 1.73";
		String str = String.format("\nTest compute fail for x=%.2f  Returned ( %s ), but correct is ( %s )\n",
			x,	 result, expect);
		assertEquals(str, result,expect);
		
	}
	@Test
	public void test36_1_compute() {
		double x = 7;
		String result= Lab1Class.compute(7);
		String expect = "The square root of 7 is 2.65";
		String str = String.format("\nTest compute fail for x=%.2f  Returned ( %s ), but correct is ( %s )\n",
			x,	 result, expect);
		assertEquals(str, result,expect);
		
	}
	@Test
	public void test36_2_compute() {
		double x = 35;
		String result= Lab1Class.compute(35);
		String expect = "The square root of 35 is 5.92";
		String str = String.format("\nTest compute fail for x=%.2f  Returned ( %s ), but correct is ( %s )\n",
			x,	 result, expect);
		assertEquals(str, result,expect);
		
	}

	
	@Test
	public void test38_0_getBMI() {
		int pounds = 75, feet =15,inches=45;
		
		double  result= Lab1Class.getBMI(pounds, feet, inches);
		double expect = 1.0;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	@Test
	public void testQ38_1_getBMI() {
		int pounds = 80, feet =13,inches=45;
		
		double result= Lab1Class.getBMI(pounds, feet, inches);
		double expect = 1.4;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
		
	}
	
	@Test
	public void testQ38_2_getBMI() {
		int pounds = 135, feet =7,inches=45;
		
		
		double result= Lab1Class.getBMI(pounds, feet, inches);
		double expect = 5.7;
		String str = String.format("\nTest getBMI fail for pounds=%d, feet=%d,inches=%d  Returned ( %.4f ), but correct is ( %.4f )\n",
				pounds,feet ,inches,	 result, expect);
		final double THRESHOLD = .05;
		assertTrue(str, Math.abs(expect - result) < THRESHOLD);
	}
	
	@Test
	public void test01_numRevolutions() {
		final long[] DEG = { 0, 1, 360, 719, 720, 800, Long.MAX_VALUE };
		final long[] EXP = { 0, 0, 1, 1, 2, 2, 25620477880152155L };
		for (int i = 0; i < DEG.length; i++) {
			long got = Lab1Class.numRevolutions(DEG[i]);
			long exp = EXP[i];
			String err = String.format("numRevolutions(%s) failed", DEG[i]);
			assertEquals(err, exp, got);
		}
	}
	
	
	@Test
	public void test01_fixAngle() {
		final long[] DEG = { 0, 1, 359, 360, 700, 720, 725, Long.MAX_VALUE };
		final int[] EXP = { 0, 1, 359, 0, 340, 0, 5, 7 };
		for (int i = 0; i < DEG.length; i++) {
			int got = (int)Lab1Class.fixAngle(DEG[i]);
			int exp = EXP[i];
			String err = String.format("fixAngle(%s) failed", DEG[i]);
			assertEquals(err, exp, got);
		}
	}

	
	@Test
	public void test03_avg() {
		final int A = 0;
		final int B = Integer.MAX_VALUE;
		final int C = Integer.MAX_VALUE;
		final double EXP = (2.0 * Integer.MAX_VALUE) / 3;
		int a = A;
		int b = B;
		int c = C;
		double exp = EXP;
		String error = String.format("avg(%d, %d, %d) failed", a, b, c);
		assertEquals(error, exp, Lab1Class.avg(a, b, c), 10 * Math.ulp(exp));
		
	}

	
	@Test
	public void test031_avg() {
		final int[] A = { 1, 0, -100 };
		final int[] B = { 1, 1, -101  };
		final int[] C = { 1, 1, -103  };
		final double[] EXP = { 1.0, 2.0 / 3, -304.0 / 3 };
		for (int i = 0; i < A.length; i++) {
			int a = A[i];
			int b = B[i];
			int c = C[i];
			double exp = EXP[i];
			String error = String.format("avg(%d, %d, %d) failed", a, b, c);
			assertEquals(error, exp, Lab1Class.avg(a, b, c), 10 * Math.ulp(exp));
		}
	}
	
	
	
	
	@Test
	public void test05_isEven() {
		final int[] X = { Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE };
		final boolean[] EXP = {true, false, true, false, false};
		for (int i = 0; i < X.length; i++) {
			int x = X[i];
			boolean exp = EXP[i];
			String error = String.format("isEven(%d) failed", x);
			assertEquals(error, exp, Lab1Class.isEven(x));
		}
	}

}