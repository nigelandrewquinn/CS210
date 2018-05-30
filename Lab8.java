import java.util.Scanner;
public class Lab8 {    
	public static void main(String args[] ) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Queue PriorityQueue = new Queue(n);
        for (int i = 0; i < n; i++){
            String input = scan.nextLine();
            if (input.equals("REMOVE"))
            	PriorityQueue.remove();
            else
            	PriorityQueue.insert(input.split(" ")[1]);              
        }
        System.out.println(PriorityQueue.peekFront());
    }
}

class Queue{
    private int maxSize;
    private String[] queArray;
    private int nItems;
 
    public Queue(int s) {       
        maxSize = s;
        queArray = new String[maxSize];
        nItems = 0;
    }

    public void insert(String item) {         
        if(nItems==0){                 
            queArray[0] = item;          
        }
        else{       
            int j = nItems;   
            while(j > 0 && bigger(queArray[j-1],item)){  
                queArray[j] = queArray[j-1];
                j--;              
            }
            queArray[j] = item;      
        }
        nItems++;                    
    }

    public boolean bigger(String one, String two){
        if (one.length()<two.length())
            return true;
        else if (one.length()==two.length()&&one.compareTo(two)<0)
            return true;
        return false;
    }

    public String remove() {         
        if(!isEmpty()){
            String temp = queArray[nItems];
            nItems--;                      
            return temp;
        }
        else
            return null;
    }
    
    public String peekFront(){    
        if(!isEmpty())
            return queArray[nItems-1];
        else
            return null;
    }     

    public boolean isEmpty() {   
        return (nItems==0);
    }     

    public boolean isFull() {   
        return (nItems==maxSize);
    }     
    
    public int size() {     
        return nItems;
    }
}
