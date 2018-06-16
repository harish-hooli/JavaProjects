
public class Factorial {
	public static void main(String[] args){
		final int NUM_FACTS=100;
	
		for(int i=0; i < NUM_FACTS; i++){
			System.out.println(i + "! is " + factorial(i));
		}
	}
	
	public static int factorial(int n){
		int result = 1;
		for (int j=2; j < n; j++ ){
			result *= j; 
		}
		return result;
	}

}
