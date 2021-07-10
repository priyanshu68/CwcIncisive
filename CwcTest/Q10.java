import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0 ;
 
		System.out.print("Enter the number : ");
		n = sc.nextInt();
 
		System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);
 
		sum = n + 11*n + 111*n;
		System.out.println(" = " + sum );
	}

}
