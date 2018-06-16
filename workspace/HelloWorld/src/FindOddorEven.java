
public class FindOddorEven {

	public static void main (String[] args){
	//create array of numbers
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i < numbers.length ; i++)
			if((numbers[i]%2) == 0)
					System.out.println(numbers[i] + "Even numbers");
				else 
					System.out.println(numbers[i] + "Odd numbers");
		}
	}

	
