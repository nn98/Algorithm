package Algorithm_Practice._School.TA;
import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("hw11_1 : 김승규");//과제코드와 본인 이름 출력

		Scanner scan = new Scanner(System.in);// 스캐너 객체 생성		
		Scanner scan2 = new Scanner(System.in);// 스캐너 객체 생성	

		int n = scan.nextInt();

		String[] s_num = new String[n];

		for(int i=0; i<n; i++)
		{
			System.out.println(i);
			String inputNum =scan2.nextLine();

			s_num[i]=inputNum;

			if(inputNum.length() == 7 || inputNum.length() == 9)
				s_num[i]=inputNum;
			else{
				i--;
				System.out.println("7자리 혹은 9자리를 입력하세요.");
			}

		}
		//(1) 학생 수(n)와 n개의 학번을 입력받는다.

		sort(s_num, n);
		//(2) n개의 학번을  문제의 기준에 따라 오름차순 정렬한다.

		for(int i=0;i<n;i++) {
			System.out.println(s_num[i]);
		}

		//(3) 정렬된 순서대로 n개의 학번을 출력한다.
		
		scan.close();
		scan2.close();
	}
	//메인문


	private static void sort(String s_num[],int n) {

		for(int i=n-1;i>0;i--)
		{
			for(int j=0; j<i; j++)
			{
				int c_number,c_number2,c_number3,c_number4,c_number5,c_number6;

				if(s_num[j].length() == 9 && s_num[j+1].length() == 9) {
					c_number = Integer.parseInt(s_num[j].substring(4,6));
					c_number3 = Integer.parseInt(s_num[j].substring(0,4));
					c_number5 = Integer.parseInt(s_num[j].substring(6,9));
					c_number2 = Integer.parseInt(s_num[j+1].substring(4,6));
					c_number4 = Integer.parseInt(s_num[j+1].substring(0,4));
					c_number6 = Integer.parseInt(s_num[j+1].substring(6,9));

					if(c_number>c_number2)// 소속 비교
					{
						String temp = s_num[j];
						s_num[j] = s_num[j+1];
						s_num[j+1] = temp;
					}
					else if( c_number == c_number2) {// 입학년도 비교

						if(c_number3>c_number4)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
					else if( c_number3 == c_number4) {// 입학년도 비교

						if(c_number5>c_number6)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
				}


				if(s_num[j].length() == 7 && s_num[j+1].length() == 9) {
					c_number = Integer.parseInt(s_num[j].substring(2,4));
					c_number3 = Integer.parseInt(s_num[j].substring(0,2));
					c_number5 = Integer.parseInt(s_num[j].substring(4,7));
					c_number2 = Integer.parseInt(s_num[j+1].substring(4,6));
					c_number4 = Integer.parseInt(s_num[j+1].substring(0,4));
					c_number6 = Integer.parseInt(s_num[j+1].substring(6,9));

					if(c_number>c_number2)// 소속 비교
					{
						String temp = s_num[j];
						s_num[j] = s_num[j+1];
						s_num[j+1] = temp;
					}
					else if( c_number == c_number2) {// 입학년도 비교

						if(c_number3>c_number4)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
					else if( c_number3 == c_number4) {// 입학년도 비교

						if(c_number5>c_number6)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
				}
				if(s_num[j].length() == 9 && s_num[j+1].length() == 7) {
					c_number = Integer.parseInt(s_num[j].substring(4,6));
					c_number3 = Integer.parseInt(s_num[j].substring(0,4));
					c_number5 = Integer.parseInt(s_num[j].substring(6,9));
					c_number2 = Integer.parseInt(s_num[j+1].substring(2,4));
					c_number4 = Integer.parseInt(s_num[j+1].substring(0,2));
					c_number6 = Integer.parseInt(s_num[j+1].substring(4,7));

					if(c_number>c_number2)// 소속 비교
					{
						String temp = s_num[j];
						s_num[j] = s_num[j+1];
						s_num[j+1] = temp;
					}
					else if( c_number == c_number2) {// 입학년도 비교

						if(c_number3>c_number4)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
					else if( c_number3 == c_number4) {// 입학년도 비교

						if(c_number5>c_number6)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
				}

				if(s_num[j].length() == 7 && s_num[j+1].length() == 7) {
					c_number = Integer.parseInt(s_num[j].substring(2,4));
					c_number3 = Integer.parseInt(s_num[j].substring(0,2));
					c_number5 = Integer.parseInt(s_num[j].substring(4,7));
					c_number2 = Integer.parseInt(s_num[j+1].substring(2,4));
					c_number4 = Integer.parseInt(s_num[j+1].substring(0,2));
					c_number6 = Integer.parseInt(s_num[j+1].substring(4,7));

					if(c_number>c_number2)// 소속 비교
					{
						String temp = s_num[j];
						s_num[j] = s_num[j+1];
						s_num[j+1] = temp;
					}
					else if( c_number == c_number2) {// 입학년도 비교

						if(c_number3>c_number4)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
					else if( c_number3 == c_number4) {// 입학년도 비교

						if(c_number5>c_number6)
						{
							String temp = s_num[j];
							s_num[j] = s_num[j+1];
							s_num[j+1] = temp;
						}
					}
				}
			}
		}
	}
}



