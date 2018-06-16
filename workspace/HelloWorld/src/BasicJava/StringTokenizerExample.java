package BasicJava;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args){
		StringTokenizer str = new StringTokenizer("java|hello world|thanks giving","|",true);
		
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken());
		}
	}
}
