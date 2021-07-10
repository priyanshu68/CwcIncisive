import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		String temp,reverse = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		temp = str;
		for ( int i = str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The original string is :" +str);	
		System.out.println("The reversed string is :" +reverse);

	}

}
