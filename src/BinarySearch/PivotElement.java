package BinarySearch;

public class PivotElement {
    public int findPivot(int[] nums,int n){
        int left = 0, right = n-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
