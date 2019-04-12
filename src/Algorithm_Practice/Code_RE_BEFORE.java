package Algorithm_Practice;
// 객체지향에서 메소드의 분리 조건은 유지보수, 즉 수정 이슈가 같을 때.
// 수정 이슈가 다를 경우 메소드는 분리해야 한다.
// 주석으로 달 내용을, 주어 동사 목적어 등을 객체화. 주석 없이도 코드를 읽을 수 있도록
// -->단위 기능 추출=리팩토링
import java.util.Random;
import java.util.Scanner;

public class Code_RE_BEFORE {
	static Random r=new Random();
	static Scanner s=new Scanner(System.in);
	static class Car {
		private final String name;
		private int position =0;
		public Car (String name) {
			this.name=name;
		}
		public void print() { 
			System.out.print(name+": ");
			for(int j=0;j<=position;j++) System.out.print("-"); 
		}
		public void run() {
			int isRun=r.nextInt(10)>3 ? position++ : 0;
			print();
		}
		public int getPosition() { return position; }
		public String getName() { return name; }
	}

	public int getMax(Car[] cars) {
		int max=0;
		for(Car c:cars) max=max<c.getPosition() ? c.getPosition():max;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("input Car name(sep by ','):");
		String carn=s.nextLine();
		String[] carns=carn.split(",");
		Car[] cars=new Car[carns.length];
		for(int i=0;i<cars.length;i++)
			cars[i]=new Car(carns[i]);
		System.out.println("input count:");
		int n=s.nextInt();
		System.out.println("\nresult:");
		int max=0;
		for (int i=0;i<n;i++) {
			for(Car c:cars) {
				c.run();
				System.out.println();
				if (c.getPosition()>max) max=c.getPosition();
			}
			System.out.println();
		}
		boolean first=true;
		for(Car c:cars) {
			if(c.getPosition()==max) {
				if(!first) System.out.print(",");
				System.out.print(c.getName());
				first=false;
			}
		}
		System.out.print(" is Winner.");
	}

}
