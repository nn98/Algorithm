package Algorithm;
import java.util.Arrays;

public class QuickSort_Partition {

	public static void swap(int[] arr,int a,int b) {
		int s=arr[a];
		arr[a]=arr[b];
		arr[b]=s;
	}
	public static void p(int arr[]) {
		int i=-1,j=0,m=arr[arr.length-1];
		for(;j<arr.length-1;j++) if(arr[j]<=m) swap(arr,++i,j);
		swap(arr,++i,arr.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {31,8,48,73,11,3,20,29,65,15};
		System.out.println(Arrays.toString(arr));
		p(arr);
		System.out.println(Arrays.toString(arr));
	}

}