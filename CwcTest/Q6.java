import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int  max = Math.max(a, Math.max(b, c));
		System.out.println(max);
		

	}

}
