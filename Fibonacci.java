public class Fibonacci {

    public static void main(String[] args) {

        int init =0;
        int res;
        int temp=1;
        System.out.print(init+" "+temp);

        for(int i=2;i<10;i++){
            res = init+temp;
            init=temp;
            temp=res;
            System.out.print(" "+res);
        }
    }
}
