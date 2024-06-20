import java.util.Arrays;

public class BinearySearchRecursiveAndInbuilt {

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 4, 8};
        int target = 8;
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        target = binarySearch(arr, target, left, right);
        System.out.println("Target found at index::"+target);
    }

    public static int binarySearch(int arr[], int target, int left, int right){
        if(right>=left){
            int mid = left+(right-1)/2;
            if(mid != arr.length){
             if(arr[mid] == target){
                 return mid;
             }else if(arr[mid] < target){
                 left=mid+1;
                 return binarySearch(arr, target, left, right);
             }else{
                 right = mid-1;
                 return binarySearch(arr, target, left, right);
             }}else{
                return mid;
            }
        }
        return -1;
    }
}
