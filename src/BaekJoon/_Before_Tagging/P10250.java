package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P10250 {

	//�����ڵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int floor = sc.nextInt();            // �� ��

            int room = sc.nextInt();            // �� ���� �� ��

            int people = sc.nextInt();                // ��� ����

            

            int m = people / floor;                

            double k = people % floor;            

            

            if(k == 0){	//����⿡ �ö��� ��

            	System.out.println(floor*100+m);
                

            }else{

                k = k * 100;

                System.out.println((int)(k+m+1));
                

            }
			
			
		}
	}

}
