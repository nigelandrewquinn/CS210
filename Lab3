import java.util.*;
public class Lab3 {
	public static void main(String args[] ){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
        	array[i] = scan.nextInt();
        }
        int record = 0;
        int mode = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(array[i] == array[j])
                    count++;
            }
            if(count > record){
                record = count;
                mode = array[i];
            }
        }
        System.out.print(mode);
    }
}
