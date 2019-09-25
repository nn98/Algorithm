package BaekJoon;

import java.util.Scanner;

public class P11866 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),c=n,i=k;
		boolean[] arr=new boolean[n+1];
		arr[k]=true;
		StringBuilder sb=new StringBuilder("<");
		while(c>0){
			if(sb.toString().equals("<")) sb.append(i);
			else {
				for(int j=0;j<k;j++) {
					i++;
					if(i>n) i=1;
					if(arr[i]) {
						j--;
						continue;
					}
				}
				sb.append(", "+i);
				arr[i]=true;
			}
			c--;
		}
		sb.append(">");
		System.out.print(sb);
	}
}