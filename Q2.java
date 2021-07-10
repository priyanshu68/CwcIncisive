import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you choice 1-Ascending, 2-Decending ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the size of row");
			System.out.println("Enter the size of col");
			int row=sc.nextInt();
			int col=sc.nextInt();
			int x[][]=new int [row][col];
			System.out.println("Enter the elemnts of the matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					x[i][j]=sc.nextInt();
				}
			}
			System.out.println("Original matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					for(int k=0;k<row;k++)
					{
						for(int l=0;l<col;l++)
						{
							if(x[i][j]<x[k][l])
							{
								int temp=x[i][j];
								x[i][j]=x[k][l];
								x[k][l]=temp;
							}
						}
					}
				}
			}
			System.out.println("Sorted in ascending order matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			break;
			
			
		}
		case 2:
		{
			System.out.println("Enter the size of row");
			System.out.println("Enter the size of col");
			int row=sc.nextInt();
			int col=sc.nextInt();
			int x[][]=new int [row][col];
			System.out.println("Enter the elemnts of the matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					x[i][j]=sc.nextInt();
				}
			}
			System.out.println("Original matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					for(int k=0;k<row;k++)
					{
						for(int l=0;l<col;l++)
						{
							if(x[i][j]>x[k][l])
							{
								int temp=x[i][j];
								x[i][j]=x[k][l];
								x[k][l]=temp;
							}
						}
					}
				}
			}
			System.out.println("Sorted in decending order matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			break;
		}
		default:
			System.out.println("Wrong choice");
		
		
		
		 }
		 
		
	}
}


