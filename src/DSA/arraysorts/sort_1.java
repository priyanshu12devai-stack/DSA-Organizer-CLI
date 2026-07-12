/*
@Problem = Bubble, selection , insertion
@Algorithm = -
@Topic = sorting
@Difficulty = Medium
@Problem_num = sort_1
*/
package DSA.arraysorts;

import DSA.array_input;

public class sort_1 {
    public static class selection_sort extends array_input {
        public void sorting() {
            int[] arr = getArray();
            int n = getSize();
            for (int i = 0; i < n; i++) {
                int min = i;
                for (int j = i + 1; j < n - 2; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    public static class bubble_sort extends array_input {
        public void sorting() {
            int[] arr = getArray();
            int n = getSize();
            int cnt = 0;
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        cnt++;
                        swap(j,j+1);
                    }
                }
                if (cnt == 0) {
                    System.out.println("array is already sorted");
                    break;
                }
            }
        }
    }
    public static class insertion_sort extends array_input{
            public void sorting() {

                int[] arr = getArray();
                int n = getSize();
                for (int i = 0; i < n; i++) {
                    int j = i;
                    while (j > 0 && arr[j - 1] > arr[j]) {
                        swap(j - 1, j);
                        j--;
                    }

                }
            }


    }

    public static void main(String[] args){
        bubble_sort ss = new bubble_sort();

        System.out.println("\nOriginal array:");
        ss.display();


        ss.sorting();

        System.out.println("\nFinal sorted array:");
        ss.display();
    }

    }
}
