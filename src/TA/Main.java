package TA;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    
    public static int[] mergeSort(int a[]) {
        int n = a.length;
        if (n == 1) {
            return a;
        }

        int[] lArr = Arrays.copyOfRange(a, 0, n / 2);
        int[] rArr = Arrays.copyOfRange(a, n / 2, n);
        lArr = mergeSort(lArr);
        rArr = mergeSort(rArr); //재귀적 분할.
	
        int[] tmp = new int[lArr.length + rArr.length]; //temp 배열 선언
        int l = 0, r = 0, i = 0;
       	
	while (true){ 
		if (l < lArr.length && r < rArr.length) {
		    if (lArr[l] <= rArr[r]) { //두 값이 같을 경우 lArr의 값 사용( 안정 정렬 )
			tmp[i++] = lArr[l++];
		    } else {
			tmp[i++] = rArr[r++];
		    }
		}
		else if (l < lArr.length)
		    tmp[i++] = lArr[l++];	
		else if (r < rArr.length)
		    tmp[i++] = rArr[r++];
		else
		    break;
	}
        return tmp;
    }
    	public static void main(String[] args) throws Exception {
            System.out.println("문인호");
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            count = scanner.nextInt();
            int[] arr = new int[count]; // 학번 입력 받기 
            int[] arrMerge = new int[count]; // 학번 정렬 
            for (int i = 0 ; i < count ; i++) {
    			arr[i] = scanner.nextInt();		
    		}	
            scanner.close();

            arrMerge = mergeSort(arr);
            System.out.println(Arrays.toString(arrMerge));
    	}
}
