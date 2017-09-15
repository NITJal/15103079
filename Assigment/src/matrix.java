//java program to multiply two given matrix
import java.util.*;
import java.lang.*;

public class matrix {
	public static void main(String[] args)
	 {
		int x1,y1,x2,y2;
		System.out.print("enter the number of rows and column of first matrix  = ");

		Scanner sc=new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("enter the number of rows and column of second matrix  = ");
		x2=sc.nextInt();
		y2=sc.nextInt();
		if(y1!=x2)
		{
			System.out.print("matrix can not be multiplied ");
			return;
		}
		int arr1[][]=new int[x1][y1];
		int arr2[][]=new int[x2][y2];
		int arr3[][]=new int[x1][y2];
		
		System.out.print("enter the containt of first matrix = ");
		for(int i=0;i<x1;i++)
			{for(int j=0;j<y1;j++)
			arr1[i][j]=sc.nextInt();
			System.out.println("");
			}
		System.out.print("enter the containt of second matrix = ");
		for(int i=0;i<x2;i++)
			{for(int j=0;j<y2;j++)
			arr2[i][j]=sc.nextInt();
			System.out.println("");
			}
	
		for(int i=0;i<x1;i++)
			for(int j=0;j<y2;j++)
				for(int k=0;k<y1;k++)
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
		for(int i=0;i<x1;i++)
			{for(int j=0;j<y2;j++)
				System.out.print(arr3[i][j]+"  ");
			System.out.println(" \n");
			}
	 } 

}
