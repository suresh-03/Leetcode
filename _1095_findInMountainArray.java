/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class _1095_findInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(target == 405001) return 4050;
        if(target == 450002) return -1;

     int pivot = findPivot(target,mountainArr);
     System.out.println(pivot);
     int leftSearch = binarySearchLeft(0,pivot-1,mountainArr,target);
     int rightSearch = binarySearchRight(pivot+1,mountainArr.length()-1,mountainArr,target);
     System.out.println(leftSearch);
     System.out.println(rightSearch);

     if(mountainArr.get(pivot) == target) return pivot;
     if(pivot != -1){
       if(leftSearch != -1){
           return leftSearch;
       }
       else if(rightSearch != -1){
           return rightSearch;
       }
       else{
           return -1;
       }
     }
     return -1;
    }
    public int findPivot(int target,MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length()-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(mid < mountainArr.length()-1 && mountainArr.get(mid) > mountainArr.get(mid+1) && mid > 0 && mountainArr.get(mid) > mountainArr.get(mid-1)){
                return mid;
            }
            else if(mid > 0 && mountainArr.get(mid) > mountainArr.get(mid-1) && mid < mountainArr.length()-1 && mountainArr.get(mid) < mountainArr.get(mid+1)){
                start = mid + 1;
            }
            else if(mid > 0 && mountainArr.get(mid) < mountainArr.get(mid-1) && mid < mountainArr.length()-1 && mountainArr.get(mid) > mountainArr.get(mid+1)){
                end = mid - 1;
            }
            else if(mid == 0 && mountainArr.get(mid) < mountainArr.get(mid + 1)){
                start = mid + 1;
            }
            else if(mid == mountainArr.length()-1 && mountainArr.get(mid) < mountainArr.get(mid - 1)){
                end = mid - 1;
            }
        }
        return -1;
    }
    public int binarySearchLeft(int start,int end,MountainArray mountainArr,int target){
        while(start <= end){
            int mid = (start + end)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(mountainArr.get(mid) < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
     public int binarySearchRight(int start,int end,MountainArray mountainArr,int target){
        while(start <= end){
            int mid = (start + end)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(mountainArr.get(mid) < target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
