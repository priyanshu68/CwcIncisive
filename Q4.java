import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		int num,c = 0;
		int lastDigit;
		int square ;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  number :" + " ");
		num = sc.nextInt();
		square = num * num;
		temp = num;
		while(temp>0){
			c++;
			temp = temp/10;
			
		}
		lastDigit = square%(int)(Math.pow(10,c));
		 if ( num == lastDigit)
		 {
			 System.out.println("This is an automorphic number.");
		 }
		 else
		 {
			 System.out.println("This is not an automorphic number.");
		 }
		
		
	}

}
