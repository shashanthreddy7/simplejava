public class MinOfArray {

    public static void main(String[] args) {
        int[] x = {3,1,4,2,0};
        int x1[] = new int[x.length];
        int min = x[0];
        for(int i=0; i<x.length;i++){
            if(i<x.length-1) {
                if (min < x[i + 1]) {
                    min = x[i + 1];
                    x1[i] = min;
                }
            }
        }System.out.println("Min:"+min);
    }
}
