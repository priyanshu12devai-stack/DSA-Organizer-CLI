/*
@Problem = Move zeroes
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 7
*/
package DSA.arrayProbs;
import DSA.array_input;

import java.util.Arrays;

public class array_7_E {
    public static class prob_7 extends array_input {
        //by myself
        //cons : uses more swaps
        public void Move_zeroes_1() {
            int[] arr = getArray();
            int n = getSize();
            int i = 0;
            int j = 0;
            while (i != n - 1) {
                if (arr[i] != 0) {
                    i++;
                    j++;
                } else if (arr[i] == 0) {
                    while (arr[j] == 0 && j < n - 1) {
                        j++;
                    }
                    swap(i, j);
                    i++;
                    j = i;
                }
            }
            display();
        }

        public void Move_zeroes_3() {
            int[] nums = getArray();
            int n = getSize();
            int i = 0;
            int j = 0;

            while (j < n) {
                if (n == 1) {
                    System.out.println("Array is of length 1");
                    break;
                } else if (nums[i] != 0 && nums[j] != 0) {
                    i++;
                    j++;
                } else if (nums[i] == 0 && nums[j]==0) {
                    j++;
                } else if (nums[i] == 0 && nums[j] != 0) {
                    swap(i,j);
                    i++;
                    j++;
                }
            }

            display();
        }

        //Strivers
        public void Move_zeroes_2() {
            int[] arr = getArray();
            int n = getSize();
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    j = i;
                    break;
                }
            }
            for (int i = j + 1; i < n; i++) {
                if (j != -1 && arr.length != 1 && arr[i] != 0) {
                    swap(i, j);
                    j++;
                }
            }
            display();
        }


    }


    public static void main(String[] args) {
        prob_7 obj = new prob_7();
        obj.Move_zeroes_3();
    }

}

