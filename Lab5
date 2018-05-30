import java.util.*;
public class Lab5{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tosses = scan.nextInt(), heads = scan.nextInt(),big=1000000;
        double count = 0;
        for(int i=0;i<big;i++){
            int temp = 0, row=0;
            for(int j=0;j<tosses;j++) {
                if(Math.random()>.5) {
                	temp++;
                    if(temp>row)
                    	row=temp;
                }
                else
                	temp=0;    
            }
            if(row>=heads)
                count++;
        }
        System.out.println(Math.round(count*100/big));
    }
}
