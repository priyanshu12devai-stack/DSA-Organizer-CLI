/*
@Problem = Intersection and union of the two sorted arrays
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 9
*/
package DSA.arrayProbs;

import DSA.array_input;
// Intersection and Union of the two sorted arrays
import java.util.ArrayList;

public class array_9_E {

    public static void Union(int[] arr1, int[] arr2, int n1, int n2) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.getLast() != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else {
                if (Union.size() == 0 || Union.getLast() != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;

            }
        }
        while (i < n1) {
            if (Union.size() == 0 || Union.getLast() != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (Union.size() == 0 || Union.getLast() != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        System.out.println("Union of two arrays is : " + Union);

    }
    public static void intersection(int[] arr1, int[] arr2, int n1, int n2){
        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while(i<n1 && j < n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if (arr2[j]<arr1[i]) {
                j++;
            }
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }

        }
        System.out.println("intersection of two arrays is : " + intersection);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 4, 5, 6, 7, 7};
        int[] arr2 = {4, 4, 5, 5, 6, 7, 8, 9, 10, 11, 15, 15};
        int n1 = arr1.length;
        int n2 = arr2.length;
        Union(arr1, arr2, n1, n2);
        intersection(arr1,arr2,n1,n2);


    }

}





