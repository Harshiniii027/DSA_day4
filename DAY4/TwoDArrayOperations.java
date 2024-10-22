package DAY4;
import java.util.*;
//  ==> TIME COMPLEXITY ==>>> O(N^2)
//  ==> SPACE COMPLEXITY ==>>> O(N^2)
public class TwoDArrayOperations {

    
    public static int MinElement(int[][] arr1) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                if(arr1[i][j] < min)
                {
                    min= arr1[i][j];
                }
            }
        }
        return min;
    }

    
    public static int MaxElement(int[][] arr1) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                if(arr1[i][j] > max)
                {
                    max= arr1[i][j];
                }
            }
        }
        return max;
    }
   

    private static int SumOfElements(int[][] arr1) {
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++ )
            {
                sum=sum+arr1[i][j];
            }
        }
        return sum;
    }



    public static void ModifyArray(int[][] arr1, int i_ind, int j_ind, int new_val) {
        if(i_ind>=0 && i_ind<arr1.length && j_ind>=0 && j_ind<arr1[i_ind].length)
        {
            arr1[i_ind][j_ind]=new_val;
        }
        else
        {
            System.out.println("Invalid index");
        }
    }



    public static void printArray(int[][] arr1) {
        System.out.println("Array Elements are: ");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] InilizeArray(int row, int col) {
        @SuppressWarnings("resource")
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        int [][] arr= new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("ROWS: ");
        int row= scan.nextInt();
        System.out.println("COL: ");
        int col= scan.nextInt();
        
        int arr1[][]=InilizeArray(row,col);

        System.out.println("Enter i index : ");
        int i=scan.nextInt();
        System.out.println("Enter j index : ");
        int j=scan.nextInt();
        System.out.println("Enter new value : ");
        int new_val=scan.nextInt();
        ModifyArray(arr1,i,j,new_val);
        printArray(arr1);

        int  sum = SumOfElements(arr1);
        System.out.println("Sum of array Elements is : " + sum);

        int max = MaxElement(arr1);
        System.out.println("Maximum element is : " + max);

        int min = MinElement(arr1);
        System.out.println("Minimum element is : " + min);

        //scan.close();
    }



    
}
