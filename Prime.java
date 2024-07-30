public class Prime {
    public static void main(String[] args) {
        int x=15;
        int temp=~x;


        for(int i=2;i<x;i++){

            if((x)%i == 0){
                System.out.println(x+":Not a prime");
                break;
            }else if(x==i+1 && ((x%(i+1) == 0))) {
                System.out.println(x+": a prime");
            }
        }




    }
}
