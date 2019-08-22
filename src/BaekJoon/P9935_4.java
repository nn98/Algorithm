package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9935_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.nextLine(),bomb=s.nextLine(),r="",con="";
//		in=in.replaceAll(bomb, "");
		char[] arr=new char[in.length()];
//		System.out.println(in);
		int index=0,confirm;
		boolean delete=false;
		for(int i=0;i<in.length();i++) {
			delete=false;
			if(in.charAt(i)==bomb.charAt(bomb.length()-1)) {
				String add="";
				confirm=bomb.length()-2;
				for(int j=index;j>=0;j--) {
					if(confirm==-1) {
						delete=true;
						break;
					}
					if(arr[j]==bomb.charAt(confirm)) {
						confirm--;
						add+=j+",";
					}
				}
				if(delete) con+=add;
			}
			if(!delete) {
//				System.out.println(in.charAt(i));
				arr[index++]=in.charAt(i);
			}
			else
				index++;
//			System.out.println(Arrays.toString(arr));
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(con);
		String[] brr=con.split(",");
		index=0;
		confirm=Integer.parseInt(brr[index++]);
		for(int i=0;i<arr.length;i++) {
			System.out.println("conf: "+confirm+r);
			if(index==brr.length) r+=(char)arr[i];
			else if(i==confirm) {
				confirm=Integer.parseInt(brr[index++]);
				continue;
			}
			else {
				r+=(char)arr[i];
			}
		}
//		for(char i:arr) {
//			if(i!=0)
//				r+=(char)i;
//		}
		if(r.equals("")) System.out.println("FRULA");
		else System.out.println(r);
	}
}
