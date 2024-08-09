public class BubbleSort {

    public static void main(String[] args) {
        int a[] = {5,3,1,7,2};//{1,2,3,5,7}
        //Arrays.sort(a);
        //Before sorting
        System.out.println("Before sorting");
        for(int num: a){
            System.out.print(num+" ");
        }
        int temp = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }

System.out.println("After sorting");
        for(int num: a){
            System.out.print(num+" ");
        }

    }

}