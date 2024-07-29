public class StarShape {

    public static void main(String[] args){
/*
        for(int j=0;j<=5;j++) {
            for (int i = 0; i <= 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            System.out.println();
        }

        for(int j=0;j<=5;j++) {
            for (int k = j; k <= 5; k++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
//Full Rhombus
 //Rhombus half
        for(int i=0;i<=5;i++){

            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=4;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
