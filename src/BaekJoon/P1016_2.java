package BaekJoon;

import java.util.Scanner;

public class P1016_2 {

	public static void main(String[] args) { //throws IOException 
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		long min=s.nextLong(),max=s.nextLong(),sum=0;
		boolean[] arr=new boolean[(int)(max-min+1)];
		for(long i=2;;i++) {
			long p=i*i;
			if(p>max) break;
			long add = (min/p) * p;
//			if((p-min)<0) continue;
//			if(p==1) continue;
			while(add<min) add+=p;
			while(add<=max) {
//				System.out.println(add);
//				bw.write(add+"\n");
				arr[(int)(add-min)]=true;
				add+=p;
			}
		}
//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) if(!arr[i]) sum++;
//		bw.flush();
		System.out.println(sum);
	}
}