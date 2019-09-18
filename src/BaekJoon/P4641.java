package BaekJoon;
import java.util.Scanner;

public class P4641 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int index=0,arr[]=new int[15];
		while(true) {
			int n=s.nextInt();
			if(n==-1) break;
			else if(n==0) {
				index=0;
				int count=0;
				for(int i=0;arr[i]!=0;i++) {
					for(int j=0;arr[j]!=0;j++) {
						if(arr[i]*2==arr[j]) {
//							System.out.println(arr[i]+" "+arr[j]);
							count++;
						}
						if(j==14) break;
					}
					if(i==14) break;
				}
				System.out.println(count);
				arr=new int[15];
			}
			else {
				arr[index++]=n;
			}
		}
	}
//
}
