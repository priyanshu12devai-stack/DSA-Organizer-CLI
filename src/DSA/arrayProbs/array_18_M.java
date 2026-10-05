

/*
@Problem = Top K frequent element
@Algorithm = BucketSort
@Topic = array
@Difficulty = Medium
@Problem_num = 18
*/

//Explaination

/*
Input array : nums = [1,1,1,2,2,3,3,3,3]
k : 2
length(N)

Step 1: Count element Frequencies
using hashmap
1 apprears 3 times
2 appears 2 times
3 appears 4 times

Step2: Place numbers into frequency buckets
Step3: Collect top k element from right to left
 */

package DSA.arrayProbs;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class array_18_M {
    public int[] topKFrequent(int[] nums , int k ){
        int N = nums.length;
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num  : nums){
            frequencyMap.put(num , frequencyMap.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List[N+1];
        for( int key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(buckets[frequency]== null){
                buckets[frequency]= new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        int[] result = new int[k];
        int resultIndex = 0 ;
        for(int i = N ; i>=1 && resultIndex < k ; i--){
            if(buckets[i]!=null){
                for(int num : buckets[i]){
                    result[resultIndex++]=num;
                    if(resultIndex == k ){
                        return result;
                    }
                }
            }
        }
        return result;
    }

        public static void main(String[] args) {
            int[] nums = {1,2,2,3,3,3};
            array_18_M obj = new array_18_M();
            int[] result = (obj.topKFrequent(nums , 2));
            for(int i = 0 ; i < result.length ; i++){
                System.out.println(result[i]);
            }
        }


}
