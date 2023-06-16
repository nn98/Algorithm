package Algorithm_Practice._School.TA;

public class Hw9_1 {
    static class MyMaxHeap {

        private int[] array; // 최대힙 원소를 저장할 배열
        private int n; // 최대힙에 저장된 원소 수

        public MyMaxHeap(int capacity)
        {
            array = new int[capacity];
            n = 0;
        }

        public void add(int item)
        {
            int x = n -1;
            int y = x - 1 / 2;
            //i = n -1   i-1 = / 2 부모노드 알기 부모랑 비교 부모보다 크면 안됨 크면 자리 바꾸기 부모노드가 0일때까지 비교
//            while (x =<  )
            array[n++] = item;
        }

        public void print()
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }


    }

    public static void main(String [] args)
    {
        System.out.println("HW9_1 : 홍성산");

        // 입력 할 원소들을 저장한 데이터 배열
        int[] dataArray = {3, 2, 5, 7, 4, 8, -1, 0, 5, 9};

        //입력할 원소 수와 같은 용량의 공백 최대 힙을 생성
        MyMaxHeap heap = new MyMaxHeap(dataArray.length);

        //데이터 배열에 저장된 원소를 최대 힙에 하나 씩 삽입 한 후, 힙 내용 출력
        for(int item : dataArray)
        {
            heap.add(item);
            heap.print();
        }
    }


}

