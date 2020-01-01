package BaekJoon;
import java.util.*;
class P16953_S{
	public static void main(String[]z){
		Scanner sc=new Scanner(System.in);
		int cnt=1;
		long A=sc.nextLong();
		long B=sc.nextLong();
		while(B>A){
			cnt+=1;
			if(B%2==0){
				B=B>>1;
			}else if((B-1)%10==0)B=B/10;
			else{
				cnt=-1;
				break;
			}
		}
		System.out.print(A==B?cnt:-1);
	}
}