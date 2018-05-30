import java.util.*;
public class Lab4 {
	public static void main(String args[] ) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		int count = 0;
    		for(int i = 1; i < n; i+=2) {
    			if(isPrime(i)) 
    				count++;
    		}
    		System.out.print(count);
    	}
    
    	public static boolean isPrime(int n) {
        	for(int i = 2; i <= Math.sqrt(n); i++) {
         	   if(n % i == 0) 
         		   return false;
        	}
       	 	return true;
    	} 
}
