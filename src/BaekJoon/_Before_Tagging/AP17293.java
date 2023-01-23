package BaekJoon._Before_Tagging;

/*
 * 	P -	17293 ���� 99��
 * 		���� ���� : ��¹�, ���ڿ�
 * 		Ư�� ���� : 
 * 			
 * 			"��, ���ְ� �� ���� ������ ǥ���Ϸ��� 1 bottles�� �ƴ϶� 1 bottle�̶�� �ؾ� �Ѵ�. 
 * 			���� ���ְ� �� ���� ������ ǥ���Ϸ��� 0 bottles�� �ƴ϶� no more bottles��� �ؾ� �Ѵ�.
 * 			���ְ� ���� ���������� �� ������ �ݺ��ϰ�, �� �̻� �������� ������ ������ ����ϰ� �����Ѵ�. 
 * 			���������� ���ָ� �� ���� ����� ��� 1 bottles�� �ƴ϶� 1 bottle�̶�� �ؾ� �Ѵ�."
 * 			
 * 			--- Ư�� ��Ȳ(K<=2) ���� �б� �߻�.
 * 				
 */
import java.util.Scanner;

public class AP17293 {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		//������ ���� N �Է�
		int N=s.nextInt();

		//N��ŭ �ݺ�
		for(int i=N;i>0;i--) {
			
			//���� ������ ������ 2�� �ʰ��� ��� 
			if(i>2)
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottles of beer on the wall.\n\n",i,i,i-1);
			
			//���� ������ ������ 2���� ��
			else if(i==2)
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottle of beer on the wall.\n\n",i,i,i-1);

			//���� ������ ������ 1���� ��
			else if(i==1) 
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n"+"Take one down and pass it around, no more bottles of beer on the wall.\n\n",i,i,i-1);
		}
		
		//���� �� ��� - N�� 1�� ��� bottles�� �ƴ� bottle�� ���
		if(N==1)
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, %d bottle of beer on the wall.", N);
		else
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, %d bottles of beer on the wall.", N);
	}

}