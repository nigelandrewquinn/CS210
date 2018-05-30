import java.util.*;
public class Lab6 {
    public static void main(String args[] ){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next()), rank = Integer.parseInt(scan.next());
        String[] names = new String[n];
        int[] grades = new int[n];
        for(int i = 0; i < n; i++) {
        	names[i] = scan.next();
        	grades[i] = Integer.parseInt(scan.next());
        }
        for(int a = 0; a < grades.length; a++) {
            for(int b = a+1; b < grades.length; b++) {
                if(grades[a] > grades[b]) {
                    int temp = grades[a];
                    String temps = names[a];
                    grades[a] = grades[b];
                    names[a] = names[b];      
                    grades[b] = temp;
                    names[b] = temps;
                }
            }
        }
        System.out.print(names[n-rank]);
    }
}
