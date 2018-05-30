import java.util.*;
public class Lab6_Alt {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next()), rank = Integer.parseInt(scan.next());
		HashMap<Integer, String> obj = new HashMap<>();
		int[] grades = new int[n];
		for(int i = 0; i < n; i++) {
			String value = scan.next();
			int key = Integer.parseInt(scan.next());
			obj.put(key,value);
			grades[i] = key;
		}
		Arrays.sort(grades);
		System.out.print(obj.get(grades[n-rank]));
	}
}
