
import java.util.Scanner;

public class ArrayTest { //메인클라스 ArrayTest
	public static void main(String[] args) {
		System.out.println("hw3_1 : 한동주");
		
		int array[] = new int[10]; // 10개의 정수로 구성된 배열 array 생성
		int sum = 0; //합계 초기화
		double avg = 0.0; //평균 초기화
		int above[]; //평균 이상 값을 저장할 배열 above 선언
		
		Scanner scanner = new Scanner(System.in); //스캐너로 입력받기
		System.out.println("10개의 정수값 입력: "); //입력안내문구 출력
		
		for(int i=0; i<10; i++)
			array[i] = scanner.nextInt(); //입력받은 정수 배열에 저장
		
		
		//평균 출력
		for(int i=0; i<array.length; i++) {
			sum += array[i]; // 평균을 구하기 위한 정수 값 더하기
			avg = (double)sum/array.length; // 평균 구하기
			System.out.println("평균 = " + avg); // 평균값 출력
		}
		//평균 이상 출력
		for(int i=0; i<=array.length; i++) {
			if (array[i] >= avg) {//만약 i가 평균보다 크다면
				
			    /*above[] = i;//배열 above에 저장*/
			}
			System.out.println("평균 이상 = " + above[i]); // 평균 이상인 정수배열 above 출력
		}
		scanner.close(); //스캐너 닫기

	}

}