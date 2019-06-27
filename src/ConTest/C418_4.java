package ConTest;
import java.util.Arrays;
import java.util.Scanner;

public class C418_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),target=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		int t=0,r=0,i=0;
		int[] count=new int[N];
		for(;t!=target;r++) {
			//System.out.println("t: "+t);
			t=arr[t];
			count[t]++;
			if(count[t]>1) {
				r=-1;
				break;
			}
		}
		System.out.println(r);
	}
}