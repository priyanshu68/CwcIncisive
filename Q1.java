import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		int [] array = new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++)
		{
			array [i] = sc.nextInt();
		}
		System.out.println("the array before swaping  is=");
		for (int i = 0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
		
		int count =0 ;
			  for ( int i = 0; i <array.length - 1;i++)
			  { 
				  int minInd = i; 
				  for (int j=i;j<array.length;j++) 
				  { 
					  if ( array[j]<array[minInd] ) 
					  { 
						  minInd = j;
						  count++;
						  } 
					  }
			 
			 int temp = array[i]; 
			 array[i]= array[minInd];
			 array[minInd]= temp;
			  
			   }
		System.out.println();	
      System.out.println(count);
      System.out.println("the array after swaping is=");
      
      for (int i=0;i<n;i++)
      {
    	  System.out.print(array[i] +" ");
      }
	}
}


