package BinarySearch;
import java.util.*;

public class SingleAmongDouble {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};

        int ans = binarySearch(arr, arr.length);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int n){
        int left = 0, right = n-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid % 2 == 0){
                if(arr[mid] == arr[mid+1]){
                    left = mid+2;
                }
                else{
                    right = mid;
                }
            }
            else{
                if(arr[mid] == arr[mid-1]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return arr[left];
    }
}
