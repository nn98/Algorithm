package BaekJoon._Before_Tagging;
import java.util.*;
class P20001{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int m=0;
		String a=s.nextLine();
		while(!(a=s.nextLine()).equals("������ ����� ��")){
			switch(a){
			case "������":
				if(m>0)m--;
				else m+=2;
				break;
			case "����":
				m++;
				break;
			}
		}
		System.out.print(m==0?"�������� �����":"����");
	}
}