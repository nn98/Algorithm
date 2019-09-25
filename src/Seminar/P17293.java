package Seminar;

/*
 * 	P -	17293 맥주 99병
 * 		문제 유형 : 출력문, 문자열
 * 		특이 사항 : 
 * 			
 * 			"단, 맥주가 한 병만 있음을 표현하려면 1 bottles가 아니라 1 bottle이라고 해야 한다. 
 * 			또한 맥주가 한 병도 없음을 표현하려면 0 bottles가 아니라 no more bottles라고 해야 한다.
 * 			맥주가 아직 남아있으면 위 과정을 반복하고, 더 이상 남아있지 않으면 다음을 출력하고 종료한다. 
 * 			마찬가지로 맥주를 한 병만 사오는 경우 1 bottles가 아니라 1 bottle이라고 해야 한다."
 * 			
 * 			--- 특정 상황(K<=2) 에서 분기 발생.
 * 				
 */
import java.util.Scanner;

public class P17293 {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		//맥주의 개수 N 입력
		int N=s.nextInt();

		//N만큼 반복
		for(int i=N;i>0;i--) {
			
			//현재 맥주의 개수가 2개 초과일 경우 
			if(i>2)
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottles of beer on the wall.\n\n",i,i,i-1);
			
			//현재 맥주의 개수가 2개일 때
			else if(i==2)
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottle of beer on the wall.\n\n",i,i,i-1);

			//현재 맥주의 개수가 1개일 때
			else if(i==1) 
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n"+"Take one down and pass it around, no more bottles of beer on the wall.\n\n",i,i,i-1);
		}
		
		//종료 시 출력 - N이 1일 경우 bottles가 아닌 bottle로 출력
		if(N==1)
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, %d bottle of beer on the wall.", N);
		else
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, %d bottles of beer on the wall.", N);
	}

}