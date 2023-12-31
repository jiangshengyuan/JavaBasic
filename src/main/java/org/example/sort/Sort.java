package org.example.sort;

public class Sort {
    public static void fast(int[] in, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int left = begin, right = end, point = (begin + end) / 2;
        boolean turn = true;
        while (left < right) {
            if (turn) {
                while (left < point) {
                    if (in[left] > in[point]) {
                        swapTwoValue(in, left, point);
                        point = left;
                        break;
                    } else left++;
                }
                turn = false;
            } else {
                while (right > point) {
                    if (in[right] < in[point]) {
                        swapTwoValue(in, right, point);
                        point = right;
                        break;
                    } else right--;
                }
                turn = true;
            }
        }
        fast(in, begin, point - 1);
        fast(in, point + 1, end);
    }

    private static void swapTwoValue(int[] in, int a, int b) {
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }

    public static void shell(int[] in) {

    }

    public static void bubble(int[] in) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in.length - 1; j++) {
                if (in[j] > in[j + 1]) {
                    swapTwoValue(in, j, j + 1);
                }
            }
        }
    }

    public static void choose(int[] in) {
        int min;
        for (int i = 0; i < in.length; i++) {
            min = i;
            for (int j = i; j < in.length; j++) {
                if (in[min] > in[j]) {
                    min = j;
                }
            }
            swapTwoValue(in, min, i);
        }
    }

    public static void main(String[] args) {
        int[] in = {43, 34, 5, 65, 6, 7, 99, 87, 8, 9, 8, 9, 1232, 234, 4545667, 2, 32, 223, 23, 2, 32, 33, 34, 5, 5};
        for (int i : in) {
            System.out.print(i + ",");
        }
        System.out.println();
//        fast(in, 0, in.length - 1);
        bubble(in);
        for (int i : in) {
            System.out.print(i + ",");
        }
    }
}
