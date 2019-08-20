import java.util.Arrays;
import java.util.Scanner;

public class P11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),brr[]=new int[n/2],in=0;
		boolean[] arr=new boolean[n/2+1];
		Arrays.fill(arr, true);
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]) {
				brr[in++]=i;
				for(int j=i*2;j<arr.length;j+=i)
					arr[j]=false;
			}
		}
		while(n!=1) {
			for(int i=0;i<brr.length;i++) {
				if(n%brr[i]==0) {
					System.out.println(brr[i]);
					n/=brr[i];
					break;
				}
			}
		}
	}

}
