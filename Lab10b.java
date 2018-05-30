import java.util.Scanner;
public class Lab10b {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), ans = Integer.MIN_VALUE;
		if(a < 0)
			a = ~a;
		if(b < 0)
			b = ~b;
		if((a & b) > ans) 
			ans =  (a & b);
		if((a ^ b) > ans) 
			ans =  (a ^ b);
		if((a | b) > ans) 
			ans =  (a | b);
		System.out.println(ans);
	}
}
