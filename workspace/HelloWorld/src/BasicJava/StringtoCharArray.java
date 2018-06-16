package BasicJava;

public class StringtoCharArray {

	public static void main(String[] args){
		String str = "Hello World";
		char[] chars;
		
		chars = str.toCharArray();
		
		for(int i=0; i < chars.length; i++)
		{
			System.out.println(chars[i]);
		}
	}
	
}
