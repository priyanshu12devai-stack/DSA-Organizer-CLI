/*
@Problem = Group Anagram
@Algorithm = Hashing and Charsorting
@Topic = array
@Difficulty = Medium
@Problem_num = 17
*/

/*
Time Complexity O(N.Klogk)
-looping => N iteration
-Sorting => KlogK , for each string of length k and then sort using Arrays.sort()
-Map Operation => O(K)
Space Complexity O(N.K)
*/

package DSA.arrayProbs;
import java.util.*;
public class array_17_M {
    public static List<List<String>> groupAnagram(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(word);

        }
        return new ArrayList<>(map.values());
    }
}
