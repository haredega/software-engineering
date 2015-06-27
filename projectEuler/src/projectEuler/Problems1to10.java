package projectEuler;

public class Problems1to10 {

	public static long[] vet_prob02 = new long[100];	
	
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
	
	//Calculates the n-th number in the fibonacci sequence.
	public static double fibonacci(double arg){
		if (arg==1) return 1;
		else if (arg==2) return 2;
		else return fibonacci(arg-1) + fibonacci(arg-2);

	}

	//calculates the sum of the even VALUED Fibonacci numbers under the max value.
	public static long problem02(long max){
		int i=1;
		vet_prob02[0]=1;
		vet_prob02[1]=2;
		long sum=0;
		
		do{ 
			if(vet_prob02[i]%2==0) sum += vet_prob02[i];
			i++;
			vet_prob02[i]=vet_prob02[i-1]+vet_prob02[i-2];			
		} while(vet_prob02[i]<max);
		i--;
		return sum; //note that if we get i, we can do fibonacci(i)-1 to obtain this value.
		//the same can be easily be proved with the series definition.
	}
	
	public static void problem03(long number){
		/* Instructions for problem 03
		 The prime factors of 13195 are 5, 7, 13 and 29.
		 What is the largest prime factor of the number 600851475143 ?*/
		
		
	}

}
	