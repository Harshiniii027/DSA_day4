package DAY4;
import java.util.*;
public class TraverseDiffOrder {
///TIME COMPLEXITY ===> O(N)
 
    
    public static void RowWise(int[][] arr) {
        System.out.println("ROW_WISE:");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ColWise(int[][] arr) {
        System.out.println("COL_WISE:");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void PrintArray(int[][] arr) {
        System.out.println("Normal format:");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("ROW : ");
        int rows=scan.nextInt();
        System.out.println("COL : ");
        int cols= scan.nextInt();
        
        int [][] arr = new int [rows][cols]; 

        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        PrintArray(arr);
        RowWise(arr);
        ColWise(arr);

    }

}
