package projectEuler;

public class Problems1to10 {

	public static int problem1(int div1, int div2, int max) {
	// sum of all the multiple of div1 and div2 below the max value.
			int sum=0;
			for(int i=1; i<max; i++){
				if (i%div1==0) 	sum += i;
				else if (i%div2==0) sum += i;	
			}
	
			//System.out.println("The sum is:" +sum+".\n");
			return sum;
	}
}