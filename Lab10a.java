import java.util.Scanner;

public class Lab10a {
	
	public static void main(String args[] ){
		
		Scanner myscanner = new Scanner(System.in);

		int y = myscanner.nextInt();

        double i = myscanner.nextDouble();

        double x = myscanner.nextDouble();

        System.out.println(String.format( "%.2f", compound(y,i,x)));

    }
	
	//only the method was required for this lab, the main method was provided by Phil
	
    public static double compound(int y, double i, double x){   
    	if(y == 0)
    		return x;
    	double factor = (i/100) + 1;
    	int one = y-1;
    	double two = i;
    	double three = x;
    	return (factor*compound(one, two, three));
    }
}
