import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		int n;
		int sum;
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of terms :");
       n = sc.nextInt();
       for(int i = 0;i<n;i++)
       {
    	   sum = a+b+c;
    	   System.out.print(a +" ");
    	   a=b;
    	   b=c;
    	   c=sum;
    	   
    	   
       }
	}

}
