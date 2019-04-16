package Algorithm_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P1_1_1Bro_5 {

	/*
	 * 3,6,9 괜히 %3쓰면 피봄
	 */
	static int solution(int number) {
		int result=0;
		for(int i=1;i<=number;i++) {
			boolean[] a=new boolean[4];
			int[] arr=new int[4];
			boolean b=false;
			int c=0;
			/*
			int c=0;
			for(int j=1;j<=i;j*=10) c++;
			switch(c) {
			case 5:
				a[0]=i/10000%3==0;
			case 4:
				a[1]=i%10000/1000%3==0;
			case 3:
				a[2]=i%1000/100%3==0;
			case 2:
				a[3]=i%100/10%3==0;
			case 1:
				a[4]=i%10/1%3==0;
			}
			 */
			/*
			 if(i>=3000) {
				a[0]=i/1000%3==0;
				a[1]=i%1000/100%3==0;
				a[2]=i%100/10%3==0;
				a[3]=i%10%3==0;
			}
			else if (i>=300) {
				a[1]=i/100%3==0;
				a[2]=i%100/10%3==0;
				a[3]=i%10%3==0;
			}
			else if (i>=30) {
				a[2]=i/10%3==0;
				a[3]=i%10%3==0;
			}
			else 
				a[3]=i%10%3==0;
			for(int j=0;j<a.length;j++)
				if(a[j]) {
					System.out.print(i+"짝");
					result++;
				}
				
			if(i/1000%3==0) a[0]=true;
			if(i%1000/100%3==0) a[1]=true;
			if(i%100/10%3==0) a[2]=true;
			if(i%10%3==0) a[3]=true;
			 */
			for(int j=1;j<=1000;j*=10) {
				arr[c++]=i/j%(j*10);
			}
			//System.out.println(Arrays.toString(arr));
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==3||arr[j]==6||arr[j]==9) a[j]=true;
			}
			for(boolean j:a) 
				if(j) {	
					System.out.print(i+"짝 ");
					result++;
				}
		}
		System.out.println();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		// 컴파일 예시-1부터~솔루션까지가 나오고 솔루션 실행되는게 아닌 솔루션 실행 후 출력.
		System.out.println("1부터 "+input+"까지 총 "+solution(input)+"번의 손뼉을 쳐야 합니다.");
	}

}
