package BaekJoon;

import java.util.Scanner;

public class P10250 {

	//남의코드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int floor = sc.nextInt();            // 층 수

            int room = sc.nextInt();            // 각 층의 방 수

            int people = sc.nextInt();                // 사람 순서

            

            int m = people / floor;                

            double k = people % floor;            

            

            if(k == 0){	//꼭대기에 올라갔을 때

            	System.out.println(floor*100+m);
                

            }else{

                k = k * 100;

                System.out.println((int)(k+m+1));
                

            }
			
			
		}
	}

}
