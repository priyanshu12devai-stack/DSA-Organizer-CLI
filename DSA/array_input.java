package DSA;

import java.util.*;

public class array_input {
    private int[] array;
    private int size;

    public array_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        this.size= sc.nextInt();
        this.array= new int[size];

        System.out.println("enter the" +" "+ size +" "+ "elements:");
        for(int i =0 ; i<size ; i++){
            array[i]= sc.nextInt();
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }
    int cnt = 0;
    public void swap(int i , int j){
        cnt++;
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;

    }
    public static void reversePart(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void display(){
        System.out.print("Array: [ ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("]");
        System.out.println("Number of swaps done:"+" "+cnt);
    }
}
