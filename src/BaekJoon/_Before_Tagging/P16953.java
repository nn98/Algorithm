package BaekJoon._Before_Tagging;

import java.util.Scanner;

//��Ʈ������ ��밡��? *2�κ�?
public class P16953 {
	static int f,t,r=-1;
	static void o(String x,int c){
		if(x.length()>9)return;
		int X=Integer.parseInt(x);
		if(X==t)
			r=r==-1?c:r<c?r:c;
		if(X>t)
			return;
		o(""+X*2,c+1);
		o(x+"1",c+1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		f=s.nextInt();
		t=s.nextInt();
		o(""+f,1);
		System.out.print(r);
	}
}