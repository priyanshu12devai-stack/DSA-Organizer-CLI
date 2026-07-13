/*
@Problem = left rotate array
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 5
*/
package DSA.arrayProbs;
import DSA.array_input;

//left rotating the array by one
public class array_5_E {
    public static class prob_5 extends array_input{
        public void left_rotate(){
            int [] arr= getArray();
            int n = getSize();
            int temp =arr[0];
            for(int i = 1;i<n; i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=temp;
            display();

    }

    }

    public static void main(String[] args) {
        prob_5 obj = new prob_5();
        obj.left_rotate();



    }

}
