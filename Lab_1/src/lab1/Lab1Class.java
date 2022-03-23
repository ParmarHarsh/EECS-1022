package lab1;

public class Lab1Class {
	
	private Lab1Class() {
		// empty to prevent object creation
	}
	
	
	public static int mulDiff(int x, int y) {
		int a = x * y;
		int b = x + y;
		int ans1 = a - b;
		
		return ans1;
	}

	
	public static int sumSquares(int x, int y) {
		int a = (int) (Math.pow(x, 2));
		int b = (int) (Math.pow(y, 2));
		int ans2 = a + b;
		
		return ans2;
	}
	
	
	public static String compute(int n) {
		double a = Math.sqrt(n);
		String b = String.format("%.2f", a);
		String ans3 = "The square root of " + n + " is " + b;
		
		return ans3;
	}
	
	
	public static double getBMI(int pounds, int feet, int inches) {
		double conWeight = pounds * 0.453592;
		double conFeet = feet * 0.3048;
		double conInches = inches * 0.0254;
		double height = conFeet + conInches;
		double bmi = conWeight / (Math.pow(height, 2));
		String x = String.format("%.2f", bmi);
		double ans4 = Double.parseDouble(x);
		
		return ans4;
	}
	
	
	public static long numRevolutions(long degrees) {
		long ans5 = degrees/360;
		
		return ans5;
	}
	
	
	public static int fixAngle(long degrees) {
		int x = (int) degrees;
		int ans6 = x % 360;
		
		return ans6;
	}
	
	
	public static double avg(int a, int b, int c) {
		double sum = (double) (a + b + c);
		double ans7 = sum / 3;
		
		return ans7;
	}
	
	
	public static boolean isEven(int x) {
		if(x % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}