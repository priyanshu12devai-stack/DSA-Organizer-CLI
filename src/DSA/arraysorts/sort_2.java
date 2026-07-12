/*
@Problem = merge , quick
@Algorithm = -
@Topic = sorting
@Difficulty = Medium
@Problem_num = sort_2
*/
package DSA.arraysorts;

import DSA.array_input;

import java.util.ArrayList;

public class sort_2 {

    public static class merge_sort extends array_input {

        public void sorting(int[] arr, int low, int high) {
            if (low >= high) return;

            int mid = (low + high) / 2;
            sorting(arr, low, mid);
            sorting(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

        public void merge(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>();
            int left  = low;
            int right = mid + 1;

            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }

            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }

            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }
    }
    public static class quick_sort extends array_input{
        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
        }

        public void sorting(int [] arr,int low, int high){
            if(low<high){
                int pivot=quick(arr,low,high);
                sorting(arr,low,pivot-1);
                sorting(arr,pivot+1,high);
            }

        }
        public int quick(int [] arr, int low , int high){
            int i = low+1;
            int j=high;
            int pivot=arr[low];
            while(i<=j) {
                while (  i <=high && arr[i] <= pivot) {
                    i++;
                }
                while (  j > low && arr[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    swap(arr,i, j);
                }
            }

                swap(arr,low,j);

            return j;

        }
    }

    public static void main(String[] args) {
        quick_sort obj = new quick_sort();
        int[] array = obj.getArray();
        int low     = 0;
        int high    = obj.getSize() - 1;

        obj.sorting(array, low, high);
        obj.display();
    }
}