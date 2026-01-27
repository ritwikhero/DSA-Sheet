package BinarySearch;

public class UpperBound {
    int low = 0, high = arr.length - 1;
    int ans = arr.length;  // Default to length if not found

        while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] > x) {
            ans = mid;        // Store current index as potential answer
            high = mid - 1;   // Move left
        } else {
            low = mid + 1;    // Move right
        }
    }
        return ans;  // Return final answer
}
