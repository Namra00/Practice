import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bro = new BufferedReader(
				new FileReader("D:\\IMCS_Training\\TestFolder\\file2.txt"));
		BufferedWriter bwo = new BufferedWriter(
				new FileWriter("D:\\IMCS_Training\\TestFolder\\file1.txt"));
		int count = 2;
		String line;
		while ((line = bro.readLine()) != null && count>0)
		{
			bwo.write(line);
			bwo.write('\n');
			count--;
		}
		System.out.println("File copied!");
		bwo.close();
		bro.close();
	}
}