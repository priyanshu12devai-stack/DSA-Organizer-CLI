/*
@Problem = left rotate array by k
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 6
*/
package DSA.arrayProbs;
import DSA.array_input;

public class array_6_E {
    public static class prob_6 extends array_input{
        // left rotate an array by K (brute)
        public void left_rotate(int d){
            int [] arr= getArray();
            int n = getSize();
            int [] temp = new int[d];
            for(int i = 0 ; i < d ; i++){
                temp[i]=arr[i];
            }
            for(int i=d; i<n; i++){
                arr[i-d]=arr[i];
            }
            int j= 0;
            for(int i = n-d; i<n ; i++){
                arr[i]=temp[j];
                j++;
            }
            display();
        }

        // left rotate an array by K (optimal)
        public void left_rotate_1(int d){
            int [] arr = getArray();
            int n= getSize();
            d%=n;
            reversePart(arr,0,n-1);
            reversePart(arr,0,d-1);
            reversePart(arr,d,n-1);

            display();

        }

        public void right_rotate_K(int d){
            int [] arr = getArray();
            int n= getSize();
            reversePart(arr,0,n-1);
            reversePart(arr,0,d-1);
            reversePart(arr,d,n-1);
            reversePart(arr,0,n-1);
            reversePart(arr,0,n-1);
            display();
        }
        public static void main(String[] args) {
            prob_6 obj = new prob_6();
            obj.left_rotate_1(3);

            }

    }
}
