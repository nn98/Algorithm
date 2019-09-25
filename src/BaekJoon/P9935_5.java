package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9935_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.nextLine(),bomb=s.nextLine(),r="",x="";
		if(bomb.length()==1) {
			r=(in.replaceAll(bomb, ""));
			if(r.equals("")) System.out.println("FRULA");
			else System.out.println(r);
			return;
		}
		char[] arr=new char[in.length()];
//		System.out.println(in);
		int index=0,confirm,count=0;
		boolean delete=false;
		for(int i=0;i<in.length();i++) {
			delete=false;
			if(in.charAt(i)==bomb.charAt(bomb.length()-1)) {
				confirm=bomb.length()-2;
				String con="";
				for(int j=index-1;j>=0;j--) {
					if(confirm==-1) 
						break;
					if(arr[j]==bomb.charAt(confirm)) {
						System.out.println(j);
						confirm--;
						con+=j+",";
					}
				}
				if(confirm==-1) {
					System.out.println("del at: "+con);
					delete=true;
					x+=con;
					count++;
				}
//				String conf[]=con.split(",");
//				if(confirm==-1) {
//					delete=true;
//					for(int j=0;j<conf.length;j++) {
//						arr[Integer.parseInt(conf[j])]=0;
//					}
//				}
			}
			if(!delete) {
//				System.out.println(in.charAt(i));
				arr[index++]=in.charAt(i);
			}
			else
				index++;
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(x);
//		System.out.println(Arrays.toString(arr));
		for(char i:arr) {
			if(i!=0)
				r+=(char)i;
		}
		if(r.equals("")) System.out.println("FRULA");
		else System.out.println(r);
	}
}