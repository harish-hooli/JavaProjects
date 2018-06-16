package BasicJava;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteArraytoFile {
	public static void main(String[] args){
		BufferedOutputStream bos = null;
		String outputfile = "C:/Harish/temp/OutputFile.txt";
		try{
			
			FileOutputStream fos = new FileOutputStream(new File(outputfile));
			bos = new BufferedOutputStream(fos);
			 
			String str = "Out to file as an example";
			
			//write to file
			bos.write(str.getBytes());
			
			System.out.println("File written");
			
		}
	    catch(FileNotFoundException fnfe)
	    {
	            System.out.println("Specified file not found" + fnfe);
	    }
	    catch(IOException ioe)
	    {
	            System.out.println("Error while writing file" + ioe);
	    }
		finally 
		{
			if(bos != null)
			{
				try{
					bos.flush();
					bos.close();
				}
				catch (IOException ioe){
					System.out.println("Error while writing file" + ioe);
				}
			}
		}
}
}
