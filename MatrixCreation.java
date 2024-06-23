import java.util.Scanner;

public class MatrixCreation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of col:");
        int col= sc.nextInt();

        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //String name = in.nextLine();
        int row = in.nextInt();
        System.out.println("Name is: " + row);
        in.close();*/

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.println("Enter the number:");
                arr[i][j] = sc.nextInt();
                //System.out.print(arr[i][j]+"\t");
            }

        }

        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();}
    }
}
