package BaekJoon._Before_Tagging;

import java.util.*;

public class P1911_C {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // �� ������ ����
        int L = sc.nextInt(); // �κ��� ����

        Hole[] holes = new Hole[N];

        for (int i = 0; i < N; i++) {
            holes[i] = new Hole(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(holes, new Comparator<Hole>() { // start�� �������� ����
            @Override
            public int compare(Hole h1, Hole h2) {
                if (h1.start > h2.start) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        int boardCount = 0;
        int start = 0;

        for (int i = 0; i < N; i++) {

            start = Math.max(start, holes[i].start); // �κ����� ���� �������� �������� �Ѿ����� ���� �ʾҴ��� Ȯ��
            int t = 0; // i��° �����̸� ���� ���ؼ� �ʿ��� �κ����� ����
            while (t < holes[i].end - start) {
                t += L;
            }
            boardCount = boardCount + t / L; // t/L�� �ϸ� �ʿ��� �κ����� ���̰� ����
            start += t; // start���� �κ����� ���̸�ŭ +
        }
        System.out.println(boardCount);
    }
}

class Hole {
    int start;
    int end;

    Hole(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(int start) {
        this.start = start;
    }
}