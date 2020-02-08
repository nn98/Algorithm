package BaekJoon;
//https://www.crocus.co.kr/980
import java.util.Scanner;

public class P7806_C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m;
		while(s.hasNext()) {
			n=s.nextInt();
			m=s.nextInt();
			long tmp = m;
			long ans = 1;
			for (int i = 2; i*i <= tmp; i++)
			{
				int powM = 0;
				// m에 i가 몇개 들어있는지 확인
				while(m % i == 0)
				{
					m /= i;
					powM += 1;
				}

				// i가 1개이상 들어있다면
				if (powM>0)
				{
					int powN = 0;
					// n에는 i가 몇개 있는지 확인
					for (int j = i; j <= n; j *= i)
						powN += n / j;

					// powN와 powM는 서로 m과 n의 지수승을 의미(m^powN , n^powM)
					// 따라서 작은것을 따라감
					for (int j = 0; j < Math.min(powN, powM); j++)
						ans *= i;
				}

				if(m < i)
					break;
			}

			if (m > 1 && m <= n)
				ans *= m;
			System.out.println(ans);
		}
	}
}