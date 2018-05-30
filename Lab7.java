import java.util.Scanner;
public class Lab7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	    
		Stack st = new Stack(1000);
	    String t = scan.nextLine();
	    String line[] = t.split(" ");
	    
	    while(!line[0].equals("Arrived")){
	        if(line[1].equals("Back")){
	            st.pop();
	        }
	        else{
	            st.push(line[1]);
	        }
	        line = scan.nextLine().split(" ");
	    }
	    while(!st.isEmpty()){
	        String s = st.pop();
	        if(s.equals("North")) System.out.println("Go South");
	        else if(s.equals("South")) System.out.println("Go North");
	        else if(s.equals("West")) System.out.println("Go East");
	        else if(s.equals("East")) System.out.println("Go West");
	    }
	 }
}

class Stack {
	
	int maxSize; 
	String[] stackArray;
	int top; 

	public Stack(int s) {
		maxSize = s; 
		stackArray = new String[maxSize]; 
		top = -1; 
	}
	
	public void push(String j){
		stackArray[++top] = j; 
	}

	public String pop() {
		return stackArray[top--]; 
	}

	public String peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize-1);
	}
}


