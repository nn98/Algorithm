//학생 코드 테스트용
package TA;
import java.util.Random;

public class ReservationSort {
	static class Reservation {
	// private 인스턴스 변수
		private int id; // 예약번호
		private int startTime; // 시작 시간
		private int endTime; // 종료 시간

		public Reservation(int id, int startTime, int endTime) {
			super();
			this.id = id;
			this.startTime = startTime;
			this.endTime = endTime;
		}
		
		public int getLength() {
			return endTime-startTime;
		}
		
		@Override
		public String toString() {
			return id + " " + startTime +"시~" + endTime +"시 " + getLength() + "시간";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getStartTime() {
			return startTime;
		}

		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}

		public int getEndTime() {
			return endTime;
		}

		public void setEndTime(int endTime) {
			this.endTime = endTime;
		}
}

	public static void main(String[] args) {
		System.out.println("hw4_1 : 손예진");			
		Random random = new Random();
		int n = 10;
				
		// Reservation형의 n크기의 배열 생성
		Reservation [] array = new Reservation[n];
				
		// 예약 번호는 1, 2, 3..., 시작시간, 종료시간은 랜덤 값인 예약 객체를 n개 생성하여 배열에 저장
		for(int i=1; i<=array.length; i++) {
			// 시작시간 1~5 랜덤 생성
			int startTime = random.nextInt(5)+1;
			// 종료시간 랜덤 생성 (6:최대값 startTime 최소값, 0 연산으로 나올 개수 조정, 난수 산출 후 +1로 shift)
			int endTime = random.nextInt(6-startTime) + startTime +1; // +1이 없으면 0-startTime 난수 생성
			array[i] = new Reservation((i+1),startTime,endTime);
		}
				
		// n개의 예약 각각에 대해 시작시간, 종료시간, 길이를 출력
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].toString());
		}
		
		// 예약 길이를 기준으로 오름차순 정렬
//		countingSort(list);
		
		// 정렬된 n개의 예약 각각에 대해 시작시간, 종료시간, 길이를 출력
		System.out.println("길이 오름차순 정렬 결과 = ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
		
	// Reservation형 배열을 매개변수로 받아 예약 길이(1~5시간)을 기준으로 오름차순 정렬
	private static void countingSort(Reservation[] list) {
	}
}
