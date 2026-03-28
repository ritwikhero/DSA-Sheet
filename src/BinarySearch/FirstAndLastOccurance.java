package BinarySearch;

import java.util.*;

// provides last-occurrence logic
class Solution {
    // find last index of key by scanning from right
    public int solve(int n, int key, List<Integer> v) {
        // initialize result as not found
        int res = -1;
        // scan from the end toward the start
        for (int i = n - 1; i >= 0; i--) {
            // update and stop when match found
            if (v.get(i) == key) {
                res = i;
                break;
            }
        }
        // return index or -1
        return res;
    }
}

// separate main class (as requested)
public class Main {
    // program entry
    public static void main(String[] args) {
        // set size
        int n = 7;
        // set key to search
        int key = 13;
        // define input list
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        // compute answer
        Solution sol = new Solution();
        int ans = sol.solve(n, key, v);
        // print last occurrence index (or -1)
        System.out.println(ans);
    }
}
