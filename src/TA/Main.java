package TA;

public class Main {
    static class MyMaxHeap {
        private int[] array;    // 최대힙 원소를 저장할 배열
        private int n;          // 최대힙에 저장된 원소 수


        public MyMaxHeap(int capacity) {   // 용량이 capacity인 공백 최대힙을 생성
            n = 0; // 빈 배열이므로 n=0으로 초기화
            array = new int[capacity]; // 받은 크기의 배열 생성
        }

        public void add(int item) {        // 매개변수로 받은 원소 item을 최대힙에 삽입

            array[n++] = item;
            while ((n != 1) && (item > array[n / 2])) {
                Swap(array[n], array[n / 2]);
            }
        }

        private void Swap(int i, int j) {

        }

        public void print() {               // 배열의 내용을 확인하기 위해 배열 원소들을 차례대로 한 줄에 출력
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");    // 원소와 공백 출력
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("hw9_1 : 김서연");

        // 입력할 원소들을 저장한 데이터 배열
        int[] dataArray = {3, 2, 5, 7, 4, 8, -1, 0, 5, 9};

        // 입력할 원소 수와 같은 용량의 공백 최대힙을 생성
        MyMaxHeap heap = new MyMaxHeap(dataArray.length);

        // 데이터 배열에 저장된 원소를 최대힙에 하나씩 삽입한 후, 힙 내용 출력
        for (int item : dataArray) {
            heap.add(item);
            heap.print();
        }
    }
}

//정수 배열로 구현한 최대힙 클래스
