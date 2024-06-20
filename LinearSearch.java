public class LinearSearch {

    public static void main(String[] args) {
         int arr[] = {5,6,7,8,9};
         int target = 5;
            target= binarySearch(arr,target);
        System.out.println("Target:" + target);


    }

    public static int linearSearch(int arr[], int target) {
        int step = 0;

        for (int i = 0; i < arr.length; i++) {
            step++;
            if (arr[i] == target) {
                target = arr[i];
            }
        }
        System.out.println("Target:" + target);
        System.out.println("number of times:" + step);
        return target;
    }

    public static int binarySearch(int arr[], int target) {
        int step = 0;

        int left = 0;
        int right = arr.length-1;


        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
               return target;
            }else if(arr[mid] < target){
                left = mid+1;
            }else{
                right=mid-1;
            }
        }


        return target;
    }
}
