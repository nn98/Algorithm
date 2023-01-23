package BaekJoon._Before_Tagging;
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
				// m�� i�� � ����ִ��� Ȯ��
				while(m % i == 0)
				{
					m /= i;
					powM += 1;
				}

				// i�� 1���̻� ����ִٸ�
				if (powM>0)
				{
					int powN = 0;
					// n���� i�� � �ִ��� Ȯ��
					for (int j = i; j <= n; j *= i)
						powN += n / j;

					// powN�� powM�� ���� m�� n�� �������� �ǹ�(m^powN , n^powM)
					// ���� �������� ����
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