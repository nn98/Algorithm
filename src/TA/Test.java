package TA;

public class Test
{
	public static void main(String[] args) 
	{
		System.out.println("hw3_2 : 천정명");
		
		int[] array1 = {10,20,30,40,50,60,70,80,90,100};
		int[] array2 = {50,10,0,50,20};
		int[] array3 = {-50,-10,-40,-50,-20};
		int[] array4 = {10};
		
		System.out.println(getMaxIndex(array1));
		System.out.println(getMaxIndex(array2));
		System.out.println(getMaxIndex(array3));
		System.out.println(getMaxIndex(array4));
	}
	private static String getMaxIndex(int[] input)
	{
		int index = 0;
		int max = input[0];
		for(int i = 0; i < input.length; i++)
		{
			if(input[i] > max)
			{
				max = input[i];
				index = i;
			}
		}
		return index + " " + max;
	}
}
