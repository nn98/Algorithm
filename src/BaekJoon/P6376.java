package BaekJoon;

public class P6376 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("n e\n"); 
		System.out.printf("- -----------\n"); 
		System.out.printf("0 1\n"); 
		System.out.printf("1 2\n"); 
		System.out.printf("2 2.5\n"); 
		double factorial = 2; 
		double i = 2; 
		double result = 2.5; 
		while(factorial < 9){ 
			factorial++; 
			i *= factorial; 
			result += 1 / i; 
			System.out.printf("%.0f %.9f\n", factorial, result); 
		}
	}

}


