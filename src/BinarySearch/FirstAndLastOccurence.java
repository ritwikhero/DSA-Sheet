package BinarySearch;

public class FirstAndLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int first = firstPos(nums,nums.length,target);
        int last = lastPos(nums,nums.length,target);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    public int firstPos(int[] a, int n, int t){
        int left = 0, right = n-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right- left)/2;

            if(a[mid] == t){
                ans = mid;
                right = mid-1;
            }
            else if(a[mid] < t){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return ans;
    }
    public int lastPos(int[] a, int n, int t){
        int left = 0, right = n-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right- left)/2;

            if(a[mid] == t){
                ans = mid;
                left = mid+1;
            }
            else if(a[mid] < t){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return ans;
    }

}
