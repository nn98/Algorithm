package TA;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hw11_1 : 이민우");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];

        for(int i = 0; i<n; i++) {
            array[i] = scanner.next();
        }

        scanner.close();
        insertionSort(array);
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertionSort(String[] array) {
        int i, j;
        String item;

        for(i = 1; i< array.length; i++) {
            item = array[i];
            for(j=i; (j>0)&&(0 < array[j-1].compareTo(item)); j--) {
                array[j] = array[j-1];
                System.out.println(Arrays.toString(array));
            }
            array[j] = item;
        }
    }
}
