public class Main {

	public static void main(String[] args) {
		System.out.println("hw3_2: 성현우");
		
		//정수 배열
		int[] array1 = {10, 20, 30, 999, 50, 60, 999, 70, 999, 90};
		int[] array2 = {90, 20, 30, 40, 50, 60, 70, 10};
		int[] array3 = {-20, -30, -40, -50, -60, -70, -80, -90, -10};
		
		// printArr 호출 및 배열의 원소 출력하기
		printArr(array1);
		System.out.println();
		
		//max 호출 후 array1의 최대값을 인덱스에 저장
		int maxIndex1 = max(array1);
		System.out.print("최대값 인덱스 = " + maxIndex1 + " "); // 인덱스
		System.out.print("최대값 = " + array1[maxIndex1]); // 최대값
		System.out.println();
		
		
		printArr(array2);
		System.out.println();
		
		int maxIndex2 = max(array2);
		System.out.print("최대값 인덱스 = " + maxIndex2 + " "); // 인덱스
		System.out.print("최대값 = " + array2[maxIndex2]); // 최대값
		System.out.println();
		
		
		printArr(array3);
		System.out.println();
		
		int maxIndex3 = max(array3);
		System.out.print("최대값 인덱스 = " + maxIndex3 + " "); // 인덱스
		System.out.print("최대값 = " + array3[maxIndex3]); // 최대값
		System.out.println();
	}

		// 정수 배열을 매개 변수로 받아서 배열 원소를 모두 출력
		private static void printArr(int[] array) {
			for (int i = 0; i < array.length; i++) { // 배열 길이 만큼 반복후 모두 출력
				System.out.print(array[i] + " ");
			}
		}
		
		// 정수 배열을 매개 변수로 받아서 최대값 원소 인덱스를 리턴
		
		private static int max(int[] array) {
			int maxIndex = 0;
			int maxValue = array[0]; 
			
			
			for(int i = 1; i < array.length; i++) {		// i = 1
				if (maxValue < array[i]) {
						maxValue = array[i];
						maxIndex = i;
				}
			}
			return maxIndex;	
		}
}
