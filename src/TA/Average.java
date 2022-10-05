package TA;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// 정수 개수와 n개의 정수값 입력
		System.out.print("정수 개수 입력 : ");
		int a = scanner.nextInt();
		
		int intArray[] = new int[a];
		System.out.print(intArray.length + "개의 정수값 입력 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for (int i=0; i<intArray.length; i++) {
			sum += intArray[i];
		}
		
		// 평균, 평균 초과값 출력
		System.out.print("평균 = " + (double)sum/intArray.length);
		int x = 0;
	    for (int i=0; i<intArray.length; i++) {
	    	if (x > sum/intArray.length)
	    		System.out.print("평균 초과 = "+ (double)x);
	    }
	}

}
