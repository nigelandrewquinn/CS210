import java.io.*;
import java.util.*;
public class Lab2 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[scan.nextInt()];
		for(int i = 0; i < array.length; i++) 
			array[i] = scan.nextInt();
		Arrays.sort(array);
		int x = scan.nextInt();
		System.out.print(array[array.length-x]);
	}
}
