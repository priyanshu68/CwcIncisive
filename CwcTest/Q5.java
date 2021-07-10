import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
	 int n,c=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of elements  :");
	n = sc.nextInt();
	int [] array = new int[n];
	System.out.println("enter the elements of array :");
	for (int i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
		
	}
	for (int i =0;i<n-1;i++)
		
	{
		for (int j = i ;j<n;j++)
		{
			if (i<j && array[i]>array[j])
			{
				c++;
			}
			
			}
	  }
	  System.out.println("The number of inversions are :" +c);
	}
	

}
