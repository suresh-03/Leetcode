public class _34_firstLastPosOfSortArray {
    // Binary Search
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums,target,true);
        int rightIndex = binarySearch(nums,target,false);

        if(leftIndex <= rightIndex) return new int[]{leftIndex,rightIndex};
        return new int[]{-1,-1};

    }

    public int binarySearch(int nums[],int target, boolean leftIndex){
        int start = 0;
        int end = nums.length-1;
        int index = -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                index = mid;
                if(leftIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return index;
}
// Two Pointer
public int[] searchRange2(int[] nums, int target) {
    int start = 0;
    int end = nums.length-1;
    while(start < end && nums[start] != target ||start < end && nums[end] != target){
        if(nums[start] < target){
            start++;
        }
        if(nums[end] > target){
            end--;
        }
    }
    if(start < nums.length && nums[start] == target && end >= 0 && nums[end] == target)
    return new int[]{start,end};
    return new int[]{-1,-1};
}
}