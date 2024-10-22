package DAY4;

import java.util.Scanner;
//WAVE TRAVERSAL
public class WaveTraverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int j=0;
        System.out.println("ROWS :");
        int row=scan.nextInt();
        System.out.println("COL : ");
        int col = scan.nextInt();

        System.out.println("Enter Array Elements:");
        int arr[][]=new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int k=0;k<col;k++)
            {
                arr[i][k]=scan.nextInt();
            }
        }

        System.out.println("Array Elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int h=0;h<arr[i].length;h++)
            {
                System.out.print(arr[i][h] + " ");
            }
            System.out.println();
        }

        System.out.println("Element After the Operation:" );
        while(j<col)
        {
            if(j%2==0)
            {
                for(int i=0;i<row;i++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for(int i=(row-1);i>=0;i--)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            j++;
        }
scan.close();

    }
    
    
}
