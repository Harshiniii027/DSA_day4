package DAY4;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner (System.in);
        System.out.println("ROW1: ");
        int row1=scan.nextInt();
        System.out.println("COL1: ");
        int col1=scan.nextInt();

        int[][] A = new int[row1][col1];

        System.out.println("Enter the  array-->A Elements: ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                A[i][j]=scan.nextInt();
            }
        }

        
        System.out.println("ROW2: ");
        int row2=scan.nextInt();
        System.out.println("COL2: ");
        int col2=scan.nextInt();

        int[][] B = new int[row2][col2];

        System.out.println("Enter the array-->B Elements: ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                B[i][j]=scan.nextInt();
            }
        }

        int[][] C = new int[row1][col2];

        if(row1!=col2)
        {
            System.out.println("Multiplication Not Possible: ");
        }
        else
        {
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    for(int k=0;k<col1;k++)
                    {
                        C[i][j] +=A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("Multiplied Array: ");
            for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<C[i].length;j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        }

         
    }
    
}
