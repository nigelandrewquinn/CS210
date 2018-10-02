import java.io.*;
public class Lab1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int total = 0;
		for(int i = 0; i < s.length()-1; i++){
			int digit = Integer.parseInt("" + s.charAt(s.length()-i-2));
			if(i%2 == 0)
				digit = digit*2;
			if(digit > 9)
				digit = digit-9;
			total += digit;
		}
	        if((total + Integer.parseInt("" + s.charAt(s.length()-1))) % 10 == 0)
	            bw.write("VALID");
	        else
	        	bw.write("INVALID");
	        bw.flush();
	}
}
