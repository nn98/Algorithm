package TA;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("hw3_1:노태웅");
		System.out.println("정수 개수 입력");
		int a= input.nextInt();
		int[] nums = new int[a];
		float avg=0;
		float sum=0;
		int over_avg=0;
		System.out.println(a+"개의 정수 입력:");
		for(int i=0; i<nums.length; i++) {
			nums[i] = input.nextInt();
			sum= sum+nums[i];	
		}
		avg=sum/(nums.length);
		System.out.println("평균="+avg);	
		System.out.print("평균 초과=");
		for(int j=0; j<nums.length; j++) {
			if(avg<nums[j]) {
				over_avg=nums[j];
				System.out.print(over_avg+" ");
			}
		}
		System.out.println(((char) 27)+"[2J");
	}

}
